public abstract class Animal {
	private String latinName;
	
	public Animal(String latinName){
		setLatinName(latinName);
		
	}
	public abstract String getInfo();
	
	public String getLatinName(){
		return latinName;
		
	}
	
	public void setLatinName(String latinName){
		this.latinName = latinName;
	}
	
	

}