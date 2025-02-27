package EstructurasDeDatos;

public class ListaEnlazada {
	private Nodo primeroLista;

	public ListaEnlazada() {
		this.primeroLista=null;
	}
	
	public void insertarNodoLista(int dato) {
		Nodo nuevoNodo=new Nodo(dato);
		if (primeroLista==null) {
			primeroLista=nuevoNodo;
		}
		else {
			Nodo temp=primeroLista;
			while(temp.getSiguiente()!=null) {
				temp=temp.getSiguiente();
			}
			temp.setSiguiente(nuevoNodo);
			
		}
	}
	public void eliminarNodoLista(int dato) {
		if(primeroLista==null) {
			System.out.println("No hay datos.");
			return;
		}
		if (primeroLista.getDato()==dato) {
			System.out.println("Dato extraido: "+ primeroLista.getDato());
			return;
		}
		
		else {
			Nodo temp=primeroLista;
			Nodo anterior=null;
			while(temp.getSiguiente()!=null && temp.getDato()!=dato) {
				anterior=temp;
				temp=temp.getSiguiente();
			}
			if (temp.getDato()==dato) {
				System.out.println("Dato eliminado: " + temp.getDato());
				anterior.setSiguiente(temp.getSiguiente());
				
			}
			else {
				System.out.println("No se ha encontrado el dato");
				
			}
			
		}
	}
	public void recorrerLista() {
		if(primeroLista==null) {
			System.out.println("No hay datos.");
			
		}
		else {
			Nodo temp=primeroLista;
			while(temp!=null) {
				System.out.println(temp+ " -> ");
				temp=temp.getSiguiente();
			}
			System.out.println(" NULL ");
		}
	}
}
