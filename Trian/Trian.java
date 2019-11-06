package Train;

public class Trian {
	private Locomotive locomotive;
	private Carriage[] carriage;
	private int size; 
	private double currentSpeed;
	
	public Trian(Locomotive l,int n){
		locomotive = l;
		carriage = new Carriage[n];
		size = 0;
		currentSpeed = locomotive.getTopSpeed();
	}
	
	public void setLocomotive(Locomotive l) {
		this.locomotive = l;
	}
	public Locomotive getLocomotive(){
		return locomotive;
	}
	public int getSize() {
		return size;
	}
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	public double getTopSpeed() {
		return locomotive.getTopSpeed();
	}
	
	public void insertCarriage(Carriage c){
		if(size<carriage.length) 
		{
			carriage[size++] = c;
			calculateCurrentSpeed();
		}
		else
			System.out.println("Trian is full");
	}
	public void ejectCarriage() {
		if(size>0) 
		{
			carriage[--size] = null;
			calculateCurrentSpeed();
		}
		else
			System.out.println("Trian is empty");
	}
	
	public int totalWeigth() {
		int total=locomotive.getWeight();
		for(int i=0 ; i<size ; i++) 
		{
			total += carriage[i].getWeight();
		}
		return total;
	}
	public void calculateCurrentSpeed(){
		double decreaseSpeed = (int)((totalWeigth()-locomotive.getWeight())/100)*0.01;
		currentSpeed = locomotive.getTopSpeed()-decreaseSpeed;
	}
}
