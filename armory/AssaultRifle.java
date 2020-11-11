package Armory;

public class AssaultRifle extends Gun{
    private int firingMode;
    
    public int getFiringMode() {
    	return firingMode;
    }
    public AssaultRifle(int ammoCapacity){
        super(ammoCapacity);
    }
    
    public void reload(){
        super.setCurrentLoad(super.getAmmoCapacity());
        System.out.println("Current ammo is "+super.getCurrentLoad()+"/"+super.getAmmoCapacity());
    }
    
    public void switchMode(){
    	firingMode = (firingMode+1)%3;
    } 

    @Override
    public void shoot() {
        if(!super.isSafetyOn()){
            int ammo = super.getCurrentLoad();
            if(firingMode==0 && ammo>0){
                ammo--;
            }else if(firingMode==1 && ammo>2){
                ammo-=3;
            }else if(firingMode==1 && ammo>0) {
            	ammo=0;
            }
            else if(ammo>0){
                ammo=0;
            }else {
            	System.out.println("no ammo");
            }
            super.setCurrentLoad(ammo);
        }else{
            System.out.println("safety is on");
        }
    }
}
