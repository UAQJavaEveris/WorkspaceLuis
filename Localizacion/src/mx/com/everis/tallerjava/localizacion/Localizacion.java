package mx.com.everis.tallerjava.localizacion;

import java.util.Locale;
import java.util.ResourceBundle;

public class Localizacion {

	public static void imprimirDetallePelicula(ResourceBundle resourceBundle){
		String nombre = resourceBundle.getString("nombre");
		Float precio = (Float)resourceBundle.getObject("precio");
		Integer anio = (Integer)resourceBundle.getObject("anio");
		System.out.println(nombre+" - "+precio+" - "+anio);
	}
	
	public static void main(String[] args) {
		
		Locale locale =Locale.getDefault();
		System.out.println("Idioma: "+locale.getLanguage());
		System.out.println("País: "+locale.getDisplayCountry());
		
		Locale locales[]= Locale.getAvailableLocales();
		
		/*for(Locale l : locales){
			System.out.println("País: "+l.getDisplayCountry()+" "+"Idioma: "+l.getDisplayLanguage());
			
		}*/
		
		
		Locale currentLocale = Locale.getDefault();
		imprimirDetallePelicula(ResourceBundle.getBundle("mx.com.everis.tallerjava.localizacion.MsgErrores",currentLocale));
		
		
		Locale italiano = Locale.ITALY;
		//Locale italiano2= new Locale("it","IT");
		imprimirDetallePelicula(ResourceBundle.getBundle("mx.com.everis.tallerjava.localizacion.MsgErrores2_it_IT",italiano));
	}

}
