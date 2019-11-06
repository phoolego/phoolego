public class Locomotive extends Carriage{
	private double topSpeed;
	public Locomotive(double topSpeed) {
		super(3000);
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
		System.out.println("Weigth : "+weigth+" Speed : "+topSpeed);
	}
}
