package miPrincipal;
import java.util.Hashtable;
import hashtable.Persona;
import java.util.Enumeration;


public class Principal {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        //instanciar varias personas
        Persona p1 = new Persona("Pablo",33,"Argentino");
        Persona p2 = new Persona("Juan",24,"Mexicano");
        Persona p3 = new Persona("Pedro", 18,"Español");

        //crear la tabla hash
        Hashtable<String,Persona> tabla = new Hashtable<String, Persona>();
        //agreamos las personas a la tabla
        tabla.put(p1.getNombre(),p1);
        tabla.put(p2.getNombre(),p2);
        tabla.put(p3.getNombre(),p3);

        //acceder a los elementos de la tabla
        System.out.println(tabla.get("Juan"));
        System.out.println(tabla.get("Pablo"));
        System.out.println(tabla.get("Pedro"));


        System.out.println(tabla.get("Luis"));//retorna null porque el key Luis no fue ingresado
        //recorre toda la hashtable a través de la interface Enumeration
        String aux;
        Enumeration<String> keys = tabla.keys();
        while(keys.hasMoreElements()){
            aux = keys.nextElement();
            System.out.println(aux+" = "+tabla.get(aux));

        }
        
        


        
    }
}