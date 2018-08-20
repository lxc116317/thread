package com.lxc.Thread;



public class demo4_Notify {
	//�ȴ����ѻ���(wait   notify)
	public static void main(String[] args) {
	
		final Printer2 p=new Printer2();
		
		new Thread() {
			public  void run() {
				while(true) {
					try {
						p.printer1();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public  void run() {
				while(true) {
					try {
						p.printer2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();

	}

}
class Printer2{
	private int flag=1;
	public void printer1() throws InterruptedException {
		synchronized(this) {							//ͬ������飬�����ƣ�����������������
			if(flag!=1) {
				this.wait();							//��ǰ�̵߳ȴ���ִ��Ȩ�����¸��߳�
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("\r\n");
			flag=2;							
			this.notify();								//������ѵ����ȴ����߳�
		}
		
	}
	public void printer2() throws InterruptedException {
		synchronized(this) {							//��������������������Ϊ����������ͬһ������
			if(flag!=2) {
				this.wait();
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("\r\n");
			flag=1;
			this.notify();
	}
		}
		
}
