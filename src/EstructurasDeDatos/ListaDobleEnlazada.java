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
		if(primeroLista==null) {
			System.out.println("No hay suficientes datos.");
			return;
		}
		if (primeroLista.getValor()==dato) {
			System.out.println("Dato extraido: "+ primeroLista.getValor());
			
		}
		
		else {
			NodoDoble temp= primeroLista;
			while(temp.getValor()!= dato &&  temp.getSiguienteDoble()!=null) {
				temp=temp.getSiguienteDoble();
			}
			if (temp.getSiguienteDoble()==null) {
				System.out.println("No se ha encontrado el dato.");
			}
			else {
				System.out.println("Dato extraido: "+ temp.getValor());
				
			}
		}
		
	}
}
