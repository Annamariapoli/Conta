package it.polito.tdp.controller;

public class Model {              //metto tutto nel controller
	
	private String parola;
	public int numero;
	
	public int conta(String parola){   //OK!
		numero= parola.length();
		return numero;
	}
	
	public void stampaintero(){
		System.out.println(numero);
	}

	
	public static void main (String [] args){
		Model m = new Model();
		String p = "home";
		m.conta(p);	
		m.stampaintero();
		
	}
}
