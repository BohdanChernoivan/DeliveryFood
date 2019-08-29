package alevel.com.delivery_food.data.type_food;

public enum Drinks {

    COCA_COLA("Coca-cola"),
    FANTA("Fanta"),
    SPRITE("Sprite");


    private String nameDrink;

    Drinks(String nameDrink) {
        this.nameDrink = nameDrink;
    }

    public String getNameDrink() {
        return nameDrink;
    }

    @Override
    public String toString() {
        return nameDrink;
    }
}
