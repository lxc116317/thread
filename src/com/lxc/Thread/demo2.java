package com.lxc.Thread;

public class demo2 {
/*
 *因为MyRunnable不能使用start方法，又因为API中写明了Thread可以用构造方法来传递参数，进而调用start方法
 */
	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();	
		//Runnable target=mr;
		Thread t=new Thread(mr);			        	//完整写法是Thread t=new Thread(Runnable target)
		t.start();
		
		for(int i=0;i<10000;i++) {						//写这个是因为对照多线程，间隔输出
			System.out.println("bb");
		}
		

	}

}

/*因为开启线程的start方法是Thread里的，Runnable里面只有run方法，所以MyRunnable不能使用start方法
 */
class MyRunnable implements Runnable{					//1.写一个类实现Runnable类的接口


	public void run() {									//2.重写run方法
		for(int i=0;i<10000;i++) {						//3.将要执行的代码写进去
			System.out.println("aaaaaaa");
		}
		
	}
	
}