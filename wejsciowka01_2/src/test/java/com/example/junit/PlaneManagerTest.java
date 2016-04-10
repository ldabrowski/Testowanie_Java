package com.example.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class PlaneManagerTest {


	PlaneManager planeManager = new PlaneManager();

	private final static String NAZWA_1 = "Airbus";
	private final static String LECI_1 = true;
	private final static int NUMER_1 = 534;

	@Test
	public void checkAdding(){

		int planeSizeBeforeAdd = 0;

		Plane samolot = new Plane(NAZWA_1, LECI_1, NUMER_1);

		planeManager.addPlane(samolot);

		int planeSizeAfterAdd = planeManager.planes.size();

		int planesSub = planeSizeAfterAdd - planeSizeBeforeAdd;

		assertEquals(1, planesSub);

		assertEquals(NAZWA_1, planeManager.planes.get(planeManager.planes.size() - 1).getNazwa());
		assertEquals(NUMER_1, planeManager.planes.get(planeManager.planes.size() - 1).getNumer());
		assertEquals(LECI_1, planeManager.planes.get(planeManager.planes.size() - 1).getLeci());

	}

	@Test
	public void checkRemoving(){

		int planeSizeBeforeAdd = 0;

		Plane samolot = new Plane(NAZWA_1, LECI_1, NUMER_1);

		planeManager.addPlane(samolot);

		int planeSizeAfterAdd = planeManager.planes.size();

		int planesSub = planeSizeAfterAdd - planeSizeBeforeAdd;

		assertEquals(1, planesSub);

		planeManager.removePlane(samolot);

		int planeSizeAfterRemove = planeManager.planes.size();

		assertEquals(0, planeSizeAfterRemove);

	}

}
