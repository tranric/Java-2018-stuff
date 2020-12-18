
public abstract class Fruit implements Edible{

}

class Apple extends Fruit {


	public void howtoeat(){
		System.out.println("Make apple pie.");
	}

}

class Orange extends Fruit{

	public void howtoeat(){
		System.out.println("Make orange juice.");
	}

}
