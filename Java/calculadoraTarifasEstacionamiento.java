import java.util.Scanner;
public class calculadoraTarifasEstacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("----------------------------");
            System.out.println("CALCULADORA DE TARIFAS DE ESTACIONAMIENTO");
            System.out.println("----------------------------");
            
            System.out.println( String.join("\n", "1. Minutos","2. Horas"));
            int opcion= scanner.nextInt();

            if (opcion == 1) {
                System.out.println("----------------------------");
                System.out.println("Ingrese los minutos: ");
                int tiempo= scanner.nextInt();

                System.out.println("----------------------------");
                System.out.println("Estacionamiento: " + tiempo + " minutos");
                System.out.println("Tarifa del estacionamiento : $5");
                System.out.println("----------------------------");

            } else if (opcion==2) {
                System.out.println("----------------------------");
                System.out.println("Ingrese las horas: ");
                int horas= scanner.nextInt(); 

                if (horas==1) {
                    System.out.println("----------------------------");
                    System.out.println("Estacionamiento: " + horas + " horas");
                    System.out.println("Tarifa del estacionamiento : $5");
                    System.out.println("----------------------------");
                    
                } else if (horas>=2 && horas <=3){
                    System.out.println("----------------------------");
                    System.out.println("Estacionamiento: " + horas + " horas");
                    System.out.println("Tarifa del estacionamiento : $10");
                    System.out.println("----------------------------");
                    
                } else if (horas>=4) {
                    System.out.println("----------------------------");
                    System.out.println("Estacionamiento: " + horas + " horas");
                    System.out.println("Tarifa del estacionamiento : $15");
                    System.out.println("----------------------------");
                    
                }
            }
            
        }
        catch (Exception e){
            System.out.println("verifique los datos ingresados");
        }
        finally{
            scanner.close();
        }
    }
}
