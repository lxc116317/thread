package com.lxc.threadmethod;

public class demo4_daemon {
	//守护线程
	public static void main(String[] args) {
		Thread t1=new Thread() {
			public void run() {
				for(int i=0;i<2;i++) {
				System.out.println("aaaaaaaaaaaaaaa");
				}
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				for(int i=0;i<50;i++) {
				   System.out.println("bb");
				}
			}
		};
		
		t2.setDaemon(true);								//当传入true就意味着设置为守护线程
		t1.start();
		t2.start();
	}

}
