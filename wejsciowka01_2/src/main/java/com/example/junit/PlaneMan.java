package com.example.junit;
import java.util.List;

public interface PlaneMan {
	
	boolean removePlane(Plane plane);
	boolean addPlane(Plane plane);	
	List<Plane> getAll();	
	boolean findbyNazwa(String nazwa);
	boolean findbyNumer(int numer);
}