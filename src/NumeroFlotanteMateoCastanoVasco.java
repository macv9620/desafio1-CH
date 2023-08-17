public class NumeroFlotanteMateoCastanoVasco {
    public static void main(String[] args) {
        float datoFloat = 78125.48f;
        System.out.println("Dato float: " + datoFloat);

        //Se extrae parte entrera haciendo casting de float a int
        int parteEntera = (int) datoFloat;
        System.out.println("Parte entera: " + parteEntera);

        //Se extrae parte decimal restando al número completo la parte entera
        float parteDecimal = datoFloat - parteEntera;
        System.out.println("Parte decimal: " + parteDecimal);
    }
}
