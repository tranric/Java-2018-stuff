
public class Chicken extends Animal implements Edible {

    @Override
    public String type(){
        return "Chicken is a bird.";
    }

    public String howToEat(){
        return "Make chicken fry.";
    }

    public String getName(){
        return "Chicken";
    }

    public int getNoOfLeg(){
    return 2;
    }

}
