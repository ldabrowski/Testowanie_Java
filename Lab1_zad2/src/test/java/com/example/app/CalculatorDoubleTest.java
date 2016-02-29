package com.example.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.example.app.CalculatorDouble;

public class CalculatorDoubleTest {
	
	private CalculatorDouble calc = new CalculatorDouble();
	
	@Test
	public void addCheck(){	
		assertEquals(7.0, calc.add(3.0,4.0),0);
		
	}
	@Test
	public void addSub(){
		assertEquals(1.0, calc.sub(5.0,4.0),0);
		
	}
	@Test
	public void multiCheck(){
		assertEquals(8.0, calc.multi(4.0,2.0),0);
		
	}
	@Test
	public void divCheck(){
		assertEquals(1.5,calc.div(3.0,2.0),0);
		
	}
	@Test
	public void greaterCheck(){
		assertEquals(true, calc.greater(3.0,2.0));
		
	}
	
	@Test (expected = AssertionError.class) 
	public void div2Check(){
		assertEquals(6, calc.div(3.0,0.0),0);
		
	}
    }

