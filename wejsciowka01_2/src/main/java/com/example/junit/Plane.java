package com.example.junit;

public class Plane {

	private String nazwa;
	private boolean leci;
	private int numer;

	public Plane(){
	}

	public Plane(String nazwa, boolean leci, int numer){
		this.nazwa = nazwa;
		this.leci = leci;
		this.numer = numer;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public boolean getLeci() {
		return leci;
	}

	public void setLeci(boolean leci) {
		this.leci = leci;
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}



}
