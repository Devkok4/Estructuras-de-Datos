package EstructurasDeDatos;

public class ListaDobleEnlazada {
	private NodoDoble primeroLista;
	
	public ListaDobleEnlazada() {
		this.primeroLista=null;

	}
	
	public void agregarNodoDoble(int dato) {
		NodoDoble nuevoNodo= new NodoDoble(dato);
		if(primeroLista==null) {
			primeroLista=nuevoNodo;
			
		}
		else {
			NodoDoble temp=primeroLista;
			while(temp.getSiguienteDoble()!=null) {
				temp=temp.getSiguienteDoble();
			}
			
			nuevoNodo.setAnteriorDoble(temp);
			temp.setSiguienteDoble(nuevoNodo);
			nuevoNodo.setSiguienteDoble(null);
		}
	}
	
	public void eliminarNodoDobble(int dato) {
		
	    if (primeroLista == null) {
	        System.out.println("No hay suficientes datos.");
	        return;
	    }

	    NodoDoble temp = primeroLista;
	    if (temp.getValor() == dato) {
	        System.out.println("Dato extraído: " + temp.getValor());
	        primeroLista = temp.getSiguienteDoble(); // Mover el puntero al siguiente nodo
	        if (primeroLista != null) {
	            primeroLista.setAnteriorDoble(null); // Si hay un nuevo primer nodo, quitar referencia al anterior
	        }
	        return;
	    }
	    
	    while (temp != null && temp.getValor() != dato) {
	        temp = temp.getSiguienteDoble();
	    }

	    // Si no se encontró el nodo
	    if (temp == null) {
	        System.out.println("No se ha encontrado el dato.");
	        return;
	    }
	    System.out.println("Dato extraído: " + temp.getValor());
	    NodoDoble anterior = temp.getAnteriorDoble();
	    NodoDoble siguiente = temp.getSiguienteDoble();

	    // Si el nodo a eliminar está en medio de la lista
	    if (siguiente != null) {
	        anterior.setSiguienteDoble(siguiente);
	        siguiente.setAnteriorDoble(anterior);
	    } else {
	        // Si el nodo a eliminar es el último
	        anterior.setSiguienteDoble(null);
	    }
	}
}
