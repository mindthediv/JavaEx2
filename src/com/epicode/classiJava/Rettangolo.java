package com.epicode.classiJava;

public class Rettangolo {
	public double w;
	public double h;

	Rettangolo(double w,double h){
		this.w = w;
		this.h = h;
	}
	Rettangolo(int w,int h){
		this.w = w;
		this.h = h;
	}
	
	public double Perimetro() {
		return w*2+h*2;
	}
	public double Area() {
		return w*h;
	}
}


