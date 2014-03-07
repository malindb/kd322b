public class cat extends mamal {

	private int numberOfLives;

	public cat(String latinName, int nursingTime, int numberOfLives) {

		super(latinName, nursingTime);
		this.numberOfLives = numberOfLives;
	}

	public int getnumberOfLives() {
		return numberOfLives;

	}

	public void setnumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}


	public String getInfo() {
		// TODO Auto-generated method stub
		return " The cat \"" + super.getLatinName() + "\" nurses for "
				+ super.getnursingTime() + "month and has got" + numberOfLives;
	}

}