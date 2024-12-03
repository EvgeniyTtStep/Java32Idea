package org.Balandiukov;

import java.util.Arrays;
import java.util.Scanner;

interface PastaFactory {
  Pasta createPasta(String type);
}

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

class SpaghettiFactory implements PastaFactory {
  @Override
  public Pasta createPasta(String type) {
    if (type.equals("Spaghetti")) {
      return new Spaghetti();
    } else {
      throw new IllegalArgumentException("Invalid pasta type: " + type);
    }
  }
}

class PenneFactory implements PastaFactory {
  @Override
  public Pasta createPasta(String type) {
    if (type.equals("Penne")) {
      return new Penne();
    } else {
      throw new IllegalArgumentException("Invalid pasta type: " + type);
    }
  }
}

class LasagnaFactory implements PastaFactory {
  @Override
  public Pasta createPasta(String type) {
    if (type.equals("Lasagna")) {
      return new Lasagna();
    } else {
      throw new IllegalArgumentException("Invalid pasta type: " + type);
    }
  }
}

class PastaCreator {

  public Pasta createPasta(String type, PastaFactory factory) {
    return factory.createPasta(type);
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

public class PastaApplication {
  public static void main(String[] args) {
    PastaCreator pastaCreator = new PastaCreator();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose pasta type (Spaghetti, Penne, Lasagna): ");
    String type = scanner.nextLine();

    PastaFactory factory;
    switch (type) {
      case "Spaghetti":
        factory = new SpaghettiFactory();
        break;
      case "Penne":
        factory = new PenneFactory();
        break;
      case "Lasagna":
        factory = new LasagnaFactory();
        break;
      default:
        throw new IllegalArgumentException("Invalid pasta type: " + type);
    }

    Pasta pasta = pastaCreator.createPasta(type, factory);
    System.out.println(pasta);
  }
}
