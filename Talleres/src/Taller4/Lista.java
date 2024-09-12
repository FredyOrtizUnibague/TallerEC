package Talleres.src.Taller4;

public class Lista {
	
	private Nodo inicio;
	private int tamanio;
	
	public Lista()
	{
		inicio = null;
		tamanio = 0;
	}
	
	
	public void insertar (Nombres nombre)
	{
		if (!contiene(nombre))
		{
			Nodo nuevoNodo = new Nodo(nombre);
			nuevoNodo.setSiguiente(inicio);
			inicio = nuevoNodo;
			tamanio++;
		}
		else
		{
			System.out.println("No pueden ser nombres repetidos");
		}
	}
	
	private boolean contiene(Nombres nombre) {
	    Nodo temp = inicio;
	    while (temp != null) {
	        // Comparamos el nombre del objeto actual con el nombre que queremos insertar
	        if (temp.getNombre().getNombre().equals(nombre.getNombre())) {
	            return true;
	        }
	        temp = temp.getSiguiente();
	    }
	    return false;
	}
	public void verNombres() 
	{
		Nodo puntero = null;
		if (inicio==null)
		{
			System.out.println("No hay nombres que mostrar.");
		}
		else
		{
			puntero = inicio;
			while(puntero != null)
			{
				System.out.println(puntero.getNombre());
				puntero = puntero.getSiguiente();
			}
		}
	}
	
	public Nombres obtenerNombre (int n)
	{
		Nodo puntero = null;
		if (inicio == null)
		{
			return null;
		}
		else
		{
			puntero = inicio;
			int contador = 0;
			while (contador < n && puntero.getSiguiente() != null)
			{
				puntero = puntero.getSiguiente();
				contador++;
			}
			if (contador != n)
			{
				return null;
			}
			else 
			{
				return puntero.getNombre();
			}
		}
	}
	
	public void eliminarPosicion (int n)
	{
		Nodo primero = null;
		Nodo puntero = null;
		if (inicio == null)
		{
			System.out.println("No hay nombres para eliminar");
		}
		else if (n == 0)
		{
			primero = inicio;
			inicio = inicio.getSiguiente();
			primero.setSiguiente(null);
			tamanio--;
		}
		else if (n < tamanio)
		{
			puntero = inicio;
			int contador = 0;
			while (contador < (n-1))
			{
				puntero = puntero.getSiguiente();
				contador++;
			}
			Nodo temp = puntero.getSiguiente();
			puntero.setSiguiente(temp.getSiguiente());
			temp.setSiguiente(null);
			tamanio--;
		}
	}
	
	
}

