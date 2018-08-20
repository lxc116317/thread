package com.lxc.Thread;

import java.io.IOException;

public class demo2_Runtime {
	//单例设计模式的应用
	public static void main(String[] args) throws IOException {
		Runtime r=Runtime.getRuntime();			//因为Runtime被私有了，所以不能直接new对象//获取运行时对象
		//r.exec("shutdown -s -t 300");
		r.exec("shutdown -a");
	}

}
