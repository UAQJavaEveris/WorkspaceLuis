package mx.com.everis.tallerjava.arreglos;

import mx.com.everis.tallerjava.persona.Persona;

public class Arreglos {
	String nombre [] = {"hola1","hola2","hola3","hola4"};
	int valores []={1,2,3,4,5};
	double decimales []={1.1,1.2,1.3,1.4,1.5};
	Double decimales2 []={new Double(1.2),new Double(3.3)};
	static Persona personas[] ={new Persona("Luis","Martinez",22),new Persona("Alberto","Gallegos",21)};

	public static void main(String[] args) {
		for(int i=0;i< personas.length;i++){
			System.out.println(personas[i].getNombre()+" "+personas[i].getApellido()+" "+personas[i].getEdad());
		}
		
		
		
		for(Persona p : personas){
			System.out.println(p.getNombre()+" "+p.getApellido()+" "+p.getEdad());
		}
		
	}

}
