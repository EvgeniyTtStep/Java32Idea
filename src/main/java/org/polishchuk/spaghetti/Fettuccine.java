package org.polishchuk.spaghetti;

public class Fettuccine implements Pasta {
    @Override
    public String getType() {
        return "Fettuccine";
    }

    @Override
    public String getSauce() {
        return "Carbonara Sauce";
    }

    @Override
    public String getFilling() {
        return "Bacon";
    }

    @Override
    public String getAdditives() {
        return "Black Pepper";
    }
}
