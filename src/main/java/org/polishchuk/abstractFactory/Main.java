package org.polishchuk.abstractFactory;

public class Main {
    public static void main(String[] args) {
        PastaFactory italianFactory = new ItalianPastaFactory();
        PastaFactory americanFactory = new AmericanPastaFactory();

        Pasta italianPasta = italianFactory.createPasta();
        Sauce italianSauce = italianFactory.createSauce();

        System.out.println("Italian Pasta: " + italianPasta.getType());
        System.out.println("Italian Sauce: " + italianSauce.getSauceType());

        Pasta americanPasta = americanFactory.createPasta();
        Sauce americanSauce = americanFactory.createSauce();

        System.out.println("American Pasta: " + americanPasta.getType());
        System.out.println("American Sauce: " + americanSauce.getSauceType());
    }
}
