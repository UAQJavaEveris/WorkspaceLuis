package mx.com.everis.tallerjava.localizacion;

import java.util.ListResourceBundle;

public class MsgErrores2_it_IT extends ListResourceBundle{

	Object[][] contents = {
			{"nombre","PeliculaEnItaliano"},
			{"precio",(Float)80.5f},
			{"anio",(Integer)2016}						
	};
	
	@Override
	protected Object[][] getContents() {
			
		return contents;
	}
	

}
