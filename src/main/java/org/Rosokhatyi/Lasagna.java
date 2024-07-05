package org.Rosokhatyi;


public class Lasagna implements Pasta {

    @Override
    public String getType() {
        return "Lasagna";
    }

    @Override
    public String getSauce() {
        return "Bechamel Sauce";
    }

    @Override
    public String getFilling() {
        return "Ground Beef";
    }

    @Override
    public String getAdditives() {
        return "Mozzarella Cheese";
    }
}
