
public abstract class MusicalInstrument implements Comparable<MusicalInstrument>{
	public abstract String makeSound();
	public abstract double getPrice();
	public abstract String getName();
	public abstract String howToPlay();
	public abstract String howToFix();

	 public int compareTo(MusicalInstrument o){
	        if(getPrice() > o.getPrice())
	            return 1;
	        else if(getPrice() < o.getPrice())
	            return -1;
	        else
	            return 0;
	    }
}
