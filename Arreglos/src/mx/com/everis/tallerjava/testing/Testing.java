package mx.com.everis.tallerjava.testing;

import mx.com.everis.tallerjava.MiException.MiException;

public class Testing {


public static void main(String args[]) throws MiException {
	int valorA=5;
	int valorB=1;
if(valorA>=valorB){
	//try{
		//throw new MiException();
	/*}catch(MiException e){
		System.out.println("Se genero un error");
		e.printStackTrace();
		System.out.println(e.getMessage());
	}finally{
		System.out.println("Siempre se ejecuta");*/
	}else{
		System.out.println("Sin Exception");
	}
	
	insertDB();
	}
	
	public static void insertDB() throws MiException{
	
}

}
