package org.Balandiukov;

import java.util.Arrays;
import java.util.Scanner;

abstract class Pasta {
    private String type;
    private String sauce;
    private String filling;
    private String[] toppings;

    public Pasta(String type, String sauce, String filling, String[] toppings) {
        this.type = type;
        this.sauce = sauce;
        this.filling = filling;
        this.toppings = toppings;
    }

    public String getType() {
        return type;
    }

    public String getSauce() {
        return sauce;
    }

    public String getFilling() {
        return filling;
    }

    public String[] getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pasta{" +
                "type='" + type + '\'' +
                ", sauce='" + sauce + '\'' +
                ", filling='" + filling + '\'' +
                ", toppings=" + Arrays.toString(toppings) +
                '}';
    }
}

class Spaghetti extends Pasta {
    public Spaghetti() {
        super("Spaghetti", "Tomato sauce", "", new String[]{"Parmesan cheese", "Basil"});
    }
}

class Penne extends Pasta {
    public Penne() {
        super("Penne", "Alfredo sauce", "", new String[]{"Ham", "Peppers"});
    }
}

class Lasagna extends Pasta {
    public Lasagna() {
        super("Lasagna", "Meat sauce", "Bechamel sauce", new String[]{"Mozzarella cheese", "Ricotta cheese"});
    }
}

class PastaCreator {
    public Pasta createPasta(String type) {
        switch (type) {
            case "Spaghetti":
                return new Spaghetti();
            case "Penne":
                return new Penne();
            case "Lasagna":
                return new Lasagna();
            default:
                throw new IllegalArgumentException("Invalid pasta type: " + type);
        }
    }
}

public class PastaApplication {
    public static void main(String[] args) {
        PastaCreator pastaCreator = new PastaCreator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose pasta type (Spaghetti, Penne, Lasagna): ");
        String type = scanner.nextLine();

        Pasta pasta = pastaCreator.createPasta(type);
        System.out.println(pasta);
    }
}
