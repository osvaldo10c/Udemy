
import java.util.*;

public class Diccionario {

    public static void main(String args[]) {
        // crear la instancia de una hashtable. vamos a pasar dos tipos, para la key: value
        Hashtable<String, String> diccionario = new Hashtable<String, String>();  // dentro de la variable Diccionario metemos la informacion de nuestro diccionario.

        // Metodo PUT () Esto para insertar informacion
        diccionario.put("Argentina", "Argentinos");
        diccionario.put("Mexico", "Mexicanos");

        // Metodo Get () para consultar informacion
        System.out.print("Valor del la key: " + diccionario.get("Mexico"));

        // Metodo isEmpy() para saber si esta vacio nuestro diccionario como respuesta responde si o no true o false
        System.out.print("El diccionario esta vacio? " + diccionario.isEmpty());

        // Metodo remove () para eliminar un valor del diccionario por medio del KEY 
        System.out.print("Valor del la key antes : " + diccionario.get("Argentina")); // consultamos antes de la eliminacion

        diccionario.remove("Argentina");

        System.out.print("Valor del la key despues : " + diccionario.get("Argentina")); // consultamos despues de la eliminacion
    }
}
