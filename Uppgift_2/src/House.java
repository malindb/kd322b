public class House {
//////////instansvariabler: //////////	
	private int year;
	private int size;	
//////////klassvariabel: //////////
	private static int nbrOfHouses;
	public static final int MIN_SIZE = 10; 	
//////////konstruktor: //////////	
	public House (int _year , int _size){ 
	       year = _year;
	       if (_size >= MIN_SIZE) {
	    	   size = _size;
	       } else {
	    	   size = MIN_SIZE;
	       }
	nbrOfHouses ++ ;
	}

//////////klassmetod: //////////
	public static int getNbrHouses(){ 
		return nbrOfHouses;
	}
//////////instansmetod: //////////	
	public int getYear() {     
	       return year;
	}
	public int getSize(){     
	      return size;
	}

}

