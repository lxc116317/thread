package com.lxc.Thread;

import java.io.IOException;

public class demo2_Runtime {
	//�������ģʽ��Ӧ��
	public static void main(String[] args) throws IOException {
		Runtime r=Runtime.getRuntime();			//��ΪRuntime��˽���ˣ����Բ���ֱ��new����//��ȡ����ʱ����
		//r.exec("shutdown -s -t 300");
		r.exec("shutdown -a");
	}

}
