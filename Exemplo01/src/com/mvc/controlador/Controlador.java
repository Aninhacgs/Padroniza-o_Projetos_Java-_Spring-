package com.mvc.controlador;

import com.mvc.modelo.Modelo;

public class Controlador {
	
	public boolean validarLogin(String usuario, String senha){
		Modelo modelo = new Modelo();
		return modelo.validarLogin(usuario,senha);
	}

}
