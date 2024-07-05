package org.Rosokhatyi;

public class Fettuccine implements Pasta {

    @Override
    public String getType() {
        return "Fettuccine";
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

