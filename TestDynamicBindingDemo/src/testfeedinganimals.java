import java.util.ArrayList;

public class testfeedinganimals {

	public static void main(String[] args) {

		Deer deer = new Deer();
		Horse horse = new Horse();
		Elephant elephant = new Elephant();
		Apple apple = new Apple();
		Orange orange = new Orange();

		deer.howtoeat();
		apple.howtoeat();
		orange.howtoeat();

		Animal a1 = new Deer();
		Animal a2 = new Horse();
		Animal a3 = new Elephant();

		ArrayList<Animal> animalarraylist = new ArrayList();
		animalarraylist.add(a1);
		animalarraylist.add(a2);
		animalarraylist.add(a3);


		feedanimalarraylist(animalarraylist);
		moveanimal(animalarraylist);

//		a1.move();
//		a2.move();
//		a3.move();



//		feedAnimal(a1);
//		feedAnimal(a2);
//		feedAnimal(a3);

//		feedAnimal(deer);
//		feedAnimal(horse);
//		feedAnimal(elephant);

	}

	static void feedanimalarraylist(ArrayList<Animal> animallist){

		for(int x=0; x < animallist.size(); x++){
			if(animallist.get(x) instanceof Elephant){
				animallist.get(x).doNotFeed();
					}
					else{
						animallist.get(x).feed();
					}
		}
		/*
		//enhanced for loop
		for(Animal a : animallist){
			if(a instanceof Elephant){
				a.doNotFeed();
			}
			else{
				a.feed();
			}
		}
		*/

	}

	static void moveanimal(ArrayList<Animal> animallist){

		for(Animal a : animallist){
			a.move();
		}
	}

	static void feedAnimal(Animal animal){
		if(animal instanceof Elephant){
	//	((Elephant)animal).doNotFeed();
			animal.doNotFeed();
		}
		else{
			animal.feed();
		}



	}



}

abstract class Animal {
	abstract void feed();
	abstract void move();
	/*
	 void feed(){
		System.out.println("Feed animal");
	}
	 */
	 void doNotFeed(){
		 System.out.println("Don't feed.");
	 }



}

class Deer extends Animal implements Edible{
	public void howtoeat(){
		System.out.println("Make deer B.B.Q.");
	}
	void move(){
		System.out.println("Deer Jumps.");
	}
	 void feed(){
		System.out.println("Feeding done: Deer needs 5 amount of food.");
	}
}
class Horse extends Animal{
	void move(){
		System.out.println("The horse runs.");
	}
	 void feed(){
		System.out.println("Feeding done: Horse needs 10 amount of food.");
	}
}
class Elephant extends Animal{
	void move(){
		System.out.println("The Elephant moves slowly.");
	}
	 void feed(){
		System.out.println("Feeding done: Elephant needs 50 amount of food.");
	}
	 void doNotFeed(){
		 System.out.println("Don't feed the Elephant.");
	 }
}
