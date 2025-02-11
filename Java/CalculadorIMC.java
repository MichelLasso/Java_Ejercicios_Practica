import java.util.Scanner;
public class CalculadorIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("-----");
                System.out.println("CALCULO DE IMC");
                System.out.println("-----");

                System.out.println("Ingrese su peso: ");
                int peso= scanner.nextInt();

                System.out.println("Ingrese su altura: ");
                double altura = scanner.nextDouble();

                double imc= peso / (altura * altura);

                if (imc<18.5) {
                    System.out.println("-----");
                    System.out.println("Su indice de masa corporal: " + imc );
                    System.out.println("Resultado: Bajo peso.");
                    System.out.println("Datos ingresados: " + " Peso: " + peso + " Altura :" + altura);
                    break;
                } else if (imc>=18.5 && imc<=29.9) {
                    System.out.println("-----");
                    System.out.println("Su indice de masa corporal: " + imc );
                    System.out.println("Resultado: Peso Normal.");
                    System.out.println("Datos ingresados: " + " Peso: " + peso + " Altura :" + altura);
                    break;
                } else if (imc>=30) {
                    System.out.println("-----");
                    System.out.println("Su indice de masa corporal: " + imc );
                    System.out.println("Resultado: Obesidad.");
                    System.out.println("Datos ingresados: " + " Peso: " + peso + " Altura :" + altura);
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
