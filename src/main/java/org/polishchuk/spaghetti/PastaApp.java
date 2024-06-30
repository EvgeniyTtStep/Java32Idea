package org.polishchuk.spaghetti;

public class PastaApp {
    public static void main(String[] args) {
        PastaFactory spaghettiFactory = new SpaghettiFactory();
        PastaFactory penneFactory = new PenneFactory();
        PastaFactory fettuccineFactory = new FettuccineFactory();

        Pasta spaghetti = spaghettiFactory.orderPasta();
        System.out.println();

        Pasta penne = penneFactory.orderPasta();
        System.out.println();

        Pasta fettuccine = fettuccineFactory.orderPasta();
    }
}
