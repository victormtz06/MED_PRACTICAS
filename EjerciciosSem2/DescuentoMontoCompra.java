/*. Dados el nombre del cliente, y el valor de la compra, calcule el monto a pagar considerando lo
siguiente:
o Si la compra es menor o igual a $75.00, NO tiene descuento. Si la compra es mayor de
$75.00, tiene un descuento del 5% Si la compra es mayor de $150.00, tiene un
descuento del 10%
Se deberá imprimir el nombre del cliente, el valor de la compra y el monto real a pagar. */

package EjerciciosSem2;

import java.util.Scanner;

public class DescuentoMontoCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el valor de la compra: ");
        double compra = sc.nextDouble();

        double montoAPagar;

        if (compra <= 75.00) {
            montoAPagar = compra; // sin descuento
        } else if (compra > 150.00) {
            montoAPagar = compra * 0.90; // 10% descuento
        } else { // compra > 75 y <= 150
            montoAPagar = compra * 0.95; // 5% descuento
        }

        System.out.println("Cliente: " + nombre);
        System.out.println("Valor de la compra: $" + compra);
        System.out.println("Monto real a pagar: $" + montoAPagar);

        sc.close();
    }
}