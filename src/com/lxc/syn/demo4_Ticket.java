package com.lxc.syn;

public class demo4_Ticket {
	//火车站，4个窗口卖100张票（用Runnable接口实现）
	//要用到同步代码块
	public static void main(String[] args) {
		MyTicket mt=new MyTicket();
		new  Thread(mt).start();
		new  Thread(mt).start();
		new  Thread(mt).start();
		new  Thread(mt).start();
		/*
		 * Thread t=new Thread(mt);				多次启动一个线程是非法的
		 * t1.start();
		 * t1.start();
		 * t1.start();
		 * t1.start();
		 */

	}

}
class MyTicket implements Runnable{
	private  int ticket=100;					//加了static想当于共享了ticket
	public void run() {
		
		while(true) {
			synchronized(this) {				//可以用this，因为只创建了一个对象
				if(ticket==0) {
					break;
				}
				try {
					Thread.sleep(10);					//线程1睡，线程2睡，线程3睡，线程4睡
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"...这是第"+ticket--+"号票");
			}
		}
	}
}