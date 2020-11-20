package com.buct.matlab;


import java.io.File;
import java.io.IOException;
import com.jmatio.io.MatFileReader;
import com.jmatio.types.MLArray;
import com.jmatio.types.MLDouble;

import matlabcontrol.MatlabConnectionException;
import matlabcontrol.MatlabInvocationException;
import matlabcontrol.MatlabProxy;
import matlabcontrol.MatlabProxyFactory;

public class Mat {
	
	public static void iga(MatlabProxyFactory factory,MatlabProxy proxy,int n,int s,
			int l,int r,int t,double a,double b,int ps,int g,double p_c,double p_m,String filename) throws MatlabConnectionException, MatlabInvocationException {
		
		Object[] result = proxy.returningFeval("IGA",2,n,s,l,r,t,a,b,ps,g,p_c,p_m,filename);
//		String solution = String.valueOf(result[0]);	
//		System.out.println(solution);
//		String objective =  String.valueOf(result[1]);
//		System.out.println(objective);
		//System.exit(0);
	}
	 public  static void main(String[] args)throws IOException, MatlabConnectionException, MatlabInvocationException{
		 
		 //iga(factory,proxy,10, 10, 90, 600, 3600, 0.9, 0.9, 50, 10, 0.5, 0.1, "Data.xlsx");
	    }
}
