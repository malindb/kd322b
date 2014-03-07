
public class Bike {
	//*instansvariabler: *//	
	private String color;
	private int price;
	private int size;
	//*klassvariabler: *//
	private static int nbrOfBikes; //counts nbr of instances 

	//*konstruktor*//
/** Creates a bike with the properties of color and size */
	public Bike ( String _color, int _size) {	
		this( _color, _size, 0);
	}
/** Creates a bike with instance variables from values in Constants.jave. If no price is declared, 
 * the set standard price is 9000. If no size is declared, the standard is 20 */	
    public Bike (String color, int size, int price) {
    	this.color = Constants.bikeCon(color);
     if (price > Constants.MIN_PRICE && price < Constants.MAX_PRICE) {
  	   this.price = price; 
     } else {
    	 price = 9000; 
     }
     if ( size > Constants.MIN_SIZE && size < Constants.MAX_SIZE ){
    	this.size = size;
     } else {
    	 size = 20; 
     }
     nbrOfBikes++;
}
     
//* instansmetod *//
public String getColor(){
    return color;
}
    
public int getSize() {
	return size;
}

public int getPrice(){
	return price;
}

public int  setPrice () {
	return price;
}
//*klassmetod:*//
public static int getNumberOfBikes (){
	return nbrOfBikes;
}
}