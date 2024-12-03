package org.Kondrashov.HomeworkJAVA_36;

//Напишіть власний приклад реалізації патрна AbstractFactory та Builder
//Результат скинути на гіт репозиторій та створіть пул реквест

interface Accessory {
        public abstract String Info();
}

abstract class Frame implements Accessory {

}

abstract class Lens implements Accessory {

}

class ClassicFrame extends Frame
{
    public String Info(){
        return "ClassicFrame";
    }
}

class ModernFrame extends Frame
{
    public String Info(){
        return "ModernFrame";
    }
}

class MyopiaLens extends Lens
{
    public String Info(){
        return "MyopiaLens";
    }
}

class HyperopiaLens extends Lens
{
    public String Info(){
        return "HyperopiaLens";
    }
}
