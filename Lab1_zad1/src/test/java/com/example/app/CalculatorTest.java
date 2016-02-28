package com.example.app;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.example.app.Calculator;

public class CalculatorTest {
	
	private Calculator calc = new Calculator();
	@Test
	public void addCheck(){	
		assertEquals(7, calc.add(3,4));
		
	}
	@Test
	public void addSub(){
		assertEquals(1, calc.sub(5,4));
		
	}
	@Test
	public void multiCheck(){
		assertEquals(8, calc.multi(4,4));
		
	}
	@Test
	public void divCheck(){
		assertEquals(1, calc.div(3,2));
		
	}
	@Test
	public void greaterCheck(){
		assertEquals(true, calc.greater(3,2));
		
	}
	
	@Test (expected = ArithmeticException.class) 
	public void div2Check(){
		assertEquals(6, calc.div(3,0));
		
	}
}
