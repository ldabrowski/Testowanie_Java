package com.example.junit;
import java.util.List;
public class PlaneApp {
	
	private PlaneMan planeman;

	public PlaneApp(PlaneMan planeman) {
		this.planeman = planeman;
	}
	
	public boolean addPlane(Plane plane){
		return planeman.addPlane(plane);	
	}
	
	public boolean removePlane(Plane plane){
		return planeman.removePlane(plane);
	}
	public List<Plane> getAll()
	{
		return planeman.getAll();
	}
	public boolean findbyNazwa(String nazwa)
	{
		return planeman.findbyNazwa(nazwa);
	}
	public boolean findbyNumer(int numer)
	{
		return planeman.findbyNumer(numer);
	}
}