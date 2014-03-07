public class Human {
	private Dog dog;
	private String name;

	public Human(String name) {
		this.name = name;

	}

	public String getName() {
		return name;

	}

	public void buyDog(Dog dog) {
		this.dog = dog;

	}

	public String getInfo() {
		String s = "";
		if (dog != null) {
			s = name + " �ger en hund som heter " + dog.getName();
		} else {
			s = name + " �ger ingen hund ";
		}
		return s;
	}
}
