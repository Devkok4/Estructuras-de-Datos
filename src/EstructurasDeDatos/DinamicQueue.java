package EstructurasDeDatos;

public class DinamicQueue {
	private Nodo firstList;
	private Nodo lastList;
	
	public DinamicQueue() {
		this.firstList=null;
		this.lastList=null;
	}
	
	public void agregarNodoQueue(int dato) {
		Nodo nuevoNodo= new Nodo(dato);
		if (firstList==null) {
			firstList=nuevoNodo;
			lastList=nuevoNodo;
		}
		else {
			lastList=nuevoNodo;
		}
		lastList.setSiguiente(null);
	}
	public void eliminarNodoQueue() {
		if(firstList==null) {
			System.out.println("No hay datos.");
		}
		else {
			System.out.println("Dato Extraido: " + firstList.getDato());
			firstList=firstList.getSiguiente();
			if (firstList==null) {
				lastList=null;
			}
		}
	}
	
	public void mostrarQueue() {
		if(firstList==null) {
			System.out.println("No hay datos.");
		}
		else {
			Nodo temp= firstList;
			while (temp!=null) {
				System.out.println(temp.getDato() +"->");
				temp=temp.getSiguiente();
				if (temp.getSiguiente() != null) {
	                System.out.print(" -> "); 
	            }
			}
			
		}
	}
}

