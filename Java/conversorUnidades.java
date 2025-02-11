import java.util.Scanner;
public class conversorUnidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            String unidadesElegir= "millas|fahrenheit|libras";
            while (true) {
                System.out.println("--------------------");
                System.out.println("Conversor de unidades");
                System.out.println("--------------------");
                System.out.println(String.join("\n","El programa puede convertir las siguientes unidades: ",
                "|Kilómetros a millas|", "|Celsius a Fahrenheit|", "|Kilogramos a libras|"));
                System.out.println("Ingresa la unidad que espera de resultado: ");
                String unidadUsuario= scanner.nextLine();

                if (unidadUsuario.matches(unidadesElegir)) {
                    if (unidadUsuario.equals("millas")) {
                        System.out.println("--------------------");
                        System.out.println("CONVERSOR DE KILOMETROS A MILLAS");
                        System.out.println("--------------------");
                        System.out.println("Ingrese el valor en Kilómetros: ");
                        float kilometros= scanner.nextFloat();
                        //formula
                        double millas = kilometros * 0.621371;
                        System.out.println("--------------------");
                        System.out.println(kilometros + " kilometros a millas: " + millas);
                    } else
                    if (unidadUsuario.equalsIgnoreCase("fahrenheit")) {
                        System.out.println("--------------------");
                        System.out.println("CONVERSOR DE CELSIUS A FAHRENHEIT");
                        System.out.println("--------------------");
                        System.out.println("Ingrese el valor en Celsius: ");
                        double celsius= scanner.nextDouble();
                        //formula
                        double fahrenheit = (celsius * 1.8) + 32;
                        System.out.println("--------------------");
                        System.out.println(celsius + " Celsius a Fahrenheit: " + fahrenheit);
                    } else 
                    if (unidadUsuario.equalsIgnoreCase("libras")) {
                        System.out.println("--------------------");
                        System.out.println("CONVERSOR DE KILOMETROS A LIBRAS");
                        System.out.println("--------------------");
                        System.out.println("Ingrese el valor en Kilometros: ");
                        double kilometross= scanner.nextDouble();
                        //formula
                        double libras = kilometross * 2.20462;
                        System.out.println("--------------------");
                        System.out.println(kilometross + " Celsius a Fahrenheit: " + libras);
                    } else{
                        System.out.println("ERROR: Los datos ingresados no coinciden.");
                    }
                    break;
                } else{
                    System.out.println("ERROR:  La unidad ingresa es incorrecta.");
                }
            }
        } finally{
            scanner.close();
        }
    }
}
