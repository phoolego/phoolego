/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author SIT-User
 */
public class Elephant extends Mammal {

    public Elephant() {
        this("Earth",60,200,'M');
    }

    public Elephant(String name, double age, int energy,char sex) {
        super(name, age, energy,sex);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mammal breed(Mammal mate) {
        return super.breed(mate); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Pawoo. Pawoo. Pawoo!");
    }
    
    public void spillWater() {
        System.out.println("jae jae :)");
    }
}
