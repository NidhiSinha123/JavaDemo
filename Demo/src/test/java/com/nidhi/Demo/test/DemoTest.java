package com.nidhi.Demo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nidhi.Demo.service.DemoImpl;
import com.nidhi.Demo.service.DemoInterface;

class DemoTest {

	DemoInterface demo;
	@BeforeEach
    void setupThis(){
		demo=new DemoImpl();
        System.out.println("@BeforeEach executed");
    }
	
	@Test
	void test() {
		assertEquals(20,demo.addNo(10, 10));
		assertEquals(20,demo.subNo(30, 10));
		assertEquals(20,demo.mulNo(10, 2));
		assertEquals(20,demo.divNo(40, 2));
		
	}
	
	@Test
	void test2()
	{
		assertThrows(ArithmeticException.class,()->{
			demo.divNo(40, 0);
		});			
	}

	@AfterEach
	void end()
	{
		demo=null;
	}
}
