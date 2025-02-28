package EstructurasDeDatos;

public class ArbolBB {
    private NodoArbol raiz;

    public ArbolBB() {
        this.raiz = null;
    }

    // 🔹 Inserción corregida
    private NodoArbol insercionRecursiva(NodoArbol nodoActual, int dato) {
        if (nodoActual == null) {
            return new NodoArbol(dato);
        }
        if (dato < nodoActual.getHoja()) {
            nodoActual.setIzquierda(insercionRecursiva(nodoActual.getIzquierda(), dato));  // 🔹 Ahora actualiza el subárbol izquierdo
        } else if (dato > nodoActual.getHoja()) {
            nodoActual.setDerecha(insercionRecursiva(nodoActual.getDerecha(), dato));  // 🔹 Ahora actualiza el subárbol derecho
        } else {
            System.out.println("⚠️ Hoja con ese valor ya existe.");
        }
        return nodoActual;
    }

    public void insertarHoja(int dato) {
        raiz = insercionRecursiva(raiz, dato);
    }

    // 🔹 Eliminación corregida
    private NodoArbol eliminacionRecursiva(NodoArbol nodoActual, int dato) {
        if (nodoActual == null) {
            System.out.println("⚠️ No hay datos en el árbol.");
            return null;
        }
        if (dato < nodoActual.getHoja()) {
            nodoActual.setIzquierda(eliminacionRecursiva(nodoActual.getIzquierda(), dato));
        } else if (dato > nodoActual.getHoja()) {
            nodoActual.setDerecha(eliminacionRecursiva(nodoActual.getDerecha(), dato));
        } else {
            // Caso 1: Nodo sin hijos
            if (nodoActual.getIzquierda() == null && nodoActual.getDerecha() == null) {
                return null;
            }
            // Caso 2: Nodo con un solo hijo
            if (nodoActual.getIzquierda() == null) {
                return nodoActual.getDerecha();
            }
            if (nodoActual.getDerecha() == null) {
                return nodoActual.getIzquierda();
            }
            // Caso 3: Nodo con dos hijos (encontrar el sucesor)
            NodoArbol sucesor = encontrarMinimo(nodoActual.getDerecha());
            nodoActual.setHoja(sucesor.getHoja());
            nodoActual.setDerecha(eliminacionRecursiva(nodoActual.getDerecha(), sucesor.getHoja()));
        }
        return nodoActual;
    }

    public void eliminarHoja(int dato) {
        raiz = eliminacionRecursiva(raiz, dato);  // 🔹 Llamada corregida
    }

    // 🔹 Método para encontrar el menor nodo (sucesor en eliminación)
    private NodoArbol encontrarMinimo(NodoArbol nodo) {
        while (nodo.getIzquierda() != null) {
            nodo = nodo.getIzquierda();
        }
        return nodo;
    }

    // 🔹 Recorrido InOrden corregido
    public void inOrden() {
        recorridoInOrden(raiz);
        System.out.println();
    }

    private void recorridoInOrden(NodoArbol actual) {
        if (actual != null) {
            recorridoInOrden(actual.getIzquierda());
            System.out.print(actual.getHoja() + " -> ");
            recorridoInOrden(actual.getDerecha());
        }
    }

    // 🔹 Recorrido PreOrden corregido
    public void preOrden() {
        recorridoPreOrden(raiz);
        System.out.println();
    }

    private void recorridoPreOrden(NodoArbol actual) {
        if (actual != null) {
            System.out.print(actual.getHoja() + " -> ");
            recorridoPreOrden(actual.getIzquierda());
            recorridoPreOrden(actual.getDerecha());
        }
    }

    // 🔹 Recorrido PostOrden corregido
    public void postOrden() {
        recorridoPostOrden(raiz);
        System.out.println();
    }

    private void recorridoPostOrden(NodoArbol actual) {
        if (actual != null) {
            recorridoPostOrden(actual.getIzquierda());
            recorridoPostOrden(actual.getDerecha());
            System.out.print(actual.getHoja() + " -> ");
        }
    }
}
