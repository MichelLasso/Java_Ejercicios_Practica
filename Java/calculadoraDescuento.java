import java.util.Scanner;

public class calculadoraDescuento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            
            float descA= 30;
            float descB= 20;
            float descC= 10;
            float divisor= 100;
            
            System.out.println("----------------------------");
            System.out.println("CALCULADORA DE DESCUENTOS");
            System.out.println("----------------------------");

            System.out.println(String.join ("\n","Ingrese el tipo de cliente:","1. A", "2. B", "3. C "));
            int tipoCliente = scanner.nextInt();    
            
            System.out.println("Ingrese el precio del producto: ");
            int precioProducto= scanner.nextInt();

            if (tipoCliente == 1) {

                System.out.println("----------------------------");
                System.out.println(" CLIENTE A: DESCUENTO DEL 30%");
                System.out.println("----------------------------");

                float descuento = (precioProducto * (descA/divisor));
                System.out.println("Su descuento es de : " + descuento);

            } else if (tipoCliente == 2){

                System.out.println("----------------------------");
                System.out.println(" CLIENTE B: DESCUENTO DEL 20%");
                System.out.println("----------------------------");
                float descuento = (precioProducto * (descB/divisor));
                System.out.println("Su descuento es de : " + descuento);

            } else if (tipoCliente == 3){

                System.out.println("----------------------------");
                System.out.println(" CLIENTE C: DESCUENTO DEL 10%");
                System.out.println("----------------------------");

                float descuento = (precioProducto * (descC/divisor));
                System.out.println("Su descuento es de : " + descuento);
            }
        }
        catch (Exception e){
            System.out.println("Verifique los datos ingresados :)");
        }
        finally{
            scanner.close();
        }
    }
}
