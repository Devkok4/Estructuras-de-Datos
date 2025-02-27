package EstructurasDeDatos;

public class DinamicStack {
	private Nodo head;
	public DinamicStack() {
		this.head=null;
	}
	
	public void insertarDatoStack(int dato) {
		Nodo nuevoNodo= new Nodo(dato);
		
		if(head==null) {
			head=nuevoNodo;
			head.setSiguiente(null);
		}
		
		else {
			nuevoNodo.setSiguiente(head);
			head=nuevoNodo;
		}
	}
	
	public void obtenerDatoStack() {
		if(head==null) {
			System.out.println("No hay datos.");
			
		}
		
		else {
			System.out.println("Dato Extraido -> "+ head.getDato());
			head= head.getSiguiente();
		}
	}
	public void mostrarDatosStack() {
		if(head==null) {
			System.out.println("No hay datos.");
			
		}
		
		else {
			Nodo temp=head;
			while(temp!=null) {
				System.out.println("Dato Extraido -> "+ temp.getDato());
				temp= temp.getSiguiente();
			}

		}
	}
	
}
