/*Ordenamiento de nombres alfabéticamente: Diseñar un programa que permita al usuario
ingresar una lista de nombres y luego utilice el algoritmo de ordenamiento por inserción
para ordenar los nombres alfabéticamente. Después, muestra la lista ordenada en la
consola */


package Guia05;
import java.util.Scanner;

public class Ejercicio1_OrdenamientoNombreAlfabetico {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("**** ORDENAMIENTO DE NOMBRES ALFABETICAMENTE ****");

        int vnombres = 0;
        boolean entradaValida = false;
        while (!entradaValida){
            System.out.print("¿Cuántos nombres desea ingresar? ");
            String entrada = sc.nextLine().trim(); //el metodo "trim" se encarga de eliminar los posibles espacios que pueden quedar guardados en el string
            try {
                vnombres = Integer.parseInt(entrada);
                if (vnombres <= 0){
                    System.out.println("Debe ingresar un número entero mayor a 0.");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e){
                System.out.println("Entrada inválida. Debe ingresar solo números enteros.");
            }
        }

        String[] nombres = new String[vnombres];
        for (int i = 0; i < vnombres; i++){
            boolean nombreValido = false;
            while (!nombreValido){
                System.out.print("Nombre " + (i + 1) + ": ");
                String nombre = sc.nextLine().trim();

                if (nombre.isEmpty()){
                    System.out.println("El nombre no puede estar vacío.");
                } else if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){
                    System.out.println("Entrada inválida. Solo se permiten letras.");
                } else {
                    nombres[i] = nombre;
                    nombreValido = true;
                }
            }
        }

        insertionSort(nombres);
        System.out.println("\nLista ordenada alfabeticamente: ");
        for (String nombre : nombres){
            System.out.println(nombre);
        }
        sc.close();
    }

    public static void insertionSort(String[] arr){
        for (int i = 1; i < arr.length; i++){
            String actual = arr[i];
            int j = i-1;

            while (j>=0 && arr[j].compareToIgnoreCase(actual) > 0){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = actual;
        }
    }
}