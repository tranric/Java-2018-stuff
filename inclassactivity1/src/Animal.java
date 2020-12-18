
abstract class Animal {
	abstract String sound();
}

abstract class Chicken extends Animal implements Edible{

	public String howtoeat(){
		return "Make chicken soup.";
	}

}


class Tiger extends Animal{

	@Override
	String sound() {

		return "The Tiger roars";
	}

}