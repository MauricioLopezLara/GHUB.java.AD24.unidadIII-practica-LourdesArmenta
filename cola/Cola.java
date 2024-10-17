package cola;

public class Cola <T>
{
    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamañio;
                                                                                                         
    public Cola(Nodo<T> cabeza, Nodo<T> cola, int tamañio) {
        this.cabeza = cabeza;
        this.cola = cola;
        this.tamañio = tamañio;
    }
    
}