import java.util.Scanner;
public class ExcepcionPersonalizada {
    static class EdadInvalidaException extends Exception {
        public EdadInvalidaException(String mensaje) {
            super(mensaje);
        }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese la edad: ");
            int edad = scanner.nextInt();
            if (edad < 0) {
                throw new EdadInvalidaException("La edad no puede ser un número negativo.");
            }
            System.out.println("Edad ingresada: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Entrada de datos incorrecta.");
        } finally {
            scanner.close();
        }
    }
}