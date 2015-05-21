package com.tju.junit.test;

import com.tju.junit.Claculate;

import junit.framework.TestCase;

public class TestClaculate extends TestCase {

	public void testAdd() {
		int z=new Claculate().add(5,3);
		assertEquals(8, z);
	}

	public void testRed() {
		int w=new Claculate().red(5,3);
		assertEquals(2, w);
	}

	public void testRide() {
		int s=new Claculate().ride(5,3);
		assertEquals(15, s);
	}

	public void testDiv() {
		double m=new Claculate().div(5,2);
		//assertEquals(2.5, m);
	}

	

}
