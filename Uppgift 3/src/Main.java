import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<Bike>	myBike = new ArrayList<Bike> (); 
	
	Bike bike1 = new Bike ("Black", 28, 2000);
	Bike bike2 = new Bike ("Red", 22, 5000);
	Bike bike3 = new Bike ("Blue", 15, 500);
	Bike bike4 = new Bike ("Beige", 18, 9000);
	Bike bike5 = new Bike ("White", 24, 2000);
	Bike bike6 = new Bike ("Beige", 8, 12000);
	Bike bike7 = new Bike ("Blue", 12, 15000);
	Bike bike8 = new Bike ("Black", 24, 8000);
	Bike bike9 = new Bike ("White", 28, 12000);
	Bike bike10 = new Bike ("Red", 26, 10000);
		
	myBike.add(bike1);
	myBike.add(bike2);
	myBike.add(bike3);
	myBike.add(bike4);
	myBike.add(bike5);
	myBike.add(bike6);
	myBike.add(bike7);
	myBike.add(bike8);
	myBike.add(bike9);
	myBike.add(bike10);
	
	for (int i = 0; i < myBike.size(); i++){
		System.out.println(myBike.get(i).getSize() + "\t " + myBike.get(i).getColor() + "\t " +myBike.get(i).getPrice());
	}
	BikeStore myBikeStore = new BikeStore(); 
	
	String s = myBikeStore.getAllBikes();
	System.out.println("all bikes");
	System.out.println(s);
	}
}
