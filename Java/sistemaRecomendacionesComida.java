import java.util.Random;
import java.util.Scanner;
public class sistemaRecomendacionesComida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        try{
            String clima= "soleado|lluvioso|frio";

            String[] desayunoFrio = {"Chocolate caliente con churros","Avena con canela y leche","Tostadas con mantequilla y mermelada","Café con pan dulce"};
            String[] desayunoLluvioso = {"Sopa de fideos con huevo","Huevos revueltos con tortillas","Tamales con atole","Tostadas francesas con miel"};
            String[] desayunoSoleado = { "Yogur con granola y frutas frescas","Batido de frutas tropicales","Cereal con leche fría","Tostadas con aguacate y tomate"};
            
            String[] almuerzoFrio = { "Sopa de pollo con fideos", "Guiso de lentejas con arroz", "Carne al horno con puré de papas", "Estofado de res con vegetales" };
            String[] almuerzoLluvioso = { "Caldo de res con tortillas", "Arroz con pollo y ensalada", "Pozole rojo con tostadas", "Tacos dorados de pollo con crema" };
            String[] almuerzoSoleado = { "Ensalada César con pollo a la parrilla", "Filete de pescado con arroz y vegetales", "Wrap de atún con ensalada fresca", "Pasta con pesto y ensalada caprese" };

            String[] cenaFrio = { "Sopa de tomate con pan tostado", "Puré de papas con carne deshebrada", "Crema de champiñones con crutones", "Pizza casera con queso fundido" };
            String[] cenaLluvioso = { "Tacos de carne asada", "Quesadillas de queso con guacamole", "Tamales con café", "Panini de jamón y queso" };
            String[] cenaSoleado = { "Ensalada de pollo con aderezo ligero", "Wrap de vegetales y hummus", "Sándwich de pavo con ensalada", "Ceviche con tostadas" };

            while (true) {
                System.out.println("-------------------------");
                System.out.println("Sistema de recomendaciones de comida");
                System.out.println("-------------------------");

                System.out.println("Ingrese el clima (soleado, lluvioso, frio)");
                String climaUsuario = scanner.nextLine();

                if (climaUsuario.matches(clima)) {
                    while (true) {
                        System.out.println(String.join("\n","Ingrese el número : " ,"1. mañana", "2. tarde", "3. noche "));
                        int opcionHora= scanner.nextInt();

                        if (opcionHora==1) {
                            if (climaUsuario.equals("soleado")) {
                                System.out.print("\033[H\033[2J");
                                System.out.println("-------------------------");
                                System.out.println(climaUsuario + " por la Mañana");
                                System.out.println("-------------------------");

                                int comidaRandom= random.nextInt(desayunoSoleado.length);
                                System.out.println("Comida recomendada: " + desayunoSoleado[comidaRandom]);
                                break;
                            } else 
                            if (climaUsuario.equals("lluvioso")) {
                                System.out.print("\033[H\033[2J");
                                System.out.println("-------------------------");
                                System.out.println(climaUsuario + " por la Mañana");
                                System.out.println("-------------------------");

                                int comidaRandom= random.nextInt(desayunoLluvioso.length);
                                System.out.println("Comida recomendada: " + desayunoLluvioso[comidaRandom]);
                                break;
                            } else 
                            if (climaUsuario.equals("frio")) {
                                System.out.print("\033[H\033[2J");
                                System.out.println("-------------------------");
                                System.out.println(climaUsuario + " por la Mañana");
                                System.out.println("-------------------------");

                                int comidaRandom= random.nextInt(desayunoFrio.length);
                                System.out.println("Comida recomendada: " + desayunoFrio[comidaRandom]);
                                break;
                            } 
                        } else
                        if (opcionHora==2) {
                            if (climaUsuario.equals("soleado")) {

                                System.out.print("\033[H\033[2J");
                                System.out.println("-------------------------");
                                System.out.println(climaUsuario + " por la Tarde");
                                System.out.println("-------------------------");

                                int comidaRandom= random.nextInt(almuerzoSoleado.length);
                                System.out.println("Comida recomendada: " + almuerzoSoleado[comidaRandom]);
                                break;
                            } else 
                            if (climaUsuario.equals("lluvioso")) {

                                System.out.print("\033[H\033[2J");
                                System.out.println("-------------------------");
                                System.out.println(climaUsuario + " por la Tarde");
                                System.out.println("-------------------------");

                                int comidaRandom= random.nextInt(desayunoLluvioso.length);
                                System.out.println("Comida recomendada: " + almuerzoLluvioso[comidaRandom]);
                                break;
                            } else 
                            if (climaUsuario.equals("frio")) {

                                System.out.print("\033[H\033[2J");
                                System.out.println("-------------------------");
                                System.out.println(climaUsuario + " por la Tarde");
                                System.out.println("-------------------------");

                                int comidaRandom= random.nextInt(almuerzoFrio.length);
                                System.out.println("Comida recomendada: " + almuerzoFrio[comidaRandom]);
                                break;
                            }
                        }else
                        if (opcionHora==3) {
                            if (climaUsuario.equals("soleado")) {

                                System.out.print("\033[H\033[2J");
                                System.out.println("-------------------------");
                                System.out.println(climaUsuario + " por la Noche");
                                System.out.println("-------------------------");

                                int comidaRandom= random.nextInt(cenaSoleado.length);
                                System.out.println("Comida recomendada: " + cenaSoleado[comidaRandom]);
                                break;
                            } else 
                            if (climaUsuario.equals("lluvioso")) {

                                System.out.print("\033[H\033[2J");
                                System.out.println("-------------------------");
                                System.out.println(climaUsuario + " por la Noche");
                                System.out.println("-------------------------");

                                int comidaRandom= random.nextInt(cenaLluvioso.length);
                                System.out.println("Comida recomendada: " + cenaLluvioso[comidaRandom]);
                                break;
                            } else 
                            if (climaUsuario.equals("frio")) {

                                System.out.print("\033[H\033[2J");
                                System.out.println("-------------------------");
                                System.out.println(climaUsuario + " por la Noche");
                                System.out.println("-------------------------");

                                int comidaRandom= random.nextInt(cenaFrio.length);
                                System.out.println("Comida recomendada: " + cenaFrio[comidaRandom]);
                                break;
                            } 
                        } else{
                            System.out.print("\033[H\033[2J");
                            System.out.println("ERROR: El numero ingresado no está en las opciones");
                        }
                    }
                    
                    break;
                } else{
                    System.out.print("\033[H\033[2J");
                    System.out.println("ERROR: El clima que ingresaste no es correcto o no está en nuestras opciones ;)");
                }
            }
            
        } catch (Exception e){
            System.out.println("ERROR: Solo se pueden ingresar numeros enteros");
        } finally {
            scanner.close();
        }
    }
}
