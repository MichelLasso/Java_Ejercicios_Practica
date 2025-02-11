/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Uniminuto Tibu
 */
// primera parte de una clase: NOMBRE
public class Carros {
    // atributos ("caracteristicas")
    String marca;
    String modelo;
    int puertas;
    int asientos;
    int motor;
    String color;
    int cantLlantas;
    int cilindraje;
    int anyo;
    int caballosFuerza;
    
    public Carros() {}
    
    
    public Carros(String marca, String modelo, int anyo){
        this.marca= marca;
        this.modelo= modelo;
        this.anyo= anyo;
        this.caballosFuerza= 140;
        this.asientos=5;
        this.motor=28006;
        this.color= "Negro";
        this.cantLlantas=4;
        
    }
    // constructor
    public Carros(String marca, String modelo, int anyo, int caballosFuerza, int asientos, int puertas, int motor, String color, int cantLlantas){
        this.marca= marca;
        this.modelo= modelo;
        this.anyo= anyo;
        this.caballosFuerza= caballosFuerza;
        this.asientos=asientos;
        this.motor=motor;
        this.color= color;
        this.cantLlantas=cantLlantas;
        
    }

    @Override
    public String toString() {
        return "Carros{" + "marca=" + marca + ", modelo=" + modelo + ", puertas=" + puertas + ", asientos=" + asientos + ", motor=" + motor + ", color=" + color + ", cantLlantas=" + cantLlantas + ", cilindraje=" + cilindraje + ", anyo=" + anyo + ", caballosFuerza=" + caballosFuerza + '}';
    }
}
    
    
    


