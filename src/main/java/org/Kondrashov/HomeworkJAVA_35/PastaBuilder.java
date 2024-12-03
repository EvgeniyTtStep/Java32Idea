package org.Kondrashov.HomeworkJAVA_35;

abstract class PastaBuilder {

    protected Pasta pasta;

    public PastaBuilder() {

    }

    public Pasta GetPasta() {
        return pasta;
    }

    public abstract void BuildSauce();

    public abstract void BuildEFilling();

    public abstract void BuildFlavoring();


}
