package com.capg.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.naming.InitialContext;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.capg.junit.Demo;

@TestInstance(Lifecycle.PER_CLASS)
class DemoTest {

	static Demo d;
	@BeforeAll
	public static void Init()
	{
		d=new Demo();
		System.out.println("init executed");
	}
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("test started");
	}
	@AfterEach
	public void afterEach()
	{
		System.out.println("test ended");
	}
	@AfterAll
	public void AfterAll()
	{
		System.out.println("all tests executed ");
	}
	@Test
	void testAdd() {

		assertEquals(3, d.add(1, 2));
	}

	@Test
//	@Disabled
	void testSubstract() {
		assertEquals(3, d.substract(5, 2));
	}

	@Test
	void testMultiply() {
		assertEquals(3, d.multiply(1, 3));
	}

	@Test
	void testDivide()
	{
		assertThrows(ArithmeticException.class, ()->d.divide(5,0));
	}
}
