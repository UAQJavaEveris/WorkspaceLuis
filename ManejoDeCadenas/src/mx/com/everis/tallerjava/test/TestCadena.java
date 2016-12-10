package mx.com.everis.tallerjava.test;

public class TestCadena {

	public static void main(String[] args) {
			
		String nombre="Luis";
		String nombre2="Luis";
		//String nombre2=new String("Luis");
		
		if(nombre == nombre2){
			System.out.println("Son Iguales");
		}else{
			System.out.println("No son iguales");
		}

		if(nombre.equals(nombre2)){
			System.out.println("Son Iguales");
		}else{
			System.out.println("No son iguales");
		}

		
		String nombreCompleto="Luis Alberto Martínez Guapo";
		String [] nombres = nombreCompleto.split("\\s");
		for(String i: nombres){
			System.out.println(i);
		}
		
		String name = nombreCompleto.trim();
		System.out.println(name);
		
		System.out.println("position: "+name.indexOf("G"));
		
		
		String valorboolean = name.valueOf(34);
		
		System.out.println(valorboolean);
	}

}
