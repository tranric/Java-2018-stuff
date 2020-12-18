/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Tanbeer
 */
public class Chicken extends Animal implements Edible{
    public String type(){
        return "It's a bird.";
    }

    public String howToEat(){
        return "Fry it.";
    }

}
