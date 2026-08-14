/*Diseñe una solución que dadas las notas de un grupo de alumnos (cuya cantidad es conocida)
calcule e imprima la nota promedio. */

package EjerciciosSem2;

import java.util.Scanner;

public class PromedioNotasGrupal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidad = sc.nextInt();

        double[] notas = new double[cantidad]; // array para almacenar las notas de los alumnos
        double suma = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / cantidad;

        System.out.println("La nota promedio del grupo es: " + promedio);

        sc.close();
    }
}