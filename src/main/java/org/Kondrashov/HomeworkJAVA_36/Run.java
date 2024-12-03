package org.Kondrashov.HomeworkJAVA_36;

public class Run {
	//����� ��� ������ ���������� � ����������
	public static void PrintGlassesConfiguration(String configName, Glasses glasses) {
		System.out.println("\n======== " + configName + " ========\n");
		System.out.println("Frame: " + glasses.getFrame().Info() + "\n");
		System.out.println("Lens: " + glasses.getLens().Info() + "\n");
	}
	public static void main(String[] args) {
		
		try {
			// ����������� ������������ ����������
			GlassesConfigurator configurator = new GlassesConfigurator();
			Glasses glasses1 = new Glasses();

			// ��������� ������������ �� �������� ���������
			configurator.SetGlassesFactory(new HyperopiaGlassesFactory());
			configurator.Configure(glasses1);
			
			PrintGlassesConfiguration("Hyperopia configuration", glasses1);

			Glasses glasses2 = new Glasses();

			// ��������� ������������ �� �������� ���������
			configurator.SetGlassesFactory(new MyopiaGlassesFactory());
			configurator.Configure(glasses2);

			PrintGlassesConfiguration("Myopia configuration", glasses2);

		}
		catch(Exception ex) {
			System.out.println("Exception happened! Exception description\n"+ex.getMessage());
		}

	}

}
