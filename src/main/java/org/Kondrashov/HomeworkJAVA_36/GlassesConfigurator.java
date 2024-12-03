package org.Kondrashov.HomeworkJAVA_36;

// ����� ������������
public class GlassesConfigurator
{
	/*
	*  ������� ������������ ������������� ����������
	*/
	private IGlassesFactory glassesFactory;
	
	public GlassesConfigurator() {
		glassesFactory = null;
	}
	public IGlassesFactory GetGlassesFactory() {
		return glassesFactory;
	}
	public void SetGlassesFactory(IGlassesFactory glassesCurrentFactory) {
		glassesFactory = glassesCurrentFactory;
	}
	
	/*
	*  ����� ���������������� ���������� �����
	*/
	public void Configure(Glasses glasses)
	{
		glasses.setFrame(glassesFactory.CreateFrame());
		glasses.setLens(glassesFactory.CreateLens());

	}
}

