package org.Kondrashov.HomeworkJAVA_35;

class PastaConstructor {

    public PastaConstructor() {

    }

    public void Construct(PastaBuilder pastaBuilder) {
        pastaBuilder.BuildSauce();
        pastaBuilder.BuildEFilling();
        pastaBuilder.BuildFlavoring();
    }


}
