
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Uniminuto Tibu
 */
public class dia2 {
    // P.O.O 
    // Es un paradigma de programacion que parte del concepto de
    // "objetos" como base, conteninedo información en forma de
    // campos y código en forma de métodos.
    public static void main(String[] args) {
        //instanciar la clase carro
        Carros carrito1= new Carros();
        Carros carrito2= new Carros("Audy", "A4", 2010);
        Carros carrito3= new Carros("Toyota","Tundra", 2010);
        
        System.out.println(carrito1);
        System.out.println(carrito2);
        System.out.println(carrito3);
        
        // asignar valores a un objeto
        carrito1.modelo= "Twin";
        carrito1.marca="Renault";
        
        System.out.println(carrito1.modelo);
        System.out.println(carrito1.marca);
        
        //listas
        ArrayList<Carros> listaCarro= new ArrayList <> ();
        
        System.out.println(listaCarro);
        listaCarro.add(carrito1);
        listaCarro.add(carrito2);
        listaCarro.add(carrito3);
        
        System.out.println(listaCarro);
        System.out.println(listaCarro.get(2));
        Carros carroTemporal= new Carros();
        carroTemporal= listaCarro.get(2);
        System.out.println(carroTemporal.marca);
    }
    
}
