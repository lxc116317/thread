package com.lxc.syn;

public class demo2_synchronized2 {
	//ͬ�������
	public static void main(String[] args) {
		 Printer1 p=new Printer1();
		 new Thread() {
			 public void run() {
				 while(true) {
					 p.printer1();
				 }
			 }
		 }.start();
		 
		 new Thread() {
			 public void run() {
				 while(true) {
					 p.printer2();
				 }
			 }
		 }.start();

	}

}
class Printer1{
	/*
	 * �Ǿ�̬��ͬ����������������ʲô?
	 * 		��this
	 * ��̬��ͬ����������������ʲô��
	 * 		�Ǹ�����ֽ������
	 */
	demo d=new demo();
	public static synchronized void printer1() {			//ͬ������ֻ��Ҫ�ڷ����ϼ���synchronized����
		    System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("\r\n");
		}
		
	
	public static void printer2() {
		synchronized(Printer1.class) {							
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("\r\n");
	}
		}
		
}
