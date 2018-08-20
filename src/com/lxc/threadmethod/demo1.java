package com.lxc.threadmethod;

public class demo1 {

	public static void main(String[] args) {
		//demo1();
		//demo2();
		Thread t1= new Thread() {								//父类引用向子类对象，编译看父类，运行看子类
			public void run() {
				System.out.println(this.getName()+"...aaaaaaaaaaaaaaaaa");
			}
		};
		
		Thread t2= new Thread() {								////父类引用向子类对象，编译看父类，运行看子类
			public void run() {
				System.out.println(this.getName()+"...bb");
			}
		};
		
		t1.setName("李贤春");
		t2.setName("陈杰");
		t1.start();
		t2.start();
	}
	//通过设置名字来赋值
	private static void demo2() {
		new Thread() {
			public void run() {
				this.setName("李贤春");
				System.out.println(this.getName()+"....aaaaaaaaaaaaaaa");
			}
		}.start();
		
		new Thread() {
			public void run() {
				this.setName("陈杰");
				System.out.println(this.getName()+"....bb");
			}
		}.start();
	}
	//通过构造方法给name赋值
	private static void demo1() {
		new Thread("李贤春") {
			public void run() {
				System.out.println(this.getName()+"....aaaaaaaaaaaaaaaaa");
			}
		}.start();
		
		
		new Thread("陈杰") {
			public void run() {
				System.out.println(this.getName()+"....aaaaaaaaaaaaaaaaa");
			}
		}.start();
	}

}
