package Armory;

public class Revolver extends Pistol{
	public Revolver() {
		super(6);
	}
    public void reload(){
        super.setCurrentLoad(super.getCurrentLoad()+1);
        System.out.println("Current ammo is "+super.getCurrentLoad()+"/"+super.getAmmoCapacity());
    }
}
