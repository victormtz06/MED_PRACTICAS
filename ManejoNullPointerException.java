public class ManejoNullPointerException {
    public static void main(String[] args) {
        String cadena = "niggarundra";
        try {
            int longitud = cadena.length();
            System.out.println("La longitud de la cadena es: " + longitud);
        } catch (NullPointerException e) {
            System.out.println("Error: Se intentó llamar a un método en un objeto que es null.");
            e.printStackTrace();
        }
    }
}