package listas;

import java.util.ArrayList;

public class Loop {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("The");
        list.add("Free");
        list.add("Range");
        list.add("Tester");
        list.add("BD");

        for (int i = 0; i < list.size(); ++i) {
            System.out.println("Va a iterar hasta que i no sea menor que el tamaño de la lista, es decir, cuando termine con la lista.");
            System.out.println(list.size());

        }
    }
}
