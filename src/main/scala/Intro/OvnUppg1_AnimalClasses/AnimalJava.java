package Intro.OvnUppg1_AnimalClasses;

public class AnimalJava {
    String animalType;
    int legs;

    public AnimalJava(String animalType, int legs){
        this.animalType = animalType;
        this.legs = legs;
    }

    public void printEverything() {
        System.out.println("I'm a "+ animalType +" with "+ legs +" legs.");
    }

    @Override
    public String toString() {
        return "I'm a "+ animalType +" with "+ legs +" legs.";
    }

}
