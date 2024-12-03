package org.Kondrashov.HomeworkJAVA_36;/*
* ��������� ������� ��� �������� ������������
* ���������� ����� ������������� ����������
*/

interface IGlassesFactory {
	Frame CreateFrame();
	Lens CreateLens();
}

/*
* ������� ��� �������� "��������" ������������
* ���������� ����� ������������� ����������
*/
class HyperopiaGlassesFactory implements IGlassesFactory {
	@Override
	public Frame CreateFrame(){
		return new ClassicFrame();
	}
	@Override
	public Lens CreateLens(){
		return new HyperopiaLens();
	}

}

/*
* ������� ��� �������� "�������" ������������
* ���������� ����� ������������� ����������
*/
class MyopiaGlassesFactory implements IGlassesFactory {
	@Override
	public Frame CreateFrame(){
		return new ModernFrame();
	}
	@Override
	public Lens CreateLens(){
		return new MyopiaLens();
	}

}

