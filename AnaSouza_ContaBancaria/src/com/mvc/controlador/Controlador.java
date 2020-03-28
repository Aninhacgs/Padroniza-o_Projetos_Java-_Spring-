package com.mvc.controlador;

import com.mvc.modelo.Modelo;

public class Controlador {
	Modelo modelo = new Modelo();
	
	public void Principal() {
		modelo.EntradaDados();
	}
	
	public int Conta() {
		int c;
		c = modelo.getConta();
		return c;
	}
	
	public int Agencia() {
		int a;
		a = modelo.getAgencia();
		return a;
	}
	
	public double MostraSaldo() {
		double saldo;
		saldo = modelo.getSado();
		return saldo;
	}
	
	public boolean creditarValor(double valor, int numeroConta, int agencia) {
		boolean resp;
		
		if(numeroConta!=0 && agencia!=0 && valor>0.0) {
			modelo.Creditar(valor);
			resp =  true;
	    }
		
		else {
			resp = false;
		}
		
		return resp;
	}
	
	
	public boolean debitarValor(double valor, int numeroConta, int agencia) {
		boolean resp;
		int aux;
		if(numeroConta!=0 && agencia!=0 && valor>0) {
			aux = modelo.Debitar(valor);
			if(aux==1) {
				resp = true;
			}
			else {
				resp = false;
			}
		}
		
		else {
			resp = false;
		}
		
		return resp;
		
	}
		
	
}
