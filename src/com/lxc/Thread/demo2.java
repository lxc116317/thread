package com.lxc.Thread;

public class demo2 {
/*
 *��ΪMyRunnable����ʹ��start����������ΪAPI��д����Thread�����ù��췽�������ݲ�������������start����
 */
	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();	
		//Runnable target=mr;
		Thread t=new Thread(mr);			        	//����д����Thread t=new Thread(Runnable target)
		t.start();
		
		for(int i=0;i<10000;i++) {						//д�������Ϊ���ն��̣߳�������
			System.out.println("bb");
		}
		

	}

}

/*��Ϊ�����̵߳�start������Thread��ģ�Runnable����ֻ��run����������MyRunnable����ʹ��start����
 */
class MyRunnable implements Runnable{					//1.дһ����ʵ��Runnable��Ľӿ�


	public void run() {									//2.��дrun����
		for(int i=0;i<10000;i++) {						//3.��Ҫִ�еĴ���д��ȥ
			System.out.println("aaaaaaa");
		}
		
	}
	
}