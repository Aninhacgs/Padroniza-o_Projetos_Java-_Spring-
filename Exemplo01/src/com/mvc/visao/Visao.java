package com.mvc.visao;

import com.mvc.controlador.Controlador;

public class Visao {
   public static void main(String[]args) {
	   Visao visao =  new Visao();
	   visao.simularCliqueUsuarioParaValidarLogin("dellead","123456");
   }
   
   public void simularCliqueUsuarioParaValidarLogin(String usuario, String senha) {
	   System.out.println("Simulando o clique de um usuário do sistema para validação de login...");
	   Controlador controlador = new Controlador();
	   boolean resultado = controlador.validarLogin(usuario,senha);
	   System.out.println("Validação ok? "+resultado);
   }
}
