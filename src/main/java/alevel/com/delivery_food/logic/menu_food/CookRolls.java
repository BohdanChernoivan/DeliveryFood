package alevel.com.delivery_food.logic.menu_food;

import alevel.com.delivery_food.data.type_food.Rolls;

public interface CookRolls {

    default void cookRoll(Rolls rollType) {

        switch (rollType) {
            case BALTIMORE:
                cookBaltimore();
                break;
            case RAINBOW:
                cookRainbow();
                break;
            case MOROCCO:
                cookMorocco();
                break;
            case VERONA:
                cookVerona();
                break;
            case PHARAOH:
                cookPharaoh();
                break;
            case SUNRISE:
                cookSunrise();
                break;
            case UNAGI_TEMPURA:
                cookUnagiTempura();
                break;
        }
    }

    void cookBaltimore();

    void cookRainbow();

    void cookMorocco();

    void cookVerona();

    void cookPharaoh();

    void cookSunrise();

    void cookUnagiTempura();


}
