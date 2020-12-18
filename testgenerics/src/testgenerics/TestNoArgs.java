package testgenerics;

public class TestNoArgs {

	public static void main(String[] args) {

		//Apple a1 = new Apple("apple" , "red", 1);

		//Fruit f1 = new Fruit();

		//Fruit f2 = new Fruit("Apple","Red");

		C3 c3 = new C3();//constructor chaining

		//C2 c2 = new C2();

	}


}

class C1{
	C1(){
		System.out.print("Hello");
	}

}

class C2 extends C1{
	C2(){
		this(4);
		System.out.println(" There");
	}
	C2(int i){
		System.out.println("The value of i: " + i);
	}

}

class C3 extends C2{
	C3(){
		//super(7);
		System.out.println(" Sheridan");
	}

}

class Fruit{

	String name;
	String colour;

	/*
	public Fruit(){

	}
	*/
	public Fruit(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}

}

class Apple extends Fruit{

	int id;

	public Apple(String name, String colour, int id){
		super(name, colour);
		this.id = id;
	}

}
