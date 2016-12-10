package mx.com.everis.javaweb.model;

public class Personaje {
	private long clave;
	private String nombre;
	private String empresa;
	
	public Personaje(long clave, String nombre, String empresa) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.empresa = empresa;
	}
	public long getClave() {
		return clave;
	}
	public void setClave(long clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}	
	
}
