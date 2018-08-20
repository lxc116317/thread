package com.lxc.threadmethod;

public class demo3_sleep {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("aaaaaaaaaaaaaaa");
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("bb");
				}
			}
		}.start();

	}

}
