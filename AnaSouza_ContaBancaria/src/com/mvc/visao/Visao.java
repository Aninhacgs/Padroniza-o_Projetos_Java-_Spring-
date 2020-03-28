package com.mvc.visao;

import java.util.Scanner;

import com.mvc.controlador.Controlador;

public class Visao {
    public static void main(String[] args) {
    	Visao visao = new Visao();
    	visao.CadastroCliente();
    }
    
    public void CadastroCliente() {
    	Scanner SC = new Scanner(System.in);
    	
    	System.out.println("==========CADASTRANDO CLIENTE==========\n");
    	Controlador controlador = new Controlador();
    	controlador.Principal();
    	/*Creditando valor*/
    	int conta = controlador.Conta();
    	int agencia = controlador.Agencia();
    	double valor,saldo;
    	System.out.println("========== CREDITANDO VALOR EM CONTA ==========\n");
    	System.out.println("Digite o valor a ser creditado..........:");
    	valor = (Double.parseDouble(SC.nextLine()));
    	boolean credito = controlador.creditarValor(valor,conta,agencia);
    	System.out.println("\nOperação de crédito realizada com sucesso? "+credito);
    	saldo = controlador.MostraSaldo();
    	System.out.println("Saldo Atual R$: "+saldo);
    	System.out.println("\n========== DEBITANDO VALOR EM CONTA ==========\n");
    	System.out.println("Digite o valor a ser debitado..........:");
    	valor = (Double.parseDouble(SC.nextLine()));
    	boolean debito = controlador.debitarValor(valor, conta, agencia);
    	System.out.println("\nOperação de débito realizada com sucesso? "+debito);
    	saldo = controlador.MostraSaldo();
    	System.out.println("Saldo Atual R$: "+saldo);
    }
}
