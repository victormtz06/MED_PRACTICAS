/*Buscar una palabra en un diccionario: Imagina que tienes un diccionario almacenado como
un arreglo de palabras en orden alfabético. Diseñar un programa que solicite al usuario
ingresar una palabra y luego utilice la búsqueda secuencial para determinar si la palabra
está presente en el diccionario. Si la palabra se encuentra, muestra un mensaje indicando
que fue encontrada; de lo contrario, muestra un mensaje indicando que no está en el
diccionario. */

package Guia05;
import java.util.Scanner;

public class Ejercicio4_BuscarEnDiccionario {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] diccionario = {"casa", "gato", "libro", "mesa", "perro", "silla", "ventana"};

        System.out.println("**** BUSQUEDA DE PALABRA EN DICCIONARIO ****");

        String palabra = "";
        boolean palabraValida = false;
        while (!palabraValida){
            System.out.print("Ingrese la palabra a buscar: ");
            palabra = sc.nextLine().trim();

            if (palabra.isEmpty()){
                System.out.println("La palabra no puede estar vacía.");
            } else if (!palabra.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")){
                System.out.println("Entrada inválida. Solo se permiten letras.");
            } else {
                palabraValida = true;
            }
        }

        boolean encontrada = busquedaSecuencial(diccionario, palabra);

        if (encontrada){
            System.out.println("\nLa palabra \"" + palabra + "\" fue encontrada en el diccionario.");
        } else {
            System.out.println("\nLa palabra \"" + palabra + "\" no está en el diccionario.");
        }

        sc.close();
    }

    public static boolean busquedaSecuencial(String[] arr, String buscada){
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equalsIgnoreCase(buscada)){
                return true;
            }
        }
        return false;
    }
}