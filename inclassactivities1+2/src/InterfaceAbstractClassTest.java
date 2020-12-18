
public class InterfaceAbstractClassTest {
    public static void main(String[] args) {

        Object[] allObjects = {new Chicken(), new Tiger(), new Apple(), new Orange()};
        for (Object o : allObjects){
            if (o instanceof Edible)
                System.out.println(((Edible)o).howToEat());
            if (o instanceof Animal)
                System.out.println(((Animal)o).type());
        }

        Animal[] animalObjects = {new Chicken(), new Tiger()};
        Animal maxLegAnimal = (Animal)animalObjects[0];
        for (Animal a : animalObjects){
        //    maxLegAnimal = Animal.max(maxLegAnimal, a); // Use this if you use the max() method in Animal class and then comment out the following if(..){..} condition part

            if(a.compareTo(maxLegAnimal) > 0)
                maxLegAnimal = a;

        }
        System.out.println("Animal with maximum legs: " + maxLegAnimal.getName());

    }

}
