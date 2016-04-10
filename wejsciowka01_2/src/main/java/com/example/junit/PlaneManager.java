package com.example.junit;

import java.util.ArrayList;
import java.util.List;


public class PlaneManager {

	List<Plane> planes = new ArrayList<Plane>();


	public void addPlane(Plane plane){

		planes.add(plane);

	}

	public void removePlane(Plane plane){

		planes.remove(plane);

	}
	
	public List<Plane> getAll(){
		return planes;
	}
	public boolean findbyNazwa(String nazwa)
	{
		for(Plane plane: planes)
		{
			if(plane.getNazwa().equals(nazwa))
			{
				return true;
			}
		}
		return false;
	}
	public boolean findbyNumer(int numer)
	{
		for(Plane plane: planes)
		{
			if(plane.getNumer()==numer)
			{
				return true;
			}
		}
		return false;
	}

}
