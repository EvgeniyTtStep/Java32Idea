package org.polishchuk.spaghetti;

public class SpaghettiFactory extends PastaFactory {
    @Override
    public Pasta createPasta() {
        return new Spaghetti();
    }
}