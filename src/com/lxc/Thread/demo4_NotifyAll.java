package com.lxc.Thread;

public class demo4_NotifyAll {

	public static void main(String[] args) {
		final Printer3 p=new Printer3();
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.printer1();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.printer2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.printer3();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();

	}

}
class Printer3{
	private int flag=1;
	public void printer1() throws InterruptedException {
		synchronized(this) {
			while(flag!=1) {
				this.wait();
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("\r\n");
			flag=2;
			this.notifyAll();
		}
	}
	public void printer2() throws InterruptedException {
		synchronized(this) {
			while(flag!=2) {
				this.wait();
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("\r\n");
			flag=3;
			this.notifyAll();
	}
		}
	
	public void printer3() throws InterruptedException {
		synchronized(this) {
			while(flag!=3) {
				this.wait();
			}
			System.out.print("i");
			System.out.print("t");
			System.out.print("h");
			System.out.print("e");
			System.out.print("i");
			System.out.print("m");
			System.out.print("a");
			System.out.print("\r\n");
			flag=1;
			this.notifyAll();
	}
		}
}