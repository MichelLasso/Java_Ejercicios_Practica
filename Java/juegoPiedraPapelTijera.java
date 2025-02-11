import java.util.Scanner;
public class juegoPiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String opcion= "piedra|papel|tijera";
            while (true) {
                System.out.println("------------------");
                System.out.println("Juego de piedra, papel o tijera");
                System.out.println("------------------");

                System.out.println("Jugador 1, Ingrese su nombre: ");
                String nombre1= scanner.nextLine();

                System.out.println("Jugador 2, Ingrese su nombre: ");
                String nombre2= scanner.nextLine();
                System.out.println("----------------");
                System.out.println(String.join("\n","Bienvenido al juego de piedra, papel y tijera.",
                "Por favor, el jugador " + nombre1 + " ingrese su elección :","-Piedra","-Papel", "-Tijera"));
                System.out.println("----------------");

                String jugador1= scanner.nextLine();
                if (jugador1.matches(opcion)) {
                    System.out.println("Ahora es el turno del segundo jugador :)");
                    System.out.println("----------------");
                    System.out.println(String.join("\n","Bienvenido al juego de piedra, papel y tijera.",
                    "Por favor, el jugador " + nombre2 +" ingrese ingrese su elección :","-Piedra","-Papel", "-Tijera"));
                    System.out.println("----------------");

                    String jugador2= scanner.nextLine();

                    if (jugador2.matches(opcion)) {

                        if (jugador1.equals(jugador2)) {
                            System.out.println("----------------");
                            System.out.println("Empate :)");
                            System.out.println("----------------");
                            System.out.println("Eleccion de " + nombre1 + ": "+jugador1);
                            System.out.println("Eleccion de " + nombre2 + ": "+jugador2);

                            break;

                        } else if (jugador1.equals("piedra") && jugador2.equals("papel") || jugador2.equals("piedra") && jugador1.equals("papel") ) {
                            System.out.println("----------------");
                            System.out.println("!PAPEL GANASTEE!");
                            System.out.println("----------------");

                            if (jugador1.equals("papel")) {
                                System.out.println("felicidades " + nombre1 + ", ganaste con :" + jugador1);
                                System.out.println("----------------");
                                System.out.println("Eleccion de " + nombre1 + ": "+jugador1);
                                System.out.println("Eleccion de " + nombre2 + ": "+jugador2);
                            } else {
                                System.out.println("felicidades " + nombre2 + ", ganaste con :" + jugador2);
                                System.out.println("----------------");
                                System.out.println("Eleccion de " + nombre1 + ": "+jugador1);
                                System.out.println("Eleccion de " + nombre2 + ": "+jugador2);
                            }
                            break;
                        } else if (jugador1.equals("tijera") && jugador2.equals("piedra") || jugador2.equals("tijera") && jugador1.equals("piedra")) {
                            System.out.println("----------------");
                            System.out.println("¡PIEDRAA GANASTEE!");
                            System.out.println("----------------");

                            if (jugador1.equals("piedra")) {
                                System.out.println("felicidades " + nombre1 + ", ganaste con :" + jugador1);
                                System.out.println("----------------");
                                System.out.println("Eleccion de " + nombre1 + ": "+jugador1);
                                System.out.println("Eleccion de " + nombre2 + ": "+jugador2);
                            } else {
                                System.out.println("felicidades " + nombre2 + ", ganaste con :" + jugador2);
                                System.out.println("----------------");
                                System.out.println("Eleccion de " + nombre1 + ": "+jugador1);
                                System.out.println("Eleccion de " + nombre2 + ": "+jugador2);
                            }
                            break;
                        } else if (jugador1.equals("tijera") && jugador2.equals("papel") || jugador2.equals("tijera") && jugador1.equals("papel") ) {
                            System.out.println("----------------");
                            System.out.println("¡TIJERA GANASTEE!");
                            System.out.println("----------------");

                            if (jugador1.equals("tijera")) {
                                System.out.println("felicidades " + nombre1 + ", ganaste con :" + jugador1);
                                System.out.println("----------------");
                                System.out.println("Eleccion de " + nombre1 + ": "+jugador1);
                                System.out.println("Eleccion de " + nombre2 + ": "+jugador2);
                            } else {
                                System.out.println("felicidades " + nombre2 + ", ganaste con :" + jugador2);
                                System.out.println("----------------");
                                System.out.println("Eleccion de " + nombre1 + ": "+jugador1);
                                System.out.println("Eleccion de " + nombre2 + ": "+jugador2);
                            }
                            break;
                        }
                    } else {
                        System.out.println("ERROR: El dato ingresado no es valido.");
                    }
                    break;
                } else {
                    System.out.println("ERROR: verifique los datos ingresados.");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: Verifique los datos ingresados");
        } finally{
            scanner.close();
        }
    }
}
