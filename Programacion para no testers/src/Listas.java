package listas;

import java.util.ArrayList; // importamos la clase ArrayList de Java

public class Listas {

    public static void main(String[] args) {
        ArrayList<String> figuras = new ArrayList<String>(); // Creamos un instancia del objeto ArrayList llamado "figuras"
        figuras.add("Cuadrado");
        figuras.add("Triangulo");
        figuras.add("Circulo");
        figuras.add("Rectangulo");

        System.out.println(figuras.size()); // Para impimrir el total de en numero de listas comiensa por 0 en java
        System.out.print(figuras.get(0 )); // get para mandar llamar el nombre de una lista por medio de su posision que comienza por 0
        figuras.remove(0); // elimina un registro de la lista por medio de su posision
        figuras.set(0, "ESTRELLA");   // Set para actulizar un registro partiendo de la posiion del elemento a actualizar
        figuras.clear();  // limpia todos los registros de la lista.
        System.out.print(figuras);     // manda llamar todo el listado de figuras en la lista 
    }
}
