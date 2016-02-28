package com.example.app;

public class Calculator {
	
	
	public Calculator(){
		System.out.println("Kalkulator" + this);
		
		
	}
	
	public int add(int n1, int n2){
		return n1 + n2;
	}
	
	public int sub(int n1, int n2){
		return n1 - n2;
	}
	int multi(int a,int b){
		return a*b;
	}
	int div(int a, int b){
		return a/b;
	}
	
	boolean greater(int a, int b){
		if(a>b) return true;
		else return false;
	}
}
