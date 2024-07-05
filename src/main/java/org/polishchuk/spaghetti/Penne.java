package org.polishchuk.spaghetti;

public class Penne implements Pasta {
    @Override
    public String getType() {
        return "Penne";
    }

    @Override
    public String getSauce() {
        return "Alfredo Sauce";
    }

    @Override
    public String getFilling() {
        return "Chicken";
    }

    @Override
    public String getAdditives() {
        return "Parsley";
    }
}
