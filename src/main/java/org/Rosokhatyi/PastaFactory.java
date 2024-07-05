package org.Rosokhatyi;

public class PastaFactory {

    public Pasta createPasta(String type) {
        switch (type.toLowerCase()) {
            case "spaghetti":
                return new Spaghetti();
            case "fettuccine":
                return new Fettuccine();
            case "lasagna":
                return new Lasagna();
            default:
                throw new IllegalArgumentException("Unknown pasta type: " + type);
        }
    }
}

