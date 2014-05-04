package com.damirvk;

public class Singleton {
	
	private Singleton(){}
	
	private String tekst;
	private static Singleton instance;
	private static Object lockObj = new Object();
	
	public static Singleton getInstance(){
		
		if (instance==null) {
		synchronized(lockObj){	
			instance = new Singleton();}
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
