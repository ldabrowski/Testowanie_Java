package com.example.app;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LiczbaRzymskaTest {

	private LiczbaRzymska rzym = new LiczbaRzymska(8);
	private LiczbaRzymska rzym2 = new LiczbaRzymska(4);
	private LiczbaRzymska rzym_za_duza = new LiczbaRzymska(15);
	private LiczbaRzymska rzym_ujemna = new LiczbaRzymska(-2);
	
	@Test
	public void testToStringProper() {
		assertEquals("VIII", rzym.toString());
		assertEquals("IV", rzym2.toString());
	}
	
	@Test
	public void testTooBigNumber() {
		assertEquals("Zla liczba", rzym_za_duza.toString());
	}
	
	@Test
	public void testNegativeNumber() {
		assertEquals("Zla liczba", rzym_ujemna.toString());
	}
}
