public class Nodo {
    
    public int Dato;
    Nodo siguiente, anterior;
    public int valor;


    //constructor para añadir un elemento al inicio
    public Nodo(int d, Nodo s, Nodo a){
        Dato =d;
        siguiente= s;
        anterior= a;

    }
    //constructor para cuando la lista está vacia

    public Nodo(int d){
        //Es lo mismo como si ousieramos this.dato=d, this.anterior=null, pero de manera mas simple. 
        this(d,null,null);
    }
}
