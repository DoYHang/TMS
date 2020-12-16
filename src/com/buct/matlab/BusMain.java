package com.buct.matlab;

import matlabcontrol.MatlabInvocationException;
import matlabcontrol.MatlabProxy;
import matlabcontrol.MatlabProxyFactory;

public class BusMain {

	public static void busTime(MatlabProxyFactory factory, MatlabProxy proxy, int K, 
								int T_e, int Hmin, int Hmax, double p,int pop_size, 
								double p_c,double p_m,int g,String distancefile,String timefile) throws MatlabInvocationException {
		//1为输出object数
		Object[] result = proxy.returningFeval("BusTimetabling_Main",1,K,T_e,Hmin,Hmax,p,pop_size,p_c,p_m,g,distancefile,timefile);
	}
	public static void busPassenger(MatlabProxyFactory factory, MatlabProxy proxy, int K, 
			int T_e, int Hmin, int Hmax, double p,int pop_size, 
			double p_c,double p_m,int g,String distancefile,String timefile) throws MatlabInvocationException {
		//1为输出object数
		Object[] result = proxy.returningFeval("MaxPassenger_Main",0,K,T_e,Hmin,Hmax,p,pop_size,p_c,p_m,g,distancefile,timefile);
	}
}
