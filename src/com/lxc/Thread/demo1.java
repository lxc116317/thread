package com.lxc.Thread;

public class demo1 {

	public static void main(String[] args) {
		MyThread mt=new MyThread();						//4.����Thread����������
		//mt.run();										//����RUN�����������������߳�
		mt.start(); 									//�����߳�
		
		for(int i=0;i<10000;i++) {						//д�������Ϊ���ն��̣߳�������
			System.out.println("bb");
		}

	}

}
class MyThread extends Thread{							//1.�̳�Thread����
	public void run(){									//2.��дRun����
		for(int i=0;i<10000;i++) {						//3.��Ҫִ�еĴ���д��ȥ
			System.out.println("aaaaaaa");
		}
	}
	
}
