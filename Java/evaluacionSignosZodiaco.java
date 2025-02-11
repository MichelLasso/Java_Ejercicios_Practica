import java.util.Scanner;
public class evaluacionSignosZodiaco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("-----------");
                System.out.println("Evaluación de signos del zodiaco");
                System.out.println("-----------");

                System.out.println("Ingrese el mes (1-12): ");
                int mes = scanner.nextInt();
                System.out.println("Ingresa el dia (1-31)");
                int dia = scanner.nextInt();
                if (mes==3 && dia>=21 || mes==4 && dia<=19) {
                    System.out.println("Tu fecha: mes " + mes + " dia " + dia );
                    System.out.println("Signo: Aries");
                    System.out.println("--------");
                    break;
                } else if (mes==4 && dia>=20 || mes==5 && dia<=20) {
                    System.out.println("Tu fecha: mes " + mes + " dia " + dia );
                    System.out.println("Signo: Tauro");
                    System.out.println("--------");
                    break;
                } else if (mes==5 && dia>=21 || mes==6 && dia<=20) {
                    System.out.println("Tu fecha: mes " + mes + " dia " + dia );
                    System.out.println("Signo: Geminis");
                    System.out.println("--------");
                    break;
                } else if (mes==6 && dia>=21 || mes==7 && dia<=22) {
                    System.out.println("Tu fecha: mes " + mes + " dia " + dia );
                    System.out.println("Signo: Cancer");
                    System.out.println("--------");
                    break;
                } else if (mes==7 && dia>=23 || mes==8 && dia<=22) {
                    System.out.println("Tu fecha: mes " + mes + " dia " + dia );
                    System.out.println("Signo: Leo");
                    System.out.println("--------");
                    break;
                } else if (mes==8 && dia>=23 || mes==9 && dia<=22) {
                    System.out.println("Tu fecha: mes " + mes + " dia " + dia );
                    System.out.println("Signo: Virgo");
                    System.out.println("--------");
                    break;
                } else if (mes==9 && dia>=23 || mes==10 && dia<=22) {
                    System.out.println("Tu fecha: mes " + mes + " dia " + dia );
                    System.out.println("Signo: Libra");
                    System.out.println("--------");
                    break;
                } else if (mes==10 && dia>=23 || mes==11 && dia<=21) {
                    System.out.println("Tu fecha: mes " + mes + " dia " + dia );
                    System.out.println("Signo: Escorpio");
                    System.out.println("--------");
                    break;
                } else if (mes==11 && dia>=22 || mes==12 && dia<=21) {
                    System.out.println("Tu fecha: mes " + mes + " dia " + dia );
                    System.out.println("Signo: Sagitario");
                    System.out.println("--------");
                    break;
                } else if (mes==12 && dia>=22 && mes==1 && dia<=19) {
                    System.out.println("Tu fecha: mes " + mes + " dia " + dia );
                    System.out.println("Signo: Capricornio");
                    System.out.println("--------");
                    break;
                } else if (mes==1 && dia>=20 || mes==2 && dia<=18) {
                    System.out.println("Tu fecha: mes " + mes + " dia " + dia );
                    System.out.println("Signo: Acuario");
                    System.out.println("--------");
                    break;
                } else if (mes==2 && dia>=18 || mes==3 && dia<=20) {
                    System.out.println("Tu fecha: mes " + mes + " dia " + dia );
                    System.out.println("Signo: Piscis");
                    System.out.println("--------");
                    break;
                } else {
                    System.out.println("ERROR: El numero ingresado no es valido.");
                }
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            scanner.close();
        }
    }
}