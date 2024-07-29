package org.Kondrashov.HomeworkJAVA_35;

public class CarbonaraBuilder extends PastaBuilder{

    public CarbonaraBuilder() {
        pasta = new Pasta("Carbonara");
    }

    public void BuildSauce() {
        pasta.SetPart("sauce", "olive oil");
    }

    public void BuildEFilling() {
        pasta.SetPart("filling", "parmesan");
    }

    public void BuildFlavoring() {
        pasta.SetPart("flavoring", "black pepper");
    }

}
