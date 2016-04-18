package com.example.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class PlaneManagerTest {


	PlaneManager planeManager = new PlaneManager();

	private final static String NAME_1 = "Samolot";
	private final static String TYPE_1 = "jakis_model";
	private final static int AMOUNT_1 = 5;

	@Test
	public void checkAdding(){

		int planeSizeBeforeAdd = 0;

		Plane samolot = new Plane(NAME_1, TYPE_1, AMOUNT_1);

		planeManager.addPlane(samolot);

		int planeSizeAfterAdd = planeManager.planes.size();

		int planesSub = planeSizeAfterAdd - planeSizeBeforeAdd;

		assertEquals(1, planesSub);

		assertEquals(NAME_1, planeManager.planes.get(planeManager.planes.size() - 1).getName());
		assertEquals(TYPE_1, planeManager.planes.get(planeManager.planes.size() - 1).getType());
		assertEquals(AMOUNT_1, planeManager.planes.get(planeManager.planes.size() - 1).getAmount());

	}

	@Test
	public void checkRemoving(){

		int planeSizeBeforeAdd = 0;

		Plane samolot = new Plane(NAME_1, TYPE_1, AMOUNT_1);

		planeManager.addPlane(samolot);

		int planeSizeAfterAdd = planeManager.planes.size();

		int planesSub = planeSizeAfterAdd - planeSizeBeforeAdd;

		assertEquals(1, planesSub);

		planeManager.removePlane(samolot);

		int planeSizeAfterRemove = planeManager.planes.size();

		assertEquals(0, planeSizeAfterRemove);

	}

}
