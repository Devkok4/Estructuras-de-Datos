package EstructurasDeDatos;

public class NodoDoble {
	private int dato;
	private Nodo siguiente;
	private Nodo anterior;
	public NodoDoble(int dato) {
		this.dato=dato;
		this.siguiente=null;
		this.anterior=null;
		
	}	
	public int getDato() {
		return dato;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public Nodo getAnterior() {
		return anterior;	
	}
	
	public void setSiguiente(Nodo nuevoNodo) {
		this.siguiente=nuevoNodo;
	}
	
	public void setAnterior(Nodo nuevoNodo) {
		this.anterior=nuevoNodo;
	}
	public void setDato(int dato) {
		this.dato=dato;
	}
	
}
