package com.lxc.Thread;

public class demo3 {
	//匿名内部类实现线程的两种方式
	public static void main(String[] args) {
		new Thread() {										//1.继承Thread
			public void run() {								//2.重写run方法
				for(int i=0;i<10000;i++) {					//3.将要执行的代码写进去
					System.out.println("aaaaaaa");
				}
			}
		}.start();
		new Thread(new Runnable() {									//1.实现Runnable接口
			public void run() {								//2.重写run方法
				for(int i=0;i<10000;i++) {					//3.将要执行的代码写进去
					System.out.println("bb");
				}
				}
			}).start();

	}
	
}

		/*
		 *  	MyThread mr=new MyThread();
		 */
		 
			//Runnable target=mr;
			//Thread t=new Thread(mr);
	
