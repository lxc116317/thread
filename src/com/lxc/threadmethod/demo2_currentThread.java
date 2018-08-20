package com.lxc.threadmethod;

public class demo2_currentThread {

	public static void main(String[] args) {
		new Thread("李贤春") {
			public void run() {
				System.out.println(getName()+"..aaaaaaaaaaaaaa");
			}
		}.start();
		
		
		new Thread(new Runnable() {
			//Thread.currentThread()是获取当前正在执行的线程
			public void run() {
				Thread.currentThread().setName("陈杰");
				System.out.println(Thread.currentThread().getName()+"...bb");
			}
		}).start();

	}

}
