package com.lxc.threadmethod;

public class demo1 {

	public static void main(String[] args) {
		//demo1();
		//demo2();
		Thread t1= new Thread() {								//����������������󣬱��뿴���࣬���п�����
			public void run() {
				System.out.println(this.getName()+"...aaaaaaaaaaaaaaaaa");
			}
		};
		
		Thread t2= new Thread() {								////����������������󣬱��뿴���࣬���п�����
			public void run() {
				System.out.println(this.getName()+"...bb");
			}
		};
		
		t1.setName("���ʹ�");
		t2.setName("�½�");
		t1.start();
		t2.start();
	}
	//ͨ��������������ֵ
	private static void demo2() {
		new Thread() {
			public void run() {
				this.setName("���ʹ�");
				System.out.println(this.getName()+"....aaaaaaaaaaaaaaa");
			}
		}.start();
		
		new Thread() {
			public void run() {
				this.setName("�½�");
				System.out.println(this.getName()+"....bb");
			}
		}.start();
	}
	//ͨ�����췽����name��ֵ
	private static void demo1() {
		new Thread("���ʹ�") {
			public void run() {
				System.out.println(this.getName()+"....aaaaaaaaaaaaaaaaa");
			}
		}.start();
		
		
		new Thread("�½�") {
			public void run() {
				System.out.println(this.getName()+"....aaaaaaaaaaaaaaaaa");
			}
		}.start();
	}

}
