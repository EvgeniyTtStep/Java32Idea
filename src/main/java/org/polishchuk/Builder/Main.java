package org.polishchuk.Builder;

public class Main {
    public static void main(String[] args) {
        Pasta pasta = new Pasta.Builder()
                .setType("Spaghetti")
                .setSauce("Tomato Sauce")
                .setFilling("Meatballs")
                .setAdditives("Parmesan Cheese")
                .build();

        System.out.println("Pasta Type: " + pasta.getType());
        System.out.println("Sauce: " + pasta.getSauce());
        System.out.println("Filling: " + pasta.getFilling());
        System.out.println("Additives: " + pasta.getAdditives());
    }
}
