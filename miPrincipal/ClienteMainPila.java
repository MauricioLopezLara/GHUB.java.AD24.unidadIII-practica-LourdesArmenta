package miPrincipal;
import pila.Pila;

public class ClienteMainPila {
    public static void main(String[] args) {
        //Crear una pila de enteros
        Pila<Integer> pila = new Pila<Integer>();
        System.out.println("El tamaño de la pila es: "+pila.getTamanio());
        //apilar algunos datos
        pila.apilar(2);
        pila.apilar(5);
        pila.apilar(7);
        System.out.println("El tamaño de la pila es: "+pila.getTamanio());
        System.out.println("El tope de la pila es :"+pila.cima());
        pila.retirar();
        System.out.println("El tope de la pila es :"+pila.cima());
        pila.retirar();
        System.out.println("El tope de la pila es :"+pila.cima());
        pila.retirar();
        System.out.println("El tope de la pila es :"+pila.cima());
        System.out.println("El tamaño de la pila es: "+pila.getTamanio());



        
    }
    
}
