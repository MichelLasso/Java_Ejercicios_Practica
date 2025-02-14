/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia4;

/**
 *
 * @author Uniminuto Tibu
 */
public class perro extends animal{
    private String especie;

    public perro(String especie, String name) {
        super(name);
        this.especie = especie;
    }
    //los otros estan en la clase anterior
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "perro{" + "especie=" + especie + "nombre" + super.getName()+'}';
    }
    public void ladrar(){
        System.out.println("El perro está ladrando");
    }
}

