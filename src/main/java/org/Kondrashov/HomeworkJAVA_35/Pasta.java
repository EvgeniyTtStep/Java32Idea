package org.Kondrashov.HomeworkJAVA_35;

import java.util.HashMap;

//Создайте приложение для приготовления пасты. Приложение должно уметь создавать минимум три вида пасты. Классы различной пасты должны иметь следующие методы:
// ■ Тип пасты;
//■ Соус;
//■ Начинка;
//■ Добавки.
//Для реализации используйте порождающие паттерны.

class Pasta {

    public Pasta(String type) {
        pastaType = type;
        parts = new HashMap<String, String>();
    }
    // ��� ������������ ����������
    private String pastaType;
    // ��������� ���������� �� ����������
    HashMap<String, String> parts;
    // ��������� ���������� � ���������� ����� ����������
    public String GetPart(String key) throws Exception {
        if (!CheckForPart(key)) {
            throw new Exception("There is no such key!");
        }
        return parts.get(key);
    }
    // ��������� �������� ��� ���������� ����� ����������
    public void SetPart(String key, String value) {
        parts.put(key, value);
    }
    // �������� �� ������� �����
    public boolean CheckForPart(String key) {
        return parts.get(key) != null? true:false;
    }
    // ����������� ���������� �� ����������� ����������
    public void Show() {
        System.out.println("\n====================\n");

        System.out.println("Pasta Type: " + pastaType +"\n");

        System.out.println("Sauce: " + parts.get("sauce") + "\n");

        System.out.println("Filling: " + parts.get("filling") + "\n");

        System.out.println("Flavoring: " + parts.get("flavoring") + "\n");
    }


}
