package org.polishchuk.spaghetti;

public abstract class PastaFactory {
    public abstract Pasta createPasta();

    public Pasta orderPasta() {
        Pasta pasta = createPasta();
        System.out.println("Preparing " + pasta.getType());
        System.out.println("Adding sauce: " + pasta.getSauce());
        System.out.println("Adding filling: " + pasta.getFilling());
        System.out.println("Adding additives: " + pasta.getAdditives());
        return pasta;
    }
}
