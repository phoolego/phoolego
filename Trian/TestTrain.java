package Train;

public class TestTrain {
	public static void main(String[] args){
		Locomotive e1 = new Locomotive(70);
		Locomotive e2 = new Locomotive(130);
		
		FirstClass f1 = new FirstClass();
		
		Passenger p1 = new Passenger("Bob", 70);
		Passenger p2 = new Passenger("Alex", 60);
		Passenger p3 = new Passenger("Jan", 50);
		
		System.out.println("test FirstClass class=====");
		f1.addPassenger(p1, p2);
		f1.addPassenger(p1);
		f1.addPassenger(p3, p2, p1);
		f1.printInfo();
		System.out.println(f1.getWeight());
		f1.deletePassenger(1);
		f1.printInfo();
		System.out.println(f1.getWeight());
		
		System.out.println("\ntest RegularClass class=====");
		RegularClass r1 = new RegularClass();
		
		for(int i=0 ; i<14 ; i++) 
		{
			r1.addPassenger(p1);
			r1.addPassenger(p2);
			r1.addPassenger(p3);
		}
		r1.printInfo();
		System.out.println(r1.getWeight());
		
		System.out.println("\ntest Train class=====");
		Trian t1 = new Trian(e1, 10);
		
		System.out.println(t1.getCurrentSpeed());
		t1.insertCarriage(f1);
		System.out.println(t1.getCurrentSpeed());
		t1.insertCarriage(f1);
		System.out.println(t1.getCurrentSpeed());
		for(int i=0 ; i<8 ; i++) 
		{
			t1.insertCarriage(r1);
		}
		System.out.println(t1.getCurrentSpeed());
		
		t1.ejectCarriage();
		System.out.println(t1.getCurrentSpeed());
		t1.insertCarriage(e2);
		System.out.println(t1.getCurrentSpeed());
	}
}
