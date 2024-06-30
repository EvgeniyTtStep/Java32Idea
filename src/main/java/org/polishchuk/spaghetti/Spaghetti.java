package org.polishchuk.spaghetti;


public class Spaghetti implements Pasta {
    @Override
    public String getType() {
        return "Spaghetti";
    }

    @Override
    public String getSauce() {
        return "Tomato Sauce";
    }

    @Override
    public String getFilling() {
        return "Meatballs";
    }

    @Override
    public String getAdditives() {
        return "Parmesan Cheese";
    }
}


