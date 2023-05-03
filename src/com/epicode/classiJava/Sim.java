package com.epicode.classiJava;

public class Sim {
	public int telNumber;
	public double creditValue;
	public Call[] last5Calls;
	

	Sim(int telNumber){
		this.telNumber = telNumber;
		this.creditValue = 0;
		this.last5Calls = new Call[5];
	}
	
	public void StampaDati() {
		System.out.println("Tel Num: "+telNumber+" | Credit: "+creditValue+"$");
		System.out.println("Last 5 calls:");
		for (int i = 0; i<last5Calls.length;i++) {
			if(last5Calls[i] != null) {
			System.out.println(last5Calls[i].telCalled+" - "+last5Calls[i].duration+" min");
			}
			else {
				System.out.println((i+1)+" No Call");
			}
		}
	}
}


