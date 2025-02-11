import java.util.Scanner;
public class identificacionTrimestre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("--------------------");
                System.out.println("Identificación del trimestre");
                System.out.println("--------------------");

                System.out.println(" Ingrese el número de un mes (1-12) :");
                int mes = scanner.nextInt();

                if (mes>=1 && mes<=3) {
                    System.out.println(mes + " mes :" + " Primer trimestre.");
                    break;
                } else if (mes>=4 && mes<=6) {
                    System.out.println(mes + " mes :" + " Segundo trimestre.");
                    break;
                } else if (mes>=7 && mes<=9) {
                    System.out.println(mes + " mes :" + " Tercer trimestre.");
                    break;
                } else if (mes>=10 && mes<=12) {
                    System.out.println(mes + " mes :" + " Cuarto trimestre.");
                    break;
                } else {
                    System.out.println(mes + " mes :" + " No es un mes");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR : Verifique los datos ingresados");
        } finally {
            scanner.close();
        }
    }
}
