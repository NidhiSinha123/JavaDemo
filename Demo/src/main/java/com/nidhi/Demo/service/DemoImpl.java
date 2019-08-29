package com.nidhi.Demo.service;

public class DemoImpl implements DemoInterface {

	@Override
	public int addNo(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subNo(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mulNo(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int divNo(int a, int b) throws ArithmeticException {
		// TODO Auto-generated method stub
		if(b==0)
			throw new ArithmeticException();
		return a/b;
	}

	

}
