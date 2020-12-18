
public abstract class Animal implements Comparable<Animal>{

    public abstract String type();
    public abstract int getNoOfLeg();
    public abstract String getName();

    public int compareTo(Animal o){
        if(getNoOfLeg() > o.getNoOfLeg())
            return 1;
        else if(getNoOfLeg() < o.getNoOfLeg())
            return -1;
        else
            return 0;
    }
   /*
    // Use this method if you invoke it in InterfactAbstractClassTest class
    public static Animal max(Animal a1, Animal a2){
        if(a1.compareTo(a2) > 0)
            return a1;
        else
            return a2;
    }
    */
}
