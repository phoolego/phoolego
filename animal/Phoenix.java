package animal;
public class Phoenix extends Avian{
    double temperature;
    public Phoenix(double tempertaure){
        this("Spicy Firey Bird",0,500,'M',tempertaure);
    }
    public Phoenix(String name, double age, int energy, char sex, double tempertaure) {
        super(name, age, energy,sex);
        this.temperature = tempertaure;
    }
    
    @Override
    public void makeSound(){
        System.out.println("S P I C Y ! !");
    }
    
    public void fireBreath(){
        System.out.println("S P I C Y  F L A M E ! !");
        setEnergy((int) (getEnergy()-this.temperature));
        this.temperature *= 2;
        if (dead()){
            rebirth();
        }
    }
    
    public boolean dead(){
        if(this.getEnergy()==1){
            return true;
        } else return false;
    }
    
    public void rebirth(){
        System.out.println("I ' M  B A C K ! !");
        System.out.println("V R O O M\nV R O O M");
        setAge(0);
        this.temperature = 100;
        setEnergy(500);
    }
}
