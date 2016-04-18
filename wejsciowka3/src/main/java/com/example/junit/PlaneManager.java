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

}
