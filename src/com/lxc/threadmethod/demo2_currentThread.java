package com.lxc.threadmethod;

public class demo2_currentThread {

	public static void main(String[] args) {
		new Thread("���ʹ�") {
			public void run() {
				System.out.println(getName()+"..aaaaaaaaaaaaaa");
			}
		}.start();
		
		
		new Thread(new Runnable() {
			//Thread.currentThread()�ǻ�ȡ��ǰ����ִ�е��߳�
			public void run() {
				Thread.currentThread().setName("�½�");
				System.out.println(Thread.currentThread().getName()+"...bb");
			}
		}).start();

	}

}
