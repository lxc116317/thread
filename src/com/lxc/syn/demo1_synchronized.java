package com.lxc.syn;

public class demo1_synchronized {
	//ͬ�������
	public static void main(String[] args) {
		 Printer p=new Printer();
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
class Printer{
	demo d=new demo();
	public void printer1() {
		synchronized(d) {							//ͬ������飬�����ƣ�����������������
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("\r\n");
		}
		
	}
	public void printer2() {
		synchronized(d) {							//��������������������Ϊ����������ͬһ������
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("\r\n");
	}
		}
		
}
class demo{}