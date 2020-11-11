package Armory;

public class Pistol extends Gun{
	public Pistol(int ammoCapacity) {
		super(ammoCapacity);
	}
	public void shoot() {
		if(!isSafetyOn()) {
			int load = getCurrentLoad();
			if(load>0) {
				load--;
			}else {
				System.out.println("no ammo");
			}
		}else {
			System.out.println("safety is on");
		}
	}
    public void reload(){
        super.setCurrentLoad(super.getAmmoCapacity());
        System.out.println("Current ammo is "+super.getCurrentLoad()+"/"+super.getAmmoCapacity());
    }
}
