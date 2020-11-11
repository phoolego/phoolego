package Armory;

public class Tester {
    public static void main(String args[]){
        AssaultRifle g1 = new AssaultRifle(5);
        AssaultRifle g2 = new AssaultRifle(5);
        g1.reload();
        g1.reload();
        g1.reload();
        g1.reload();
        g1.reload();
        g1.reload();
        g1.reload();
        System.out.println(g1.isSafetyOn());
        g1.safetySwitch();
        g1.safetySwitch();
        System.out.println("mode "+g1.getFiringMode());
        g1.shoot();
        System.out.println("ammo "+g1.getCurrentLoad());
        g1.switchMode();
        System.out.println("mode "+g1.getFiringMode());
        g1.shoot();
        System.out.println("ammo "+g1.getCurrentLoad());
        g1.shoot();
        System.out.println("ammo "+g1.getCurrentLoad());
        g1.reload();
        System.out.println("ammo "+g1.getCurrentLoad());
        g1.switchMode();
        System.out.println("mode "+g1.getFiringMode());
        g1.shoot();
        System.out.println("ammo "+g1.getCurrentLoad());
        g2.switchMode();
        System.out.println(g2.getFiringMode());
        Gun a = g2;
        ((AssaultRifle)a).switchMode();
        System.out.println(((AssaultRifle)a).getFiringMode());
    }
}
