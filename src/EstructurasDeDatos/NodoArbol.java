package EstructurasDeDatos;

public class NodoArbol {
	private int dato;
	private NodoArbol izq;
	private NodoArbol der;
	public NodoArbol(int dato) {
		this.dato=dato;
		this.izq=null;
		this.der=null;
	}
	
	public int getHoja() {
		return dato;
	}
	public NodoArbol getIzquierda() {
		return izq;
	}
	public NodoArbol getDerecha() {
		return der;
	}
	
	public void setHoja(int dato) {
		this.dato=dato;
	}
	public void setDerecha(NodoArbol derecha) {
		this.der=derecha;
	}
	public void setIzquierda(NodoArbol izquierda) {
		this.izq=izquierda;
	}
}
