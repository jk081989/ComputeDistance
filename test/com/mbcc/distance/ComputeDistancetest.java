package com.mbcc.distance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComputeDistancetest {

	@Test
	void test2D() {
		TddPoint p1 = new TddPoint(2,3);
		TddPoint p2 = new TddPoint(3,4);
		double actual = p1.distance(p2);
		System.out.println("test 2d: "+actual);
		assertEquals(1.4142135623730951,actual);
	}
	
	@Test
	void test3D()
	{
		TddPoint3D tddpoint3d = new TddPoint3D(2,3,4);
		TddPoint3D tddpoint3d2 = new TddPoint3D(5, 3, 8);
		double actual =tddpoint3d2.distance(tddpoint3d);
		System.out.println("test3D: "+actual);
		assertEquals(5.0, actual);	
	}
	
	@Test
	void test2Dto3D()
	{
		TddPoint tddpoint = new TddPoint(3,5);
		TddPoint tddpoint2 = new TddPoint3D(2,3,4);
		double actual = tddpoint.distance(tddpoint2);
		//System.out.println("Test 2D to 3D "+actual );
		assertEquals(2.23606797749979, actual);
	}
	
	@Test
	void test2Dtoorigin()
	{
		TddPoint tddpt = new TddPoint(0, 0);
		TddPoint tddpt2 = new TddPoint(5,8);
		float actual = (float)tddpt.distance(tddpt2);
		System.out.println("test2Dtoorigin: "+Math.floor(actual));
		assertEquals(Math.floor(9.433981), actual);
	}

	
}
