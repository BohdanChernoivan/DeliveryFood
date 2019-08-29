package alevel.com.delivery_food.logic.menu_food;


import alevel.com.delivery_food.data.type_food.Drinks;

public interface CookDrinks {

    default void cookDrink(Drinks drinkType) {

        switch (drinkType) {
            case COCA_COLA:
                cookCocaCola();
                break;
            case FANTA:
                cookFanta();
                break;
            case SPRITE:
                cookSprite();
                break;
        }
    }

    void cookCocaCola();

    void cookFanta();

    void cookSprite();
}
