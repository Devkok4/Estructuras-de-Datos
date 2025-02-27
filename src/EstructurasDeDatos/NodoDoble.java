package EstructurasDeDatos;

public class NodoDoble {
	private int dato;
	private NodoDoble siguiente;
	private NodoDoble anterior;
	public NodoDoble(int dato) {
		this.dato=dato;
		this.siguiente=null;
		this.anterior=null;
		
	}	
	public int getValor() {
		return dato;
	}
	public NodoDoble getSiguienteDoble() {
		return siguiente;
	}
	public NodoDoble getAnteriorDoble() {
		return anterior;	
	}
	
	public void setSiguienteDoble(NodoDoble nuevoNodo) {
		this.siguiente=nuevoNodo;
	}
	
	public void setAnteriorDoble(NodoDoble nuevoNodo) {
		this.anterior=nuevoNodo;
	}
	public void setDato(int dato) {
		this.dato=dato;
	}
	
}
