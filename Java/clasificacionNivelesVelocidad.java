import java.util.Scanner;

public class clasificacionNivelesVelocidad {
    public static void main(String[] args) {
        
    
        Scanner scanner = new Scanner(System.in);

        try {
            while(true) {
                System.out.println("------------------");
                System.out.println("Clasificacion por niveles de velocidad");
                System.out.println("------------------");
                System.out.println("Ingrese su velocidad en km/h: ");
                int velocidad = scanner.nextInt();
                if (velocidad >= 0 && velocidad <= 20) {
                System.out.println("" + velocidad + " km/h Muy lento");
                break;
                }

                if (velocidad >= 21 && velocidad <= 60) {
                System.out.println("" + velocidad + " km/h Moderado");
                break;
                }

                if (velocidad >= 61 && velocidad <= 120) {
                System.out.println("" + velocidad + " km/h Rapido");
                break;
                }

                if (velocidad >= 120) {
                System.out.println("" + velocidad + " km/h Muy rapido");
                break;
                }
            }
        } catch (Exception var6) {
            System.out.println("Por favor ingresar un numero positivo");
        } finally {
            scanner.close();
        }

    }
}

