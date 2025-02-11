import java.util.Scanner;

public class calculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Ingrese el primer número");
            int num1= scanner.nextInt();

            System.out.println("Ingrese el segundo número");
            int num2 = scanner.nextInt();

            System.out.println(String.join("\n","Elija la operación: ", "1. Suma" ,"2. Resta", "3. Multiplicación", "4. División"));
            int opcion= scanner.nextInt();
            
            if (opcion == 1) {
                int resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
            }

            if(opcion==2){
                int resultado= num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
            }

            if (opcion == 3) {
                int resultado = num1 * num2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
            }

            if (opcion == 4) {
                int resultado = num1 / num2;
                System.out.println("El resultado de la division es: " + resultado);
            }
        }
        catch (Exception e){
            System.out.println("Por favor, ingresa un número entero");
        }
        finally{
            scanner.close();
        }
    }
}
