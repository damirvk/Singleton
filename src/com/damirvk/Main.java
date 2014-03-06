package com.damirvk;

public class Main {

	public static void main(String[] args) {

		Singleton s1=Singleton.getInstance();
		s1.setTekst("nesto");
		
		Singleton s2=Singleton.getInstance();
		System.out.println(s2.getTekst());
		
	}

}
