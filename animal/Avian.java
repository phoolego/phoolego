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
public class Avian extends Animal implements Flyable{

    public Avian() {
        this("Toei",8,100,'M');
    }

    public Avian(String name, double age, int energy, char sex) {
        super(name, age, energy,sex);
    }
    
    @Override
    public void makeSound(){
        System.out.println("Quack!");
    } 
    @Override
    public void fly(){
        
    }
}
