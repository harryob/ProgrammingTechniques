package org.harry;
public class Animal {
    private int numberOfLegs;
    private float height;
    private String nameOfAnimal;
    
    public Animal(int legNum, float theHeight, String theName){
        numberOfLegs = legNum;
        height = theHeight;
        nameOfAnimal = theName;
        
    }
    // methods / behaviors
    public void getAnimal(){
        System.out.println("The " + nameOfAnimal + " is " + height + "m tall" + " and has " + numberOfLegs + " leg(s).");
    }
}
