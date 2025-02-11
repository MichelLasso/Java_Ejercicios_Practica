import java.util.Scanner;
public class determinadorEstacionAnyo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("----------------------------");
            System.out.println("Determinador de estación del año");
            System.out.println("----------------------------");
        
            System.out.println("Ingrese el número del mes : ");
            int numMes= scanner.nextInt();

            if (numMes<=3 && numMes <=5) {
                System.out.println("----------------------------");
                System.out.println("PRIMAVERA");
                System.out.println("El número que ingresaste correspone al mes entre marzo y mayo");
            }
            else if (numMes <=6 && numMes <=8) {
                System.out.println("----------------------------");
                System.out.println("VERANO");
                System.out.println("El número que ingresaste correspone al mes entre junio y agosto");
            }
            else if (numMes<=9 && numMes<= 11) {
                System.out.println("----------------------------");
                System.out.println("OTOÑO");
                System.out.println("El número que ingresaste correspone al mes entre septiembre y noviembre");
            } else if (numMes == 12) {
                System.out.println("----------------------------");
                System.out.println("INVIERNO");
                System.out.println("El número que ingresaste correspone al mes de diciembre");
            } else{
                System.out.println("ERROR: Verifique el número del mes ingresado");
            }
        } catch (Exception e){
            System.out.println("ERROR: Solo se pueden ingresar numeros enteros");
        }
        finally{
            scanner.close();
        }
    }
}