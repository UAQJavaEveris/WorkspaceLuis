package mx.com.everis.javaweb.ws.test;

import java.rmi.RemoteException;

import mx.com.everis.javaweb.model.Personaje;
import mx.com.everis.javaweb.ws.services.Crud;
import mx.com.everis.javaweb.ws.services.CrudProxy;

public class Test {

	public static void main(String[] args) {
		Personaje personaje = new Personaje();
		boolean status=false;
		personaje.setNombre("Bill Gates");
		personaje.setEmpresa("Microsoft");
		
		Crud crud = new CrudProxy("http://localhost:8082/Crud/services/Crud");
		
		
		try {
			status = crud.insertPerson(personaje);			
			System.out.println("Listo!");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
