import java.util.ArrayList;

public class BikeStore {
	// private String addBike;
	//  String newBikes;

	ArrayList<Bike> bikes = new ArrayList<Bike> (); 

	public String getAllBikes() {
		String s = "";
		for (int i = 0; i < bikes.size(); i++){
			Bike bike1 = bikes.get(i);
			s = s+ "The colour of the bike is " + bike1.getColor() + "\t the size of it is " 
					+bike1.getSize() + "\t the price of it is" +bike1.getPrice() + "\n";	 
		}
		return s;
	}
		public void addBike(String color, int size, int price) {
			bikes.add (new Bike(color, size, price));
		}
	}

