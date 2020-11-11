package Armory;

public class Shotgun extends Gun{
	private boolean isLoad;
	public Shotgun(int ammoCapacity) {
		super(ammoCapacity);
	}
	public boolean isLoad() {
		return isLoad;
	}
	public void shoot() {
		if(!isSafetyOn()) {
			int load = getCurrentLoad();
			if(load>0) {
				load--;
				isLoad = false;
			}else {
				System.out.println("no ammo");
			}
		}else {
			System.out.println("safety is on");
		}
	}
	public void pump(){
		isLoad=true;
	}
}
