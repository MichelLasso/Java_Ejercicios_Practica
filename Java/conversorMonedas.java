import java.util.Scanner;
public class conversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("--------");
                System.out.println("Conversor de monedas");
                System.out.println("--------");
                System.out.println(String.join("\n", "1. Euros","2. Pesos colombianos",
                "3. Yenes", "Ingrese la opcion en numero de conversion"));
                int moneda= scanner.nextInt();

                System.out.println("Ingrese el valor de la moneda en dolares: ");
                int dolares= scanner.nextInt();

                if (moneda==1) {
                    System.out.println("---------");
                    System.out.println("DOLARES A EUROS");

                    double euros= dolares * 0.85;
                    System.out.println(dolares + " dolares a euros: " + euros);
                    break;
                } else if (moneda==2) {
                    System.out.println("---------");
                    System.out.println("DOLARES A PESOS COLOMBIANOS");

                    int euros= dolares * 4100;
                    System.out.println(dolares + " dolares a Pesos colombianos: " + euros);
                    break;
                } else if (moneda==3) {
                    System.out.println("---------");
                    System.out.println("DOLARES A YENES");

                    int euros= dolares * 110;
                    System.out.println(dolares + " dolares a Yenes: " + euros);
                    break;
                } else {
                    System.out.println("ERROR: Verifique el dato ingresado.");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: Verifique los datos ingresados.");
        } finally{
            scanner.close();
        }
    }
}
