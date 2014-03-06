package com.damirvk;

public class Singleton {
	
	private Singleton(){}
	
	private String tekst;
	private static Singleton instance;
	
	public static Singleton getInstance(){
		
		if (instance==null) {
			
			instance = new Singleton();
		}
		
		return instance;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	
	

}
