package org.Rosokhatyi;

//Создайте приложение для приготовления пасты.
// Приложение должно уметь создавать минимум три вида пасты.
// Классы различной пасты должны иметь следующие методы:
// ■ Тип пасты;
//■ Соус;
//■ Начинка;
//■ Добавки.
//Для реализации используйте порождающие паттерны.

public class PastaApp {

    public static void main(String[] args) {
        PastaFactory factory = new PastaFactory();

        Pasta spaghetti = factory.createPasta("Spaghetti");
        System.out.println("Pasta Type: " + spaghetti.getType());
        System.out.println("Sauce: " + spaghetti.getSauce());
        System.out.println("Filling: " + spaghetti.getFilling());
        System.out.println("Additives: " + spaghetti.getAdditives());

        System.out.println();

        Pasta fettuccine = factory.createPasta("Fettuccine");
        System.out.println("Pasta Type: " + fettuccine.getType());
        System.out.println("Sauce: " + fettuccine.getSauce());
        System.out.println("Filling: " + fettuccine.getFilling());
        System.out.println("Additives: " + fettuccine.getAdditives());

        System.out.println();

        Pasta lasagna = factory.createPasta("Lasagna");
        System.out.println("Pasta Type: " + lasagna.getType());
        System.out.println("Sauce: " + lasagna.getSauce());
        System.out.println("Filling: " + lasagna.getFilling());
        System.out.println("Additives: " + lasagna.getAdditives());
    }
}

