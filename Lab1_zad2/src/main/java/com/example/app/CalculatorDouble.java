package com.example.app;

public class CalculatorDouble {

	public CalculatorDouble(){
		System.out.println("Kalkulator" + this);
		}
	
	public double add(double n1, double n2){
		return n1 + n2;
	}
	
	public double sub(double n1, double n2){
		return n1 - n2;
	}
	double multi(double a,double b){
		return a*b;
	}
	double div(double a, double b){
		return a/b;
	}
	
	boolean greater(double a, double b){
		if(a>b) return true;
		else return false;
	}
}
