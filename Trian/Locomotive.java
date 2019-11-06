package Train;

public class Locomotive extends Carriage{
	private double topSpeed;
	public Locomotive(double topSpeed) {
		super(3500);
		this.topSpeed = topSpeed;
	}
	
	public double getTopSpeed() {
		return topSpeed;
	}
	
	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	public void printInfo()
	{
		System.out.println("Weigth : "+weight+" Speed : "+topSpeed);
	}
}
