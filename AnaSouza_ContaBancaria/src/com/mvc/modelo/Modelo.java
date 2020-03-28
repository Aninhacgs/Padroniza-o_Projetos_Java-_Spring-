package com.mvc.modelo;

import java.util.Scanner;

public class Modelo {
	
		private double saldoAtual = 0.0;
		private String nomePessoa = "";
		private String cpf = "";
		private int numeroConta;
		private int agencia;
		
		
		
		/*Métodos Getters*/
		
		public double getSado() {
			return this.saldoAtual;
		}
		
		public String getNome() {
			return this.nomePessoa;
		}
		
		public String getCPF() {
			return this.cpf;
		}
		
		public int getConta() {
			return this.numeroConta;
		}
		
		public int getAgencia() {
			return this.agencia;
		}
	
		
		
		/*Métodos Setters*/
		
		private void setSaldo(double saldoAtual) {
			this.saldoAtual = saldoAtual;
		}
		
		private void setNome(String nomePessoa) {
			this.nomePessoa = nomePessoa;
		}
		
		private void setCPF(String cpf) {
			this.cpf = cpf;
		}
		
		private void setConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}
		
		private void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		
		
		public void EntradaDados(){
			Scanner SC = new Scanner(System.in);
			System.out.println("Nome do Cliente..........:");
			setNome(SC.nextLine());
			System.out.println("\nCPF..........:");
			setCPF(SC.nextLine());
			System.out.println("\nNúmero da conta..........:");
			setConta(Integer.parseInt(SC.nextLine()));
			System.out.println("\nAgencia..........:");
			setAgencia(Integer.parseInt(SC.nextLine()));
		}
		
		public void Creditar(double valor) {
			setSaldo(valor);
		}
		
		public int Debitar(double valor) {
			double aux;
			int resp;
			aux = getSado();
			if(aux>valor) {
				aux = aux - valor;
				setSaldo(aux);
				resp = 1;
			}
			
			else {
				resp = 0;
			}
			
			return resp;
			
			
		}
}
