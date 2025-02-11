import java.util.Scanner;
public class conversorEdadesCaninas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("----");
                System.out.println("CONVERSOR DE EDADES CANINAS");
                System.out.println("----");

                System.out.println("Ingrese la edad de su canino: ");
                int edad= scanner.nextInt();

                if (edad>=2) {
                    int conversorEdadesCaninas= 21;
                    System.out.println( "----");
                    for(int i = 2; i<edad; i++){
                        conversorEdadesCaninas=  conversorEdadesCaninas + 4;
                    }
                    System.out.println("Datos: ");
                    System.out.println("Su mascota en edad canina :" + edad);
                    System.out.println("Su mascota en edad humana :" + conversorEdadesCaninas);
                    break;
                } else {
                    double conversorEdadesCaninas= 10.5;
                    System.out.println("Datos: ");
                    System.out.println("Su mascota en edad canina :" + edad);
                    System.out.println("Su mascota en edad humana :" + conversorEdadesCaninas);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: Verifique los datos ingresados.");
        } finally {
            scanner.close();
        }
    }
}
