package com.epicode.classiJava;

public class MainProject {

	public static void main(String[] args) {
		System.out.println("//////////////////////////////////");
		Rettangolo r1 = new Rettangolo(2,4);
		Rettangolo r2 = new Rettangolo(3,5);
		stampaRettangolo(r1);
		stampaRettangolo(r2);
		stampaDueRettangoli(r1,r2);
		System.out.println("//////////////////////////////////");
		System.out.println("//////////////////////////////////");
		Sim s1 = new Sim(1234567890);
		s1.last5Calls[0] = new Call(5,987654321);
		s1.last5Calls[1] = new Call(3.20,987654321);
		s1.last5Calls[2] = new Call(10.57,987654321);
		s1.StampaDati();
		System.out.println("//////////////////////////////////");
		System.out.println("//////////////////////////////////");
		Articolo art1 = new Articolo(12345,"qualcosa che non hai",3.56,34);
		Articolo art2 = new Articolo(67890,"qualcos'altro che non hai",1.04,43);
		final Articolo[] myCar = {art1,art2};
		Cliente cln1 = new Cliente(54321,"Elon Musk","elon@musk.com","01/01/0000");
		Carrello car1 = new Carrello(cln1.fullName,myCar,(art1.price+art2.price));		
		System.out.println(car1.owner+" ("+myCar[0].code+", "+myCar[1].code+") Total: "+car1.total+" $");
		System.out.println("//////////////////////////////////");
		System.out.println("//////////////////////////////////");
	}
	public static final void stampaRettangolo(Rettangolo r) {
		System.out.println("Questo rettangolo ha un perimetro di " + r.Perimetro() + " px ed un area pari a " + r.Area()+" px quadrati");
	};
	public static final void stampaDueRettangoli(Rettangolo r1,Rettangolo r2) {
		System.out.println("Il primo rettangolo ha un perimetro di " + r1.Perimetro() + " px ed un area pari a " + r1.Area()+" px quadrati");
		System.out.println("Il secondo rettangolo ha un perimetro di " + r2.Perimetro() + " px ed un area pari a " + r2.Area()+" px quadrati");
		System.out.println("La somma dei loro perimetri equivale a "+(r1.Perimetro()+r2.Perimetro())+" px"+", quella delle aree a "+(r1.Area()+r2.Area())+" px quadrati");
	};
}
