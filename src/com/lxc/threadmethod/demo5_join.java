package com.lxc.threadmethod;

public class demo5_join {
	//�����߳�(join)
	public static void main(String[] args) {
		final Thread t1=new Thread() {			//�����ڲ��ࣨ�ֲ��ڲ��ࣩ������ʹ�÷����еľֲ�������ʱ�򣬱�����final����
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
