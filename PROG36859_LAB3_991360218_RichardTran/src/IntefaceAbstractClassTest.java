//Student name: Richard Tran
//id: 991360218
//Date: 2018-10-05 (yyyy-mm-dd)
//Class: PROG36859 - object oriented programming 2
//Assignment: LAB 3
//Instructor: Syed Tanbeer
public class IntefaceAbstractClassTest {


	public static void main(String[] args) {


		//an array that contains a copy of each object.
		MusicalInstrument[] allObjects = {new Guitar(), new Harp(),
				 new Drum(), new Xylophone(), new Flute()};

		 //to find the highest priced object finding through getprice method.
		 MusicalInstrument maxprice = (MusicalInstrument)allObjects[0];

	        for (MusicalInstrument a : allObjects){

	                if(a.compareTo(maxprice) > 0)
	                	maxprice = a;

	            }
	        //printing all of the data of the highest priced item
	            System.out.println("The most expensive instrument is: " + maxprice.getName());
	            System.out.println(maxprice.getName() + "'s cost is: $" + maxprice.getPrice());
	            System.out.println(maxprice.getName() + " is played: " + maxprice.howToPlay());
	            System.out.println(maxprice.getName() + " fixing: " + maxprice.howToFix());

	}

}
