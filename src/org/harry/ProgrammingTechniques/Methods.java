package org.harry.ProgrammingTechniques;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args){

        Scanner animalInput = new Scanner(System.in);
        System.out.println("What's the name of the animal?");
        String animalName = animalInput.nextLine();
        System.out.println("The name of the animal is " + animalName);

        System.out.println("What's the height of the animal?");
        float animalHeight = Float.parseFloat(animalInput.nextLine());
        System.out.println("The height of the animal is " + animalHeight);

        System.out.println("How many legs does the animal have?");
        float animalLegs = Float.parseFloat(animalInput.nextLine());
        System.out.println("The animal has " + animalLegs + "legs.");

        Animal newAnimal = new Animal((int) animalLegs, animalHeight, animalName);
        newAnimal.getAnimal();

        Animal gibbon = new Animal(4,7,"Gibbon");
        gibbon.getAnimal();

        Animal lous = new Animal(2, (float) 1.75,"Loïs Gibbon");
        lous.getAnimal();

        Animal elephant = new Animal(4,5,"Elephant");
        elephant.getAnimal();

        Animal banana = new Animal(6,2,"Banana");
        banana.getAnimal();

        Animal tiger = new Animal(2,4, "tiger");
        tiger.getAnimal();

    }
    
    //procedure
    
    public static void startScreen(){
        System.out.println("***********************");
        System.out.println("******  Welcome  ******");
        System.out.println("***********************");
    }
    
    //function
    
    public static int square(int num){
        return num * num;
    }
    
    //overloading
    
    public static String hello(String name){
        return("Hello " + name);
    }
    
    public static String hello(){
        return("Hello");
    }
}
