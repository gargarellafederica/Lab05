package it.polito.tdp.anagrammi.controller;

import java.util.ArrayList;
import java.util.List;

public class Anagrammi {
	String parola;
	int lunghezza;
	List<String> anagrammi= new ArrayList<>();
	
	
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public int getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}
	public List<String> getAnagrammi() {
		return anagrammi;
	}
	public void setAnagrammi(List<String> anagrammi) {
		this.anagrammi = anagrammi;
	}
	


}
