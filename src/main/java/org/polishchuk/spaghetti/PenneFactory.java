package org.polishchuk.spaghetti;

public class PenneFactory extends PastaFactory {
    @Override
    public Pasta createPasta() {
        return new Penne();
    }
}
