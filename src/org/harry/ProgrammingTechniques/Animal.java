package org.harry.ProgrammingTechniques;
class Animal {
    private int numberOfLegs;
    private float height;
    private String nameOfAnimal;
    
    Animal(int legNum, float theHeight, String theName){
        numberOfLegs = legNum;
        height = theHeight;
        nameOfAnimal = theName;
        
    }
    // methods / behaviors
    void getAnimal(){
        System.out.println("The " + nameOfAnimal + " is " + height + "m tall" + " and has " + numberOfLegs + " leg(s).");
    }
}
