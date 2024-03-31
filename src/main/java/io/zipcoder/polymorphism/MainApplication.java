package io.zipcoder.polymorphism;

import java.util.*;

public class MainApplication {
    private static Integer numberOfPets;
    private static Scanner userInput = new Scanner(System.in);
    private static List<Pet> petList = new ArrayList<>();
    private static String petType;
    private static String petName;

    public static void main(String[] args) {
        MainApplication run = new MainApplication();
        run.talkingPets();
    }

    public void talkingPets() {
        System.out.println("Welcome to Anthony's Talking Pets Lab!\n" +
                            "How many pets do you have?");
        numberOfPets = userInput.nextInt();

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("Is pet number " + (i+1) +" a dog, cat, or bird?");
            petType = userInput.next();

            System.out.println("And what is their name?");
            petName = userInput.next();

            switch(petType) {
                case "dog":
                    petList.add(new Dog(petName));
                    break;
                case "cat":
                    petList.add(new Cat(petName));
                    break;
                case "bird":
                    petList.add(new Bird(petName));
                    break;
                default:
                    System.out.println("Choose either dog, cat, or bird");
                    break;
            }
        }
        for (Pet pet : petList) {
            System.out.println(pet.getName() + " says " + pet.speak());
        }
    }
}
