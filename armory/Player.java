package Armory;

public class Player {
	private int id;
	public String name;
	private Gun primary;
	private Pistol secondary;
	private static int idGenerator=0;
	
	public Player(String name) {
		this.name = name;
	}
	public void setPrimary(Gun primary) {
		this.primary = primary;
	}
	public void setSecondary(Pistol secondary) {
		this.secondary = secondary;
	}
	public Gun getPrimary() {
		return primary;
	}
	public Pistol getSecondary() {
		return secondary;
	}
	public void shootPrimary(){
		primary.shoot();
	}
	public void shootSecondary(){
		secondary.shoot();
	}
	public void switchFiringModeOfPrimary() {
		if(primary instanceof AssaultRifle) {
			((AssaultRifle)primary).switchMode();
		}else {
			System.out.println("This gun can't switch the mode");
		}
	}
}
