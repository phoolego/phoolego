package Train;

public class RegularClass extends Carriage{
	private Passenger[] seats;
	
	public RegularClass() {
		super(2000);
		seats = new Passenger[40];
	}
	
	public void addPassenger(Passenger p) {
		for(int i=0 ; i<seats.length ; i++) 
		{
			if(seats[i]==null) 
			{
				seats[i]=p;
				weight += p.getWeight();
				break;
			}
		}
	}
	
	public void deletePassenger(String n) {
		for(int i=0 ; i<seats.length ; i++) 
		{
			if(n.equals(seats[i].getName())) 
			{
				weight -= seats[i].getWeight();
				seats[i]=null;
				break;
			}
		}
	}
	
	public void printInfo()
	{
		for(int i=0 ; i<seats.length && seats[i]!=null; i++) 
		{
			System.out.println("Seat "+(i+1)+" : "+seats[i].getName());
		}
	}
}