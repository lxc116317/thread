package com.lxc.Thread;



public class demo4_Notify {
	//等待唤醒机制(wait   notify)
	public static void main(String[] args) {
	
		final Printer2 p=new Printer2();
		
		new Thread() {
			public  void run() {
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
			public  void run() {
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

	}

}
class Printer2{
	private int flag=1;
	public void printer1() throws InterruptedException {
		synchronized(this) {							//同步代码块，锁机制，锁对象可以是任意的
			if(flag!=1) {
				this.wait();							//当前线程等待，执行权交给下个线程
			}
			System.out.print("黑");
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
			flag=2;							
			this.notify();								//随机唤醒单个等待的线程
		}
		
	}
	public void printer2() throws InterruptedException {
		synchronized(this) {							//锁对象不能用匿名对象，因为匿名对象不是同一个对象
			if(flag!=2) {
				this.wait();
			}
			System.out.print("传");
			System.out.print("智");
			System.out.print("播");
			System.out.print("客");
			System.out.print("\r\n");
			flag=1;
			this.notify();
	}
		}
		
}
