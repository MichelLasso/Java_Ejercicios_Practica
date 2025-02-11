import java.util.Scanner;
public class ClasificacionAnyo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        try {
            while (true) {
                System.out.println("-----");
                System.out.println("Clasificacion de años");
                System.out.println("-----");
                System.out.println("Ingrese el año para determinar si es bisiestro o comun: ");
                int anyo= scanner.nextInt();

            
                if (anyo % 400==0) {
                    System.out.println("El año " + anyo + " es: Bisiestro");
                    break;
                } else if (anyo % 100==0) {
                    System.out.println("El año " + anyo + " es: Comun");
                    break;
                } else if (anyo % 4==0) {
                    System.out.println("El año " + anyo + " es: Bisiestro");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: verifique los datos ingresados");
        } finally{
            scanner.close();
        }
    }
}
