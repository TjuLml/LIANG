package com.tju.junit;

public class Claculate {
	public int add(int x,int y){
		return x+y;
	}
	public int red(int x,int y){
		return x-y;
	}
	public int ride(int x,int y){
		return x*y;
	}
	public double div(double x,double y){
		return x/y;
	}
	public static void main(String[] args){
		int z=new Claculate().add(5,3);
		int w=new Claculate().red(5,3);
		int s=new Claculate().ride(5,3);
		double m=new Claculate().div(5,3);
		System.out.println(z);
		System.out.println(w);
		System.out.println(s);
		System.out.println(m);
	}
}
