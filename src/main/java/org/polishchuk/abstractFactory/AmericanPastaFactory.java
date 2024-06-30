package org.polishchuk.abstractFactory;

public class AmericanPastaFactory implements PastaFactory {
    @Override
    public Pasta createPasta() {
        return new Penne();
    }

    @Override
    public Sauce createSauce() {
        return new AlfredoSauce();
    }
}
