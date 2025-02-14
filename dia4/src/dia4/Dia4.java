/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia4;

/**
 *
 * @author Uniminuto Tibu
 */
public class Dia4 {
    //HERENCIA
    //Usamos una clase base que tendrá unos atributos y métodos
    //que se pueden compartir con las clases secundarias, esto se puede lograr usando el
    //(extends) con el nombre de la clase principal
    
    //ENCAPSULAMIENTO
    //POLIMORFISMO
    public static void main(String[] args) {
        perro p= new perro("perro", "lil");
        perro p2= new perro("loro", "max");
        System.out.println(p);
        System.out.println(p.getName());
        System.out.println(p2);
        p.comer();
        p.ladrar();
    }
    
}
