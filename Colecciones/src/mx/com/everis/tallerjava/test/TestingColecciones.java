package mx.com.everis.tallerjava.test;

import java.util.ArrayList;
import java.util.List;

public class TestingColecciones {

	public static void main(String[] args){
		ArrayList<String>nombre = new ArrayList<String>();
		nombre.add("LuisA");
		nombre.add("LuisB");
		nombre.add("LuisC");
		
		for(String s : nombre){
			System.out.println(s);			
		}
		
		List<String> apellidos = new ArrayList<String>();
		apellidos.add("MartinezA");
		apellidos.add("MartinezB");
		apellidos.add("MartinezC");		
		System.out.println("Size apellidos: "+apellidos.size());
		System.out.println(apellidos.get(0));
		if(apellidos.contains("MartinezA")){
			System.out.println("Contiene el apellido");
		}else{
			System.out.println("No contiene el apellido");
		}
		
		
		//Iterator
		//Map<llave,valor>
		
		
	}	
}
