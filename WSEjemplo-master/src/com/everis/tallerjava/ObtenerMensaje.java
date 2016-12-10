package com.everis.tallerjava;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ObtenerMensaje {
	
	@WebMethod
	public String obtenerMsj(){
		return "Hola Mundo desde un WS";
	}

}
