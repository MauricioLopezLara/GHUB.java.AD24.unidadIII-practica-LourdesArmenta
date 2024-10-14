package miPrincipal;
import java.util.Stack;

public class ClienteMainStack {
    public static void main(String[] args) {
        try{
            Stack<Integer> pila = new Stack<Integer>();
            System.out.println("El tamaño de la pila es: "+pila.size());
            pila.push(2);
            pila.push(5);
            pila.push(7);
            System.out.println("El tamaño de la pila es: "+pila.size());
            System.out.println("La posicion del elemento 2 esta en :"+pila.search(2));
            System.out.println("La posicion del elemento 5 esta en :"+pila.search(5));
            System.out.println("La posicion del elemento 7 esta en :"+pila.search(7));
            System.out.println("El tope de la pila es: "+pila.peek());
            pila.pop();
            System.out.println("El tope de la pila es: "+pila.peek());
            pila.pop();
            System.out.println("El tope de la pila es: "+pila.peek());
            pila.pop();
            System.out.println("El tope de la pila es: "+pila.peek()); //lanza una excepcion cuando es null
        }
        catch(Exception e){
            e.getMessage();
        }



        
    }
    
}
