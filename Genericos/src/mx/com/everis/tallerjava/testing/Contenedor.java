package mx.com.everis.tallerjava.testing;

import java.util.Vector;

public class Contenedor {

	public static void main(String[] args) {
		Vector elementos = new Vector();
		elementos.add(10.5f);
		elementos.add(11.8d);
		
		for(int i=0; i<elementos.size(); i++){
			Float valorTmp = (float)elementos.get(i);
			System.out.println(valorTmp);
		}

	}

}
