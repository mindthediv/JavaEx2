package com.epicode.classiJava;

public class Carrello {
	public String owner;
	public Articolo[] articoloList;
	public double total = 0;

	Carrello(String owner, Articolo[] articoloList, double total){
		this.owner = owner;
		this.articoloList = articoloList; 
		this.total = total; 
	}
}
