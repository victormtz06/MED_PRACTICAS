package Parcial1;

import java.util.ArrayList;

public class Ejercicio1_ListaUtiles {
    public static void main(String[] args) {
        ArrayList<String> utiles = new ArrayList<>();

        utiles.add("Cuaderno");
        utiles.add("Lápiz");
        utiles.add("Borrador");
        utiles.add("Regla");
        utiles.add("Colores");
        utiles.add("Tijeras");
        utiles.add("Folders");
        utiles.add("Pegamento");
        utiles.add("Mochila"); //elemento con error, debe ser cambiado por sacapuntas

        int indiceError = utiles.indexOf("Mochila");
        if (indiceError != -1) {
            utiles.set(indiceError, "Sacapuntas");
            /*lo que hace este codigo con la agregacion de la linea faltante es
            reemplazar el elemento incorrecto (mochila) por sacapuntas mediante una propiedad de indice
            la cual busca el valor del indice del elemento incorrecto para sustituirlo */
        }

        utiles.add("Plumones"); //elemento plumones agregado
        utiles.remove("Folders"); //elemento folder borrado

        System.out.println("Lista de útiles corregida:");
        for (String item : utiles) {
            System.out.println("- " + item);
        }
    }
}