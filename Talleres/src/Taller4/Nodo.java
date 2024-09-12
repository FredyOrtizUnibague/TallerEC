package Talleres.src.Taller4;

public class Nodo {

	private Nodo siguiente;
	private Nombres nombre;
	
	public Nodo (Nombres nombre)
	{
		siguiente=null;
		this.nombre = nombre;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public Nombres getNombre() {
		return nombre;
	}

	public void setNombre(Nombres nombre) {
		this.nombre = nombre;
	}
	
}

