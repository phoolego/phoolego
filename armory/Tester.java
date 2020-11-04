/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armory;

/**
 *
 * @author Student
 */
public class Tester {
    public static void main(String args[]){
        AssaultRifle g1 = new AssaultRifle(5);
        g1.reload();
        g1.reload();
        g1.reload();
        g1.reload();
        g1.reload();
        g1.reload();
        g1.reload();
        System.out.println(g1.getSafetyOn());
        g1.safetySwitch();
        g1.safetySwitch();
        System.out.println("mode "+g1.FiringMode);
        g1.shoot();
        System.out.println("ammo "+g1.getCurrentLoad());
        g1.switchMode();
        System.out.println("mode "+g1.FiringMode);
        g1.shoot();
        System.out.println("ammo "+g1.getCurrentLoad());
        g1.shoot();
        System.out.println("ammo "+g1.getCurrentLoad());
        g1.reload();
        System.out.println("ammo "+g1.getCurrentLoad());
        g1.switchMode();
        System.out.println("mode "+g1.FiringMode);
        g1.shoot();
        System.out.println("ammo "+g1.getCurrentLoad());
    }
}
