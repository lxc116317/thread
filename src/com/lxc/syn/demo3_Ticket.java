package com.lxc.syn;

public class demo3_Ticket {
	//火车站，4个窗口卖100张票
	//要用到同步代码块
	public static void main(String[] args) {
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();

	}

}
class Ticket extends Thread{
	private static int ticket=100;					//加了static想当于共享了ticket
	public void run() {
		
		while(true) {
			synchronized(Ticket.class) {			//不能用this，是因为创建了4个对象，每个对象都不同
			if(ticket==0) {
				break;
			}
			try {
				Thread.sleep(10);					//线程1睡，线程2睡，线程3睡，线程4睡
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName()+"...这是第"+ticket--+"号票");
			}
		}
	}
}