package com.lxc.Thread;

public class demo1_Singleton {
//�������ģʽ
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		System.out.println(s1==s2);
			}

}
/*
 * 
 *����ʽ
 * class Singleton{
	//1.˽�й��췽���������಻�ܷ��ʸù��췽����
	private Singleton() {}
	//2.�����������
	private static Singleton s=new Singleton();
	//3.�����ṩ�����ķ��ʷ���
	public static Singleton getInstance() {		//��ȡʵ��
		return s;
	}
}*/
//����ʽ
class Singleton{
	//1.˽�й��췽���������಻�ܷ��ʸù��췽����
	private Singleton() {}
	//2.����һ������
	private static Singleton s;
	//3.�����ṩ�����ķ��ʷ���
	public static Singleton getInstance() {		//��ȡʵ��
		if(s==null) {
			//�߳�1�ȴ����߳�2�ȴ�
			s=new Singleton();
		}
		return s;
	}
}
