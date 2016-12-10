package mx.com.everis.tallerjava.testing;

import mx.com.everis.tallerjava.clases.Persona;

public class TestGenerico {
	
	public static void main(String []args){
		MiGenerico<String> generico = new MiGenerico<String>("Luis");
		generico.print();
		MiGenerico<Persona> generico1 = new MiGenerico<Persona>(new Persona());
		generico1.print();
		MiGenerico<Float> generico2 = new MiGenerico<Float>(12.3f);
		generico2.print();
	}
}
