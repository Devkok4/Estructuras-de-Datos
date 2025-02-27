package EstructurasDeDatos;

public class Nodo {
	private int valor;
	private Nodo sig;
	
	public Nodo(int valor) {
		this.valor=valor;
		this.sig=null;
	}
	
	public void setValor(int dato) {
		this.valor=dato;
	}
	
	public void setSiguiente(Nodo nuevoNodo) {
		this.sig=nuevoNodo;
	}
	
	public Nodo getSiguiente() {
		return sig;
	}
	
	public int getDato() {
		return valor;
	}
}
