package org.Kondrashov.HomeworkJAVA_35;

class BologneseBuilder extends PastaBuilder{

    public BologneseBuilder() {
        pasta = new Pasta("Bolognese");
    }

    public void BuildSauce() {
        pasta.SetPart("sauce", "tomato paste");
    }

    public void BuildEFilling() {
        pasta.SetPart("filling", "meat");
    }

    public void BuildFlavoring() {
        pasta.SetPart("flavoring", "basil, pepper");
    }


}
