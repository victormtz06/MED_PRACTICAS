/*En un cine se hace un 50% de descuento en el valor de la entrada a las personas mayores de 60
años y a los menores de 18 años, el resto de las personas paga el monto sin descuento. Dadas
la edad de la persona y el precio del boleto, calcule cuánto pagará una persona por su entrada. */

package EjerciciosSem2;

import java.util.Scanner;

public class DescuentoCine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad de la persona: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese el precio del boleto: ");
        double precio = sc.nextDouble();

        double montoAPagar;

        if (edad > 60 || edad < 18) {
            montoAPagar = precio * 0.5;
        } else {
            montoAPagar = precio;
        }

        System.out.println("La persona pagará: $" + montoAPagar);

        sc.close();
    }
}