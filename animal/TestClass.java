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
public class TestClass {
    public static void main(String[] args) {
//        Mammal m = new Mammal();
//        m.name = "Best";
//        System.out.println(m.name);
//        Elephant ele = new Elephant("Boy",6,150,'M');
//        m.makeSound();
//        System.out.println("======================");
//        ele.makeSound();
//        System.out.println("======================");
//        Elephant ele2 = new Elephant("Ohm",5,150,'F');
//        Mammal eleChild = ele2.breed(ele);
//        eleChild.name = "Bohm?Ohmy?Bohy?";

        Mammal[] farm = { new Elephant(), new Elephant(), new Mammal("O(Parin)", 21,10,'F') };
        farm[0].makeSound();
        
        // NORMAL WAY
        Elephant e = (Elephant) farm[0];
        e.spillWater();
        
        // SHORT HAND
        ((Elephant) farm[0]).spillWater();
        
    }
}
