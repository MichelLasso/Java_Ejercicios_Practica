import java.util.Scanner;
public class clasificacionFigurasGeometricas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("--------------------");
                System.out.println("- Clasificación de figuras geométricas -");
                System.out.println("--------------------");

                System.out.println(" Ingrese el número de lados de una figura geométrica para clasificarla : ");
                int lados = scanner.nextInt();

                if (lados==3) {
                    System.out.println(lados + " Lados :" + " corresponde a un Triangulo");
                    break;
                } else if (lados==4) {
                    System.out.println(lados + " Lados :" + " corresponde a un Cuadrado o rectángulo.");
                    break;
                } else if (lados==5) {
                    System.out.println(lados + " Lados :" + " corresponde a un Pentagono");
                    break;
                } else if (lados==6) {
                    System.out.println(lados + " Lados :" + " corresponde a un Hexagono");
                    break;
                } else {
                    System.out.println(lados + " Lados :" + " Figura no soportada.");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR : Verifique los datos ingresados");
        } finally {
            scanner.close();
        }
    }
}
