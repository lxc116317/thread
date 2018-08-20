package com.lxc.threadmethod;

public class demo5_join {
	//加入线程(join)
	public static void main(String[] args) {
		final Thread t1=new Thread() {			//匿名内部类（局部内部类）在它所使用方法中的局部变量的时候，必须用final修饰
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("aaaaaaaaaaaaa");
			}
			
		 }
		};
		
		Thread t2=new Thread() {
			public void run() {
				for(int i=0;i<5;i++) {
					if(i==2) {
						try {
							t1.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("bb");
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
