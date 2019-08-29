package alevel.com.delivery_food.data.type_food;

public enum Rolls {

    BALTIMORE("Baltimore"),
    RAINBOW("Rainbow"),
    MOROCCO("Morocco"),
    VERONA("Verona"),
    PHARAOH("Pharaoh"),
    SUNRISE("Sunrise"),
    UNAGI_TEMPURA("Unagi tempura");

    private String nameRoll;

    Rolls(String nameRoll) {
        this.nameRoll = nameRoll;
    }

    public String getNameRoll() {
        return nameRoll;
    }

    @Override
    public String toString() {
        return nameRoll;
    }
}
