import java.util.Scanner;

public class clasificacionEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Ingresa tu edad: ");
            int edad = scanner.nextInt();
            
            if (edad >= 0 &&  edad <=12) {
                System.out.println("Niño, tienes " + edad + " años");
            }
            if (edad >=13 && edad <=17) {
                System.out.println("Adolescente, tienes " + edad + " años");
            }
            if (edad >=18 && edad<= 59) {
                System.out.println("Adulto, tienes " + edad + " años");
            }
            if (edad >=60) {
                System.out.println("Adulto Mayor, tienes " + edad + " años");
            }
        } 
        catch (Exception e){
            System.out.println("Por favor ingresar un número positivo");
        }
        finally{
            scanner.close();
        }
    }
}

