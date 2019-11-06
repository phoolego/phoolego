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
				weigth += p.weigth;
				break;
			}
		}
	}
	
	public void deletePassenger(String n) {
		for(int i=0 ; i<seats.length ; i++) 
		{
			if(n.equals(seats[i].name)) 
			{
				weigth -= seats[i].weigth;
				seats[i]=null;
				break;
			}
		}
	}
	
	public void printInfo()
	{
		for(int i=0 ; i<seats.length && seats[i]!=null; i++) 
		{
			System.out.println("Seat "+i+" : "+seats[i].name);
		}
	}
}