package alevel.com.delivery_food.data.type_food;

public enum Pizza {

    HAWAIIAN("Hawaiian"),
    MARGARITA("Margarita"),
    SEASONS("Seasons"),
    MOM_MIA("MomMia"),
    MEXICAN("Mexican"),
    PEPPERONI("Pepperoni"),
    VEGETARIAN("Vegetarian"),
    HUNTING("Hunting");


    private String namePizza;

    Pizza(String namePizza) {
        this.namePizza = namePizza;
    }

    public String getNamePizza() {
        return namePizza;
    }

    @Override
    public String toString() {
        return namePizza;
    }
}
