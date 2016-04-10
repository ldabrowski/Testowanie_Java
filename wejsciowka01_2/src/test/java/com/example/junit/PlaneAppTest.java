package com.example.junit;

import java.util.ArrayList;
import java.util.List;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PlaneAppTest {
	
	private PlaneApp planeApp;
	private PlaneMan mock;

	@Before
	public void setUp() {
		mock = createMock(PlaneMan.class);
		planeApp = new PlaneApp(mock);
	}

	@Test
	public void addingCheck() {
		
		Plane samolot1 = new Plane("Airbus", true, 354);
		Plane samolot2 = new Plane("Boeing", false, 132);
		
		List<Plane> planes = new ArrayList<Plane>();
		planes.add(samolot1);
		planes.add(samolot2);
		
		expect(mock.addPlane(samolot1)).andReturn(true).atLeastOnce();
				
		expect(mock.removePlane(samolot1)).andReturn(true).atLeastOnce();
		
		expect(mock.getAll()).andReturn(planes).atLeastOnce();
		
		expect(mock.findbyNazwa("Airbus")).andReturn(true).atLeastOnce();

		expect(mock.findbyNumer(354)).andReturn(true).atLeastOnce();

		
		replay(mock);
		
		assertEquals(true, planeApp.addPlane(samolot1));
		assertEquals("Airbus", planeApp.getAll().get(0).getNazwa());
		assertEquals(true, planeApp.removePlane(samolot1));
		assertEquals(true, planeApp.findbyNazwa("Airbus"));
		assertEquals(true, planeApp.findbyNumer(354));


		verify(mock);
	}
}