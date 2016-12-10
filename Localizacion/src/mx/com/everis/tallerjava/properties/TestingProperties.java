package mx.com.everis.tallerjava.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class TestingProperties {
	
	public static void main(String [] args) throws FileNotFoundException, IOException{
		
		
		Properties properties = new Properties();
		FileInputStream file= new FileInputStream("src/mx/com/everis/tallerjava/properties/MsgErrores_MX.properties");
		properties.load(file);
		file.close();
		getProperties(properties);
		properties.put("calidad", "1080p");
		
		FileOutputStream output = new FileOutputStream("src/mx/com/everis/tallerjava/properties/MsgErrores_MX.properties");
		properties.store(output, "Editando el archivo properties");
		output.flush();
		output.close();		
		getProperties(properties);
	
	}

	public static void getProperties(Properties properties){
		/*String nombre = properties.getProperty("nombre");
		String precio = properties.getProperty("precio");
		String anio = properties.getProperty("anio");*/
		
		Set<String> prope=properties.stringPropertyNames();
		Iterator<String> ite =prope.iterator(); 
		while(ite.hasNext()){
			System.out.print(properties.getProperty(ite.next()));
			if(ite.hasNext())
				System.out.print(" - ");
			else
				System.out.println("");			
		}
		
		//System.out.println(nombre+" - "+precio+" - "+anio);
		
		
	}
	
}
