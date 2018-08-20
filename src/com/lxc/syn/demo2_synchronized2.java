package com.lxc.syn;

public class demo2_synchronized2 {
	//同步代码块
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
	 * 非静态的同步方法的锁对象是什么?
	 * 		是this
	 * 静态的同步方法的锁对象是什么？
	 * 		是该类的字节码对象
	 */
	demo d=new demo();
	public static synchronized void printer1() {			//同步方法只需要在方法上加上synchronized即可
		    System.out.print("黑");
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
		}
		
	
	public static void printer2() {
		synchronized(Printer1.class) {							
			System.out.print("传");
			System.out.print("智");
			System.out.print("播");
			System.out.print("客");
			System.out.print("\r\n");
	}
		}
		
}
