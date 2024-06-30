package org.polishchuk.spaghetti;

public class FettuccineFactory extends PastaFactory {
    @Override
    public Pasta createPasta() {
        return new Fettuccine();
    }
}
