
public class Drum extends PercussionFamily{

	@Override
	public String howToPlay() {

		return "by hitting the membrane";
	}

	@Override
	public String howToFix() {

		return "replace the membrane";
	}

	@Override
	public String makeSound() {

		return "virating streched membrane";
	}

	@Override
	public double getPrice() {

		return 349.50;
	}

	@Override
	public String getName() {

		return "Drum";
	}




}
