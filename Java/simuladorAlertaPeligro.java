import java.util.Scanner;

public class simuladorAlertaPeligro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("--------------------");
                System.out.println("Simulador de alarma de peligro");
                System.out.println("--------------------");

                System.out.println(" Ingrese la cantidad de sensores activados :");
                int sensores = scanner.nextInt();

                if (sensores>=1 && sensores<=2) {
                    System.out.println(sensores + " sensores :" + " Alerta baja");
                    break;
                } else if (sensores>=3 && sensores<=5) {
                    System.out.println(sensores + " sensores :" + " Alerta media");
                    break;
                } else if (sensores>=6) {
                    System.out.println(sensores + " sensores :" + " Alerta alta.");
                    break;
                } else {
                    System.out.println(sensores + " sensores :" + " No es un sensor");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR : Verifique los datos ingresados");
        } finally {
            scanner.close();
        }
    }
}
