package Mundo;

public class Nombres {

	private String nombres;

	/**
	 * @param nombre
	 */
	public Nombres(String nombre) {
		this.nombres = nombre;
	}

	public String getNombre() {
		return nombres;
	}

	public void setNombre(String nombre) {
		this.nombres = nombre;
	}

	@Override
	public String toString() {
		return "Nombres [nombre=" + nombres + "]";
	}
	
	
}
