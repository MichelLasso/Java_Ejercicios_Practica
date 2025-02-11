import java.util.Scanner;
public class conversorTemperatura {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("----------------------------");
            System.out.println("CONVERSOR DE TEMPERATURA");
            System.out.println("----------------------------");

            System.out.println("Ingrese la temperatura: ");
            int temperatura= scanner.nextInt();

            System.out.println("----------------------------");
            System.out.println("Seleccione la unidad de origen");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");

            int opcionUnidad= scanner.nextInt();

            if (opcionUnidad==1) {

                System.out.println("----------------------------");
                System.out.println("CELSIUS A FAHRENHEIT");
                System.out.println("----------------------------");
            
                int conversionF= (temperatura * 9/5) + 32;
                System.out.println(temperatura + " Celsius");
                System.out.println(conversionF + " Fahrenheit");
            } else
            if (opcionUnidad ==2) {
                System.out.println("----------------------------");
                System.out.println("FAHRENHEIT A CELSIUS");
                System.out.println("----------------------------");
            
                int conversionC= (temperatura - 32) * 5/9;
                System.out.println(temperatura + " Fahrenheit");
                System.out.println(conversionC + " Celsius");
            }
        } catch (Exception e){
            System.out.println("Verifique los datos ingresados, el tipo de dato no coincide :)");
        } finally{
            scanner.close();
        }
    }
}
