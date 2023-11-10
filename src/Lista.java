public class Lista {
    private Nodo inicio, fin;

    public Lista() {
        inicio = fin = null;
    }

    // Método para determinar si la lista está vacía

    public boolean listaVacia() {
        return inicio == null;
    }

    public void agregarInicio(int el) {
        // Verifica si la lista no está vacía
        if (!listaVacia()) {
            // Si la lista no está vacía, crea un nuevo nodo con el elemento dado,
            // establece el siguiente nodo como el actual inicio de la lista y el anterior
            // como nulo
            inicio = new Nodo(el, inicio, null);

            // Luego, actualiza el nodo siguiente al antiguo inicio para que apunte al nuevo
            // inicio
            inicio.siguiente.anterior = inicio;
        } else {
            // Si la lista está vacía, crea un nuevo nodo con el elemento dado y establece
            // tanto
            // el inicio como el fin de la lista como este nuevo nodo
            inicio = fin = new Nodo(el);
        }
    }

    public void agregarFin(int el) {

        if (!listaVacia()) {
            fin = new Nodo(el, null, fin);
            fin.anterior.siguiente = fin;
        } else {

            inicio = fin = new Nodo(el, null, null);
        }
    }

    //Metodo para eliminar el nodo del inicio
    public void eliminarInicio() {
        if (!listaVacia()) {
            inicio = inicio.siguiente;
            if (inicio != null) {
                
                inicio.anterior = null;
            } else {
                
                fin = null;
            }
        } else {
        
            System.out.println("La lista está vacía, no se puede eliminar el inicio.");
        }
    }

    // Método para imprimir

    public void imprimir() {
        if (!listaVacia()) {
            System.out.println("");
            Nodo recorrido = inicio;
            while (recorrido != null) {
                System.out.println("<--[" + recorrido.Dato + "]-->");
                recorrido = recorrido.siguiente;
            }
        }
    }

}
