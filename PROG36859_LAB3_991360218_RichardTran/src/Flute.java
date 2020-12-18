
public class Flute extends WoodWindFamily{

	@Override
	public String howToPlay() {

		return "by blowing into the flute";
	}

	@Override
	public String makeSound() {

		return "guiding a stream of air";
	}

	@Override
	public double getPrice() {

		return 74.90;
	}

	@Override
	public String getName() {

		return "Flute";
	}

	public String howToFix() {

		return "N/A: it cnanot be fixed";
	}

}
