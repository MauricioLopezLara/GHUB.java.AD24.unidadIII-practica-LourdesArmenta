package miPrincipal;
import java.util.Hashtable;
import hashtable.Ciudad;
import java.util.Enumeration;
import java.util.Scanner;

import java.util.Iterator;

public class PruebaTablaDispersionCiudad{
    public static void main(String[] args) {
        //instanciar varias ciudades
        Ciudad c1 = new Ciudad("Buenos Aires", 1000000, "Buenos Aires", "Argentina");
        Ciudad c2 = new Ciudad("Mexico DF", 2000000, "Distrito Federal", "Mexico");
        Ciudad c3 = new Ciudad("Madrid", 3000000, "Madrid", "España");
        Ciudad c4 = new Ciudad("Culiacan", 800000, "Sinaloa", "Mexico");

        //crear la tabla hash
        Hashtable<String,Ciudad> tabla = new Hashtable<String, Ciudad>();
        //agregar elementos a la tabla
        tabla.put(c1.getNombre(),c1);
        tabla.put(c2.getNombre(),c2);
        tabla.put(c3.getNombre(),c3);
        tabla.put(c4.getNombre(),c4);

        //acceder a los elementos de la tabla
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la ciudad a buscar: ");
        String nombreCiudad = entrada.nextLine();
        Ciudad ciudad = tabla.get(nombreCiudad);
        if(ciudad != null){
            System.out.println(ciudad);
        }else{  
            System.out.println("La ciudad no se encuentra en la tabla");
        }
        System.out.println();
        //recorrer toda la hashtable a través de la interface Enumeration
        System.out.println("Recorriendo la tabla con iterator");
        String aux;
        Enumeration<String> keys = tabla.keys();
        while(keys.hasMoreElements()){
            aux = keys.nextElement();
            System.out.println(aux+" = "+tabla.get(aux));
        }

        //ahora la recorro utilizado iterator
        System.out.println("Recorriendo la tabla con iterator");

        Iterator<String> it = tabla.keySet().iterator();
        while(it.hasNext()){
            aux = it.next();
            System.out.println(aux+" = "+tabla.get(aux));
        }


    }


}
