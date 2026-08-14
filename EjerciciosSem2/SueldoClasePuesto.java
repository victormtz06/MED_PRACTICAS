/*Se desea calcular el sueldo de un trabajador, teniendo las horas trabajadas durante la semana
y la clase de puesto que desempeña, diseñe la solución que permita desplegar los datos del
empleado y su sueldo semanal, sabiendo que el trabajador clase A se le paga $7.00/hora, la
clase B $8.50, la clase C $10.00 y la clase D $12.50 */

package EjerciciosSem2;

import java.util.Scanner;

public class SueldoClasePuesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese las horas trabajadas en la semana: ");
        double horas = sc.nextDouble();

        System.out.print("Ingrese la clase de puesto (A, B, C o D): ");
        char clase = sc.next().charAt(0); //solo tomo en cuenta el primer caracter del texto (string) que ingresa el usuario
        clase = Character.toUpperCase(clase); //convierte el caracter tomado en la linea anterior a mayuscula para que sea coherente con las opciones colocadas manualmente

        double pagoPorHora;

        switch (clase) {
            case 'A':
                pagoPorHora = 7.00;
                break;
            case 'B':
                pagoPorHora = 8.50;
                break;
            case 'C':
                pagoPorHora = 10.00;
                break;
            case 'D':
                pagoPorHora = 12.50;
                break;
            default:
                pagoPorHora = 0.0;
                System.out.println("Clase de puesto no válida.");
        }

        double sueldoSemanal = horas * pagoPorHora;

        System.out.println("Empleado: " + nombre);
        System.out.println("Clase: " + clase);
        System.out.println("Horas trabajadas: " + horas);
        System.out.println("Sueldo semanal: $" + sueldoSemanal);

        sc.close();
    }
}