package main.java;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args){

        Animal Bird = new Bird("Parrot");

        Animal Duck = new Duck("duck");

        List<Animal> animals = new ArrayList<>();

        animals.add(Bird);
        animals.add(Duck);

        for(Animal animal : animals){
            animal.eat();
            animal.makeSound();

            if(animal instanceof flyable){
                ((flyable) animal).fly();
            }

            if(animal instanceof swimmable){
                ((swimmable) animal).swim();
            }
        }
    }
}
