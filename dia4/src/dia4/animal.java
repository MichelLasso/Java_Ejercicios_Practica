/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia4;

/**
 *
 * @author Uniminuto Tibu
 */
public class animal {

    public animal() {
    }
    
    private String name;

    public animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void comer(){
        System.out.println("El animal está comiendo");
    }
}
