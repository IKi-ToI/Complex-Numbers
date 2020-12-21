package com.mathias.complex;

public class Complex {
	private double re;
	private double im;

	public Complex(double a, double b) {
		this.re = a;
		this.im = b;
	}

	public Complex add(Complex z) {
		double u = this.re + z.re;
		double v = this.im + z.im;
		return new Complex(u, v);
	}

	public Complex sub(Complex z) {
		double u = this.re - z.re;
		double v = this.im - z.im;
		return new Complex(u, v);
	}

	public Complex mult(Complex z) {
		double u = (this.re * z.re) - (this.im * z.im);
		double v = (this.re * z.im) + (z.re * this.im);
		return new Complex(u, v);
	}
	
	public Complex div(Complex z) {
		double u = ((this.re * z.re) + (this.im * z.im))/((z.re*z.re)+(z.im*z.im));
		double v = ((z.re * this.im) - (this.re * z.im))/((z.re*z.re)+(z.im*z.im)) ;
		return new Complex(u, v);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Complex) {
			Complex z = (Complex) obj;
			return this.re == z.re && this.im == z.im;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		if (this.im < 0) {
			return "(" + this.re + " - " + -this.im + "i)";
		} else {
			return "(" + this.re + " + " + this.im + "i)";
		}
	}
}
