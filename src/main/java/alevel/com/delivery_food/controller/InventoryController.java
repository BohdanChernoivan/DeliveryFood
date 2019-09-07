package alevel.com.delivery_food.controller;

import alevel.com.delivery_food.MainService;
import alevel.com.delivery_food.entity.Inventory;
import alevel.com.delivery_food.entity.repositories.InventoryRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("delivery_food/inventory")
public class InventoryController {

    private final InventoryRepositories inventoryRepositories;
    private final MainService mainService;

    @Autowired
    public InventoryController(InventoryRepositories inventoryRepositories, MainService mainService) {
        this.inventoryRepositories = inventoryRepositories;
        this.mainService = mainService;
    }

    @GetMapping("/addFullInventory")
    public String addFullInvenroty() {

        Inventory inventory;

        List<String> fullNameProducts = new ArrayList<>(mainService.stock.getProducts().keySet());
        List<Integer> fullAvailableProducts = new ArrayList<>(mainService.stock.getProducts().values());

        for (int i = 0; i < fullNameProducts.size(); i++) {
            inventory = new Inventory();
            inventory.setNameDish(fullNameProducts.get(i));
            inventory.setAvailable(fullAvailableProducts.get(i));
            inventoryRepositories.save(inventory);
        }

        return MainService.DONE_SERVICE;
    }

    @PostMapping("/fillInInventory")
    public String fillInInventory(@RequestBody Inventory inventory) {
        Inventory inventoryForFullMenu;

        List<String> fullNameProducts = new ArrayList<>(mainService.stock.getProducts().keySet());

        for (String nameProduct : fullNameProducts) {
            inventoryForFullMenu = new Inventory();
            inventoryForFullMenu.setNameDish(nameProduct);
            inventoryForFullMenu.setAvailable(inventory.getAvailable());
            mainService.stock.getProducts().put(nameProduct, inventory.getAvailable());
            inventoryRepositories.save(inventoryForFullMenu);
        }

        return MainService.DONE_SERVICE;
    }
}
