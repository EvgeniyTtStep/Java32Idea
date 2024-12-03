package org.Kondrashov.HomeworkJAVA_35;
public class Run {

//Создайте приложение для приготовления пасты. Приложение должно уметь создавать минимум три вида пасты. Классы различной пасты должны иметь следующие методы:
// ■ Тип пасты;
//■ Соус;
//■ Начинка;
//■ Добавки.
//Для реализации используйте порождающие паттерны.

	public static void main(String[] args) {
		try {
			// ������� ������ ������ ���������
			PastaConstructor shop = new PastaConstructor();

			// ������� ������ ������ ���������. ���� ������ ����� ��������� �����������
			PastaBuilder builder = new BologneseBuilder();

			// ��������� ����������
			shop.Construct(builder);

			// ���������� ���������� � �����������
			builder.GetPasta().Show();

			// ������� ������ ������ ���������. ���� ������ ����� ��������� �������
			builder = new CarbonaraBuilder();

			// ��������� ������
			shop.Construct(builder);

			// ���������� ���������� � �������
			builder.GetPasta().Show();

		}
		catch(Exception ex) {
			System.out.println("Exception happened!\nException description:\n"+ex.getMessage());
		}
	}
}