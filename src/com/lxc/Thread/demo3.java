package com.lxc.Thread;

public class demo3 {
	//�����ڲ���ʵ���̵߳����ַ�ʽ
	public static void main(String[] args) {
		new Thread() {										//1.�̳�Thread
			public void run() {								//2.��дrun����
				for(int i=0;i<10000;i++) {					//3.��Ҫִ�еĴ���д��ȥ
					System.out.println("aaaaaaa");
				}
			}
		}.start();
		new Thread(new Runnable() {									//1.ʵ��Runnable�ӿ�
			public void run() {								//2.��дrun����
				for(int i=0;i<10000;i++) {					//3.��Ҫִ�еĴ���д��ȥ
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
	
