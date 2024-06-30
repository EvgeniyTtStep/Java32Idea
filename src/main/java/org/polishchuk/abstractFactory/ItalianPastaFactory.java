package org.polishchuk.abstractFactory;

public class ItalianPastaFactory implements PastaFactory {
    @Override
    public Pasta createPasta() {
        return new Spaghetti();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
