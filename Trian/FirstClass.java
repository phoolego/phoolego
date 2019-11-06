package Train;

public class FirstClass extends Carriage{
	private Passenger[][] room;
	
	public FirstClass() {
		super(2500);
		room = new Passenger[5][3];
	}
	
	public void addPassenger(Passenger p1) {
		addPassenger(p1, null);
	}
	public void addPassenger(Passenger p1,Passenger p2) {
		addPassenger(p1, p2, null);
	}
	public void addPassenger(Passenger p1,Passenger p2,Passenger p3) {
		Passenger[] tmp = {p1,p2,p3};
		for(int i=0 ; i<room.length ; i++) 
		{
			if(room[i][0]==null) 
			{
				for(int j=0 ; j<room[i].length ; j++)
				{
					if(tmp[j]!=null) 
					{
						room[i][j] = tmp[j];
						weight += tmp[j].getWeight();
					}
				}
				break;
			}
		}
	}
	
	public void deletePassenger(int n) {
		n--;
		for(int i=0 ; i<room[i].length && n<room.length ; i++) 
		{
			if(room[n][i]!=null) 
			{
				weight -= room[n][i].getWeight();
				room[n][i] = null;
			}
		}
	}
	
	public void printInfo()
	{
		for(int i=0 ; i<room.length ; i++) 
		{
			if(room[i][0]!=null) 
			{
				System.out.print("Room "+(i+1)+" :");
				for(int j=0 ; j<room[i].length && room[i][j]!=null ; j++) 
				{
					System.out.print(" "+room[i][j].getName());
				}
				System.out.println();
			}
		}
	}
}
