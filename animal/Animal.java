package animal;

public abstract class Animal {

    public String name;
    private double age;
    private int energy;
    private char sex;

    public Animal() {
        this("Now", 18, 50, 'M');
    }

    public Animal(String name, double age, int energy, char sex) {
        this.name = name;
        this.setAge(age);
        this.setEnergy(energy);
        this.setSex(sex);
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        if (age < 0) {
            age = 1;
        }
        this.age = age;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (energy < 0) {
            energy = 1;
        }
        this.energy = energy;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (sex == 'F' | sex == 'M') {
            this.sex = sex;
        }else{
            this.sex = 'F';
        }
    }

    public void eat() {

    }

    public void move() {

    }

    public abstract void makeSound();
}
