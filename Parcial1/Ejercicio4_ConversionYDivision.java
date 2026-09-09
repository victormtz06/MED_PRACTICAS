package Parcial1;
import java.util.Scanner;

public class Ejercicio4_ConversionYDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] valores = {"20", "cuarenta", "60", "0"};

        System.out.print("Ingrese un índice del 0 al 3: ");
        int indice = sc.nextInt();


        //correccion del codigo para manejar excepciones de manera más específica
        try {
            int numero = Integer.parseInt(valores[indice]);
            int resultado = 100 / numero;
            System.out.println("Resultado: " + resultado);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango. " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Valor no válido. " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero. " + e.getMessage());
        }
    }
}

/*PREGUNTAS:
• ¿Qué tipos de excepciones pueden ocurrir en este código?
R// Las excepciones que pueden ocurrir en este código son:
1. ArrayIndexOutOfBoundsException: Si el usuario ingresa un índice fuera del rango del arreglo.
2. NumberFormatException: Si el valor en el arreglo no puede ser convertido a un número entero.
3. ArithmeticException: Si el valor convertido es cero, lo que causaría una división por cero al intentar calcular

• ¿Cómo podrías mejorar el manejo de errores?
R// Se puede mejorar el manejo de errores capturando cada tipo de excepción por separado 
y proporcionando mensajes de error claros y específicos para cada caso. 
Esto ayuda al usuario a entender qué salió mal y cómo corregirlo. 

• Modifica el código para capturar NumberFormatException, ArrayIndexOutOfBoundsException y 
ArithmeticException por separado
R// Excepciones ya coreegidas y agregas al codigo de arriba.*/