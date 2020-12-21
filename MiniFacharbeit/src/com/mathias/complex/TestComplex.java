package com.mathias.complex;

public class TestComplex {
	public static void main(String[] args) {
		System.out.println("begin");
		Complex z1 = new Complex(1,2);
		Complex z2 = new Complex(2,3);
		System.out.println("z1="+z1);
		System.out.println("z2="+z2);
		Complex z3 = z1.add(z2);
		Complex z4 = z1.sub(z2);
		Complex z5 = z1.mult(z2);
		Complex z6 = z1.div(z2);
		System.out.println("z3="+z3);
		System.out.println("z4="+z4);
		System.out.println("z5="+z5);
		System.out.println("z6="+z6);
		System.out.println("z3==(3+ 5i)? "+z3.equals(new Complex(3,5)));
		System.out.println("end");
	}

}
