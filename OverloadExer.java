package com.atguigu.exer;

public class OverloadExer {
	OverloadExer.test=new OverloadExer();


		
		
	
	
	public void mOl(int i) {
		System.out.println(i*i);
	}
	
	public void mOl(int i,int j) {
		System.out.println(i*j);	
	}
	
	public void mOl(String s) {
		System.out.println(s);
	}
	public int Max(int i,int j) {
		return(i>j)?i:j;
	
	}
	
	public double max(double d1,double d2) {
		return (d1>d2)?d1:d2;
	}
	public double max(double d1,double d2,double d3) {
		double max= (d1>d2)?d1:d2;
		return (max>d3)?max:d3;
	}
	
	
}

