package com.buct.matlab;



import matlabcontrol.MatlabConnectionException;
import matlabcontrol.MatlabInvocationException;
import matlabcontrol.MatlabProxy;
import matlabcontrol.MatlabProxyFactory;
public class test {
	static MatlabProxyFactory factory = new MatlabProxyFactory();
	
	public static MatlabProxy proxy;
	public static void main(String[] args) throws MatlabConnectionException, MatlabInvocationException {
		// TODO Auto-generated method stub
		
		proxy = factory.getProxy();
        double p=0.2;
        double[] Q={13795,537,2000,3000,4000,7049};
        double[] C={65,-50,100,300,600,1080};
        double m=2;
        double M=5;
        double QQ=10000;
        double c=10000;
      
        Object[] result = proxy.returningFeval("demo",5,p,Q,C,m,M,QQ,c);
        

        double[] r=(double[]) result[0];
           System.out.print("f:");
           for (int i = 0; i < r.length; i++) {
               System.out.print(r[i]);
           }

         

           Object[] r4=(Object[]) result[4];
           String[] key=(String[]) r4[0];
           for (int i = 0; i < key.length; i++) {
               System.out.println(key[i]);
           }
           System.exit(0);
	}

}
