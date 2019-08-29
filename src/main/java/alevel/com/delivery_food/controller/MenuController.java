package alevel.com.delivery_food.controller;


import alevel.com.delivery_food.MainService;
import alevel.com.delivery_food.data.type_food.Pizza;
import alevel.com.delivery_food.entity.Menu;
import alevel.com.delivery_food.repositories.MenuRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("delivery_food/menu")
public class MenuController {

    private final MenuRepositories menuRepositories;
    private final MainService mainService;

    @Autowired
    public MenuController(MenuRepositories menuRepositories, MainService mainService) {
        this.menuRepositories = menuRepositories;
        this.mainService = mainService;
    }

    @PostMapping("/add")
    public void addDish(@RequestBody Menu menu){
        menuRepositories.save(menu);
    }

    @PostMapping("/delete")
    public void deleteDish(@RequestBody Menu menu) {
        menuRepositories.delete(menu);
    }

    @PostMapping("/rename")
    public void renameDish(@RequestBody Menu menu) {
        menuRepositories.getOne(menu.getDishID()).setDishName(menu.getDishName());
    }

    @GetMapping("/addFullMenu")
    public String addFullMenu() {
        Menu menu;

        for (Pizza type : Pizza.values()) {
            menu = new Menu();
            menu.setDishName(type.getNamePizza());

            menuRepositories.save(menu);
        }


        return MainService.DONE_SERVICE;
    }
}
