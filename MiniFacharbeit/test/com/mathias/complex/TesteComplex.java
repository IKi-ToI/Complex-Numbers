package com.mathias.complex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteComplex {
	@Test
	public void testAdd() {
		assertEquals(new Complex(2,3), new Complex(1,2).add(new Complex(1,1)));
	}
	@Test
	public void testMult() {
		assertEquals(new Complex(-4,7), new Complex(1,2).mult(new Complex(2,3)));
	}
}
