package armory;

/**
 *
 * @author Student
 */
public abstract class Gun {
    private int ammoCapacity;
    private int currentLoad;
    private boolean safetyOn;
    
    public Gun(int ammoCapacity){
        setAmmoCapacity(ammoCapacity);
    }
    
    public void setAmmoCapacity(int ammoCapacity){
        if(ammoCapacity>=1){
            this.ammoCapacity = ammoCapacity;
        }else{
            this.ammoCapacity = 1;
        }
    }

    public void setCurrentLoad(int currentLoad) {
        if(currentLoad>=0 && currentLoad<=ammoCapacity){
            this.currentLoad = currentLoad;
        }else if(currentLoad<0){
            this.currentLoad = 0;
        }else{
            currentLoad = ammoCapacity;
        }
    }

    public int getAmmoCapacity() {
        return ammoCapacity;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public boolean getSafetyOn() {
        return safetyOn;
    }
    
    public void safetySwitch(){
        safetyOn = !safetyOn;
        System.out.println("safety "+ (safetyOn ? "on":"off"));
        
    }
    
    public void reload(){
        if(currentLoad<ammoCapacity){
            currentLoad++;
        }else{
            System.out.println("your ammo is full");
        }
        System.out.println("Current ammo is "+currentLoad+"/"+ammoCapacity);
    }
    
    public abstract void shoot();
    
}
