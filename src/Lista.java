public class Lista {
    private Nodo inicio, fin;

    public Lista() {
        inicio = fin = null;
    }

    //Método para determinar si la lista está vacía

    public boolean listaVacia(){
        return inicio==fin;
    }

}
