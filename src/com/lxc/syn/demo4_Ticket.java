package com.lxc.syn;

public class demo4_Ticket {
	//��վ��4��������100��Ʊ����Runnable�ӿ�ʵ�֣�
	//Ҫ�õ�ͬ�������
	public static void main(String[] args) {
		MyTicket mt=new MyTicket();
		new  Thread(mt).start();
		new  Thread(mt).start();
		new  Thread(mt).start();
		new  Thread(mt).start();
		/*
		 * Thread t=new Thread(mt);				�������һ���߳��ǷǷ���
		 * t1.start();
		 * t1.start();
		 * t1.start();
		 * t1.start();
		 */

	}

}
class MyTicket implements Runnable{
	private  int ticket=100;					//����static�뵱�ڹ�����ticket
	public void run() {
		
		while(true) {
			synchronized(this) {				//������this����Ϊֻ������һ������
				if(ticket==0) {
					break;
				}
				try {
					Thread.sleep(10);					//�߳�1˯���߳�2˯���߳�3˯���߳�4˯
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"...���ǵ�"+ticket--+"��Ʊ");
			}
		}
	}
}