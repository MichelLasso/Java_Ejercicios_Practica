/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud_lasso_valerie;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Crud_Lasso_Valerie {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        try{
            
            ArrayList<String> listNombres= new ArrayList<String>();
            // AGREGAR ADD
            listNombres.add("manzana");
            listNombres.add("banana");        
            listNombres.add("naranja");
            listNombres.add("fresa");
            
            while(true){
                System.out.println("-------------");
                System.out.println("TIENDA");
                System.out.println("-------------");

                System.out.println("1. Eliminar");
                System.out.println("2. Agregar");
                System.out.println("3. Mostrar");

                System.out.println("Ingrese el numero de la opcion que deseas:");
                int opcion= scanner.nextInt();
                scanner.nextLine();
                if (opcion==1) {
                    //ELIMINAR / DELETE
                    System.out.println("Ingrese el nombre de la fruta que desea eliminar: ");
                    String frutaEliminar= scanner.nextLine().toLowerCase();

                    int i = listNombres.indexOf(frutaEliminar);
                    //System.out.println(i); mostrar la posicion

                    if (i != -1) {
                        listNombres.remove(i);
                    } else {
                        System.out.println("La fruta que deseas eliminar no existe.");
                    }
                    System.out.println("Lista actualizada: " + listNombres);
                    break;

                } if(opcion==2){
                    //AGREGAR ADD
                    System.out.println("Ingrese el nombre de la fruta que desea agregar: ");
                    String frutaAgregar= scanner.nextLine().toLowerCase();

                    listNombres.add(frutaAgregar);
                    System.out.println("Lista actualizada: " + listNombres);
                    break;

                } if (opcion==3){
                    // LEER   / READ
                    for (int i = 0; i < listNombres.size(); i++) {
                        System.out.println(listNombres.get(i));
                    }
                    break;
                }
            }
            
        } catch (Exception e) {
            System.out.println("Verifique los datos ingresados");
        } finally{
            scanner.close();
        }
    }
    
}
