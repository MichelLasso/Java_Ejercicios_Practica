import java.util.Scanner;

public class clasificacionEdades2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            try{
                while (true) {
                    System.out.println("------------------");
                    System.out.println("Determinación de rango etario");
                    System.out.println("------------------");
                    System.out.println("Ingrese su edad: ");
                    int edad = scanner.nextInt();
                    
                    if (edad >= 0 &&  edad <=2) {
                        System.out.println("Bebe, tienes " + edad + " años");
                        break;
                    }else
                    if (edad >=3 && edad <=12) {
                        System.out.println("Niño, tienes " + edad + " años");
                        break;
                    }else
                    if (edad >=13 && edad<= 17) {
                        System.out.println("Adolescente, tienes " + edad + " años");
                        break;
                    }else
                    if (edad >=18 && edad<= 64) {
                        System.out.println("Adulto, tienes " + edad + " años");
                        break;
                    }else
                    if (edad >=65) {
                        System.out.println("Adulto Mayor, tienes " + edad + " años");
                        break;
                    }
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

