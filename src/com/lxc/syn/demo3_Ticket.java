package com.lxc.syn;

public class demo3_Ticket {
	//��վ��4��������100��Ʊ
	//Ҫ�õ�ͬ�������
	public static void main(String[] args) {
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();

	}

}
class Ticket extends Thread{
	private static int ticket=100;					//����static�뵱�ڹ�����ticket
	public void run() {
		
		while(true) {
			synchronized(Ticket.class) {			//������this������Ϊ������4������ÿ�����󶼲�ͬ
			if(ticket==0) {
				break;
			}
			try {
				Thread.sleep(10);					//�߳�1˯���߳�2˯���߳�3˯���߳�4˯
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName()+"...���ǵ�"+ticket--+"��Ʊ");
			}
		}
	}
}