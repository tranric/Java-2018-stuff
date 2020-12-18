
public class Squirreltest {

	public static void main(String[] args) {
		Squirrel squirrel = new Squirrel();

		squirrel.set_age(5);
		squirrel.set_favoriteNut("Walnut");
		squirrel.set_numOfNuts(10);
		squirrel.set_weight(12.5);
		squirrel.displaySquirrel(squirrel);

		squirrel.set_numOfNuts(9);
		System.out.printf("\nThe number of"
				+ " nuts that squirrel has is:%d",squirrel.get_numOfNuts());
		squirrel.set_favoriteNut("Hazelnut");
		System.out.printf("\nThe squirrel's"
				+ " favorite nut type is:%s",squirrel.get_favoriteNut());


	}

}
