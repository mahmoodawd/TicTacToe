/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complextesting;

import java.lang.Math;

public class Complex{
	
	private int real;
	private	int imag;

	public Complex()
	{
		System.out.println("default constructor");
	}

	public Complex(int real, int imag)
	{
		System.out.println("paramatrized constructor");
		this.real = real;
		this.imag = imag;
	}

	public void setReal(int real){
		this.real = real;
	}

	public int getReal() {
		return real;
	}

	public void setImag(int imag) {
		this.imag = imag;
	}

	public int getImag() {
		return imag;
	}

	public String print() {
		if(imag < 0)
			return real + " - " + Math.abs(imag) + "i";
		else
			return real + " + " + Math.abs(imag) + "i";
	}

	public static Complex sum(Complex c1, Complex c2){
		Complex result = new Complex();
		result.setReal(c1.getReal() + c2.getReal());
		result.setImag(c1.getImag() + c2.getImag());
		return result;
	}

	public static Complex sub(Complex c1, Complex c2){
		Complex result = new Complex();
		result.setReal(c1.getReal() - c2.getReal());
		result.setImag(c1.getImag() - c2.getImag());
		return result;
	}
        
        
        public static void main(String[] args){
		
		Complex c1 = new Complex();
		c1.setReal(1);
		c1.setImag(2);

		Complex c2 = new Complex(3, 4);

		(Complex.sum(c1, c2)).print();
		(Complex.sub(c1, c2)).print();
	}
}


