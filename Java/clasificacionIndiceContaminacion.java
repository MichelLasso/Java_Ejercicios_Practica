import java.util.Scanner;
public class clasificacionIndiceContaminacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("----------------");
                System.out.println("Clasificación por índice de contaminación");
                System.out.println("----------------");
                System.out.println("índice de calidad del aire (ICA): ");
                int indice= scanner.nextInt();

                if (indice>=0 && indice<=50) {
                    System.out.println("----------------");
                    System.out.println("Indice de calidad del aire (ICA) " + indice + " : Bueno");
                    break;
                } else if (indice>=51 && indice<=100) {
                    System.out.println("----------------");
                    System.out.println("Indice de calidad del aire (ICA) " + indice + " : Moderado");
                    break;
                } else if (indice>=101 && indice<=150) {
                    System.out.println("----------------");
                    System.out.println("Indice de calidad del aire (ICA) " + indice + " : No saludable para grupos sensibles");
                    break;
                } else if (indice>=151 && indice<=200) {
                    System.out.println("----------------");
                    System.out.println("Indice de calidad del aire (ICA) " + indice + " : No saludable");
                    break;
                } else if (indice>=201 && indice<=300) {
                    System.out.println("----------------");
                    System.out.println("Indice de calidad del aire (ICA) " + indice + " : Muy no saludable");
                    break;
                } else if (indice>=301) {
                    System.out.println("----------------");
                    System.out.println("Indice de calidad del aire (ICA) " + indice + " : Peligroso");
                    break;
                } else {
                    System.out.println("ERROR : Ingrese numeros enteros y positivos");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR : Verifique los datos ingresados");
        } finally {
            scanner.close();
        }

    }
}
