package com.cal.service;

public class Calculator {
	
	public static final double pi = 3.1415926536; 
	
	public static void main(String[] args) {
		
		
		
		Addcal a=new Addcal();
		MulCal m=new MulCal();
		SubCal s=new SubCal();
		
		double ares=0.0;
		double sres=0.0;
		double mres=0.0;
		
		ares= a.sum();
		sres= s.sub();
		mres=m.mul();
		
		System.out.println("Sum=" +ares +"\n Sub res="+sres+"\n mul res="+mres) ;
	}

}
