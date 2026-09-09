package Parcial1;

import java.util.Scanner;

public class Ejercicio2_PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sumaNotas = 0;
        int cantidad = 0;

        System.out.print("Ingrese calificaciones (0 a 10). ");
        System.out.println("Ingrese un número negativo para salir.");

        while (true) {
            try {
                System.out.print("Calificación: ");
                double nota = sc.nextDouble(); //codigo agregado para capturar la nota

                if (nota < 0) {
                    break; //codigo agregado: si se ingresa un numero negativo finaliza la ejecucion
                }

                if (nota > 10) {
                    System.out.println("La calificación debe estar entre 0 y 10.");
                    continue; //codigo agregado: si se ingresa un numeo amyor a 10 mestra un error predefinidio por nosotros pero lo finaliza y el programa
                }

                sumaNotas += nota; //va sumando la nota de las calificaciones ingresadas
                cantidad++; //va sumando la cantidad de calificaciones ingresadas

            } catch (Exception e) {
                System.out.println("Entrada inválida. Intente de nuevo.");
                sc.nextLine(); // limpia la entrada inválida
            }
        }

        double promedio = (cantidad > 0) ? sumaNotas / cantidad : 0;
        System.out.println("Promedio final: " + promedio);
    }
}