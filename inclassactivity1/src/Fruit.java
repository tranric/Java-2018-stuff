
public abstract class Fruit implements Edible{

}
class Apple extends Fruit {


	public String howtoeat(){
		return "Make apple pie.";
	}

}

class Orange extends Fruit{

	public String howtoeat(){
		return "Make orange juice.";
	}

}
