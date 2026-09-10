/*Búsqueda de elemento máximo y mínimo: Escribir un programa que encuentre el elemento
máximo y el mínimo en un arreglo de números utilizando el algoritmo de búsqueda
secuencial. Mostrar ambos valores en la consola. */
package Guia05;
import java.util.Scanner;

public class Ejercicio3_MaximoYMinimo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("**** BUSQUEDA DE ELEMENTO MAXIMO Y MINIMO ****");

        int vnumeros = 0;
        boolean entradaValida = false;
        while (!entradaValida){
            System.out.print("¿Cuántos números desea ingresar? ");
            String entrada = sc.nextLine().trim();
            try {
                vnumeros = Integer.parseInt(entrada);
                if (vnumeros <= 0){
                    System.out.println("Debe ingresar un número entero mayor a 0.");
                } else {
                    entradaValida = true;
                }
            } catch (NumberFormatException e){
                System.out.println("Entrada inválida. Debe ingresar solo números enteros.");
            }
        }

        int[] numeros = new int[vnumeros];
        for (int i = 0; i < vnumeros; i++){
            boolean numeroValido = false;
            while (!numeroValido){
                System.out.print("Número " + (i + 1) + ": ");
                String entrada = sc.nextLine().trim();
                try {
                    numeros[i] = Integer.parseInt(entrada);
                    numeroValido = true;
                } catch (NumberFormatException e){
                    System.out.println("Entrada inválida. Debe ingresar solo números enteros.");
                }
            }
        }

        int[] resultado = buscarMaxMin(numeros);

        System.out.println("\nElemento máximo: " + resultado[0]);
        System.out.println("Elemento mínimo: " + resultado[1]);

        sc.close();
    }

    public static int[] buscarMaxMin(int[] arr){
        int maximo = arr[0];
        int minimo = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > maximo){
                maximo = arr[i];
            }
            if (arr[i] < minimo){
                minimo = arr[i];
            }
        }
        return new int[]{maximo, minimo};
    }
}