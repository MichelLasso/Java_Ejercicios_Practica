import java.util.Scanner;
public class SimuladorNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Ingrese la Calificación de 0 - 100: ");
            int nota = scanner.nextInt();

            if (nota>= 90 && nota <=100) {
                System.out.println("Resultado de la nota : A");
            }
            if (nota>=80 && nota<=89) {
                System.out.println("Resultado de la nota : B");
            }
            if (nota>=70 && nota<=79) {
                System.out.println("Resultado de la nota : C");
            }
            if (nota>=60 && nota<=69) {
                System.out.println("Resultado de la nota : D");
            }
            if (nota<60) {
                System.out.println("Resultado de la nota : F");
            }
            else{
                System.out.println("El simulador de notas solo puede ejecutar las calificaciones de 0 - 100");
            }
        }
        catch (Exception e){
            System.out.println("Ingrese un numero entero");
        }
        finally{
            scanner.close();
        }
    }
}
