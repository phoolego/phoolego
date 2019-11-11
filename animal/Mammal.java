package animal;
public class Mammal extends Animal{

    public Mammal() {
        this("New",18,49,'F');
    }

    public Mammal(String name, double age, int energy,char sex) {
        super(name, age, energy,sex);
    }
    
    
    public Mammal breed(Mammal mate){
        if(this.getSex() != mate.getSex()){
            return new Mammal();
        }else{
            System.out.println("Ha GAYYYYYYYYYY");
        }
        return null;
    }
    
    @Override
    public void makeSound(){
        System.out.println("MAMMAL!!!!");
    }
}
