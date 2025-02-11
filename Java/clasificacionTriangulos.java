import java.util.Scanner;

public class clasificacionTriangulos {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        try{
            System.out.println("----------------------------");
            System.out.println("Recuerde que la suma de los dos primeros lados debe ser menor al tercer lado");
            System.out.println("----------------------------");
            System.out.println("Ingrese el lado 1: ");
            float lado1= scanner.nextFloat();

            System.out.println("Ingrese el lado 2: ");
            float lado2= scanner.nextFloat();

            System.out.println("Ingrese el lado 3: ");
            float lado3= scanner.nextFloat();

            float verificar= lado1 + lado2;

            if (verificar>lado3) {
                if (lado1 == lado2 && lado1 == lado3) {
                    System.out.println("El triangulo es Equilátero");
                }
                else if (lado1 == lado2 && lado1 != lado3 || lado1==lado3 && lado1!= lado2 || lado2==lado3 && lado2!=lado1) {
                    System.out.println("El triangulo es Isósceles");
                }
                else {
                    System.out.println("El triangulo es Escaleno");
                }
            }
            else{
                System.out.println("Los lados del triangulo son incorrectos, verifique los datos ingresados :)");
            }
        }
        catch (Exception e){
            System.out.println("Ingresa un número");
        }
        finally{
            scanner.close();
        }
    }
}
