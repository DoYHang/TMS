package com.buct.matlab;

import matlabcontrol.MatlabInvocationException;
import matlabcontrol.MatlabProxy;
import matlabcontrol.MatlabProxyFactory;

public class BicycleMain {
	public static void bicycle(MatlabProxyFactory factory, MatlabProxy proxy, int tmax, 
			int qmax, int c, double alpha, double dr,int it, 
			int sg,double r,double cr, int t,String file1,String file2) throws MatlabInvocationException {
		//1为输出object数
		Object[] result = proxy.returningFeval("ALNS",2,tmax, qmax, c, alpha, dr, it, sg, r, cr, t, file1,file2);
	}
}
