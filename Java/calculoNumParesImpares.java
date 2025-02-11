import java.util.Scanner;
public class calculoNumParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("-----------------");
            System.out.println("¿NUMERO PAR O IMPAR?");
            System.out.println("-----------------");
            System.out.println("Ingresa un numero :");

            int numero= scanner.nextInt();

            int parImpar= numero%2;
            if (parImpar>0) {
                System.out.println("-----------------");
                System.out.println("El numero " + numero + " es impar");
            } else{
                System.out.println("-----------------");
                System.out.println("El numero " + numero + " es par");
            }
        } catch (Exception e){
            System.out.println("ERROR: verifique los datos ingresados");
        } finally {
            scanner.close();
        }
    }
}
