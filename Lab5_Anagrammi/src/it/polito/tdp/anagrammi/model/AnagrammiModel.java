package it.polito.tdp.anagrammi.model;

import it.polito.tdp.anagrammi.controller.Anagrammi;

public class AnagrammiModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	}
	
	public void CreaAnagramma(String parola) {
			Anagrammi par= new Anagrammi();
			par.setParola(parola);
			par.setLunghezza(parola.length());
			//settare gli anagrammi
		}

	public int CalcolaAnagramma(String parola, String parziale, int livello) {
		if(livello==parola.length())
			return 0;
		else {
			for(int i=0; i<=livello;i++)
				parziale[i]=parola[i];
			
			
			return livello;
		}
			
		
	}
	

}
