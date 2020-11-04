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
public class AssaultRifle extends Gun{
    int FiringMode;
    
    public AssaultRifle(int ammoCapacity){
        super(ammoCapacity);
    }
    
    public void reload(){
        super.setCurrentLoad(super.getAmmoCapacity());
    }
    
    public void switchMode(){
        FiringMode = (FiringMode+1)%3;
    } 

    @Override
    public void shoot() {
        if(!super.getSafetyOn()){
            int ammo = super.getCurrentLoad();
            if(FiringMode==0){
                ammo--;
            }else if(FiringMode==1){
                ammo-=3;
            }else{
                ammo=0;
            }
            super.setCurrentLoad(ammo);
        }else{
            System.out.println("safety is on");
        }
    }
}
