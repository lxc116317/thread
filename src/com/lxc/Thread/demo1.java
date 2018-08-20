package com.lxc.Thread;

public class demo1 {

	public static void main(String[] args) {
		MyThread mt=new MyThread();						//4.创建Thread类的子类对象
		//mt.run();										//调用RUN方法，并不会启动线程
		mt.start(); 									//开启线程
		
		for(int i=0;i<10000;i++) {						//写这个是因为对照多线程，间隔输出
			System.out.println("bb");
		}

	}

}
class MyThread extends Thread{							//1.继承Thread方法
	public void run(){									//2.重写Run方法
		for(int i=0;i<10000;i++) {						//3.将要执行的代码写进去
			System.out.println("aaaaaaa");
		}
	}
	
}
