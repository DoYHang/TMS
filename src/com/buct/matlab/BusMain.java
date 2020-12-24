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
	public static void buschuanche(MatlabProxyFactory factory, MatlabProxy proxy, 
			int K, int K1, String file1,String file2, String file3) throws MatlabInvocationException {
		Object[] result = proxy.returningFeval("ShortTurning",2,K,K1,file1,file2,file3);
	}
	public static void busshuangxiang(MatlabProxyFactory factory, MatlabProxy proxy, 
			int k, int ts1, int te1, int ts2, int te2, int hmin, int hmax,int popsize, 
			double px,double pm, int g,String file1,String file2) throws MatlabInvocationException {
		Object[] result = proxy.returningFeval("Bidirection_MaxPassenger",3,k,ts1,te1,ts2,te2,hmin,hmax,popsize,px,pm,g,file1,file2);
	}
}
