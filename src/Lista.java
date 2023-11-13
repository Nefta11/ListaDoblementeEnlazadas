import javax.swing.JOptionPane;

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

    // Metodo para eliminar el nodo del inicio
    public void eliminarInicio() {
        if (!listaVacia()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                inicio = inicio.siguiente;
                inicio.anterior = null;
            }
        } else {

            System.out.println("La lista está vacía, no se puede eliminar el inicio.");
        }
    }

    // Método para eliminar el nodo final
    public void eliminarFin() {
        if (!listaVacia()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                fin = fin.anterior;
                fin.siguiente = null;
            }
        } else {

            System.out.println("La lista está vacía, no se puede eliminar el final.");
        }
    }

    public void eliminarElementoE(int el) {
        System.out.println("");
        if (inicio == fin && el == inicio.Dato) {
            inicio = fin = null;
        } else if (el == inicio.Dato) {
            inicio = inicio.siguiente;
        } else {
            Nodo recorrido = inicio;
            while (recorrido != null) {
                if (recorrido.Dato == el) {
                    recorrido.siguiente.anterior = inicio;
                    recorrido.anterior.siguiente = fin;
                }
            }
        }
    }

    public void buscarElemento(int el) {
        if (!listaVacia()) {
            System.out.println("");
            Nodo recorrido = inicio;
            int contador = 1;
            while (recorrido != null) {

                if (recorrido.Dato == el) {
                    JOptionPane.showMessageDialog(null,
                            "El elemento " + recorrido.Dato + " Se encuentra en la posicion: \n" + contador);
                    break;
                }
                contador++;
                recorrido = recorrido.siguiente;
            }
        }
    }

    public void actualizarElemento(int el, int newDate) {
        if (!listaVacia()) {
            Nodo recorrido = inicio;

            while (recorrido != null) {
                if (recorrido.Dato == el) {
                    recorrido.Dato = newDate;

                    JOptionPane.showMessageDialog(null,
                            "El elemento " + recorrido.anterior.Dato + " Se actualizo a :\n" + recorrido.Dato);
                }
                recorrido = recorrido.siguiente;
            }
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
