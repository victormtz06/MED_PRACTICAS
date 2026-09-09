package Parcial1;
/*public class Ejercicio3_AccesoArreglo {
    public static void main(String[] args) {
        try {
            int resultado = obtenerElemento(new int[]{5, 10, 15}, 5);
            System.out.println("Elemento: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int obtenerElemento(int[] datos, int indice) {
        return datos[indice];
    }
}*/

//CODIGO ARREGLADO
public class Ejercicio3_AccesoArreglo {
    public static void main(String[] args) {
        try {
            int resultado = obtenerElemento(new int[]{5, 10, 15}, 5);
            System.out.println("Elemento: " + resultado);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango. " + e.getMessage());
        }
    }

    public static int obtenerElemento(int[] datos, int indice) {
        if (indice < 0 || indice >= datos.length) {
            throw new ArrayIndexOutOfBoundsException("Índice " + indice + " no válido para el arreglo de tamaño " + datos.length);
        }
        return datos[indice];
    }
}

/*Preguntas:
• ¿Qué problema tiene este código?
R// El problema principal de este código es que intenta acceder a un índice que está fuera del 
rango del arreglo. En este caso, el arreglo tiene 3 elementos (índices 0, 1 y 2), 
pero se está intentando acceder al índice 5, lo que genera una excepción de tipo 
ArrayIndexOutOfBoundsException.

• ¿Cómo se puede mejorar el manejo de excepciones?
R// Se puede mejorar el manejo de excepciones capturando específicamente 
la excepción ArrayIndexOutOfBoundsException en lugar de capturar una excepción 
genérica. Esto permite manejar el error de manera más precisa y proporcionar un 
mensaje más claro al usuario.

• ¿Qué excepción específica se genera y cómo capturarla
// La excepción específica que se genera es ArrayIndexOutOfBoundsException y se captura de la 
siguiente manera:*
try {
            int resultado = obtenerElemento(new int[]{5, 10, 15}, 5);
            System.out.println("Elemento: " + resultado);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango. " + e.getMessage());
        }*/