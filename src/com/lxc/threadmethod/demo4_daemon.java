package com.lxc.threadmethod;

public class demo4_daemon {
	//�ػ��߳�
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
		
		t2.setDaemon(true);								//������true����ζ������Ϊ�ػ��߳�
		t1.start();
		t2.start();
	}

}
