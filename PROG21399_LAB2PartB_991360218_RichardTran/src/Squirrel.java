//richard tran
public class Squirrel {
	private double _weight=0;
	private int _age=0, _numOfNuts=0;
	private String _favoriteNut="";

	public double get_weight() {
		return _weight;
	}


	public void set_weight(double _weight) {
		this._weight = _weight;
	}


	public int get_age() {
		return _age;
	}


	public void set_age(int _age) {
		if(_age < 0){
			_age=0;
		}
		this._age = _age;
	}


	public int get_numOfNuts() {
		return _numOfNuts;
	}


	public void set_numOfNuts(int _numOfNuts) {
		if(_numOfNuts < 0 ){
			_numOfNuts =0;
		}
		this._numOfNuts = _numOfNuts;
	}


	public String get_favoriteNut() {
		return _favoriteNut;
	}


	public void set_favoriteNut(String _favoriteNut) {
		this._favoriteNut = _favoriteNut;
	}

	public void displaySquirrel(Squirrel squirrel){
		System.out.printf("\nThe Squirrel's weight"
				+ " is: %.2f", squirrel._weight);
		System.out.printf("\nThe Squirrel's"
				+ " age is: %d", squirrel._age);
		System.out.printf("\nThe Squirrel has %d Number of nuts.\n"
				+ "The Squirrel's favorite nut "
				+ "type is:%s", squirrel._numOfNuts, squirrel._favoriteNut);


	}

}
