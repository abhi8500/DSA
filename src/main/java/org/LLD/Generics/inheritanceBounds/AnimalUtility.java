package org.LLD.Generics.inheritanceBounds;

import java.util.List;

public class AnimalUtility {

    public static void printAnimals(List<Animal> animals) {

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }


    /// printAnimalsWithGeneric
    public static <T extends Animal> List<T> printGenericAnimals(List<T> animals) {
        /// The below add is not allowed in bound generic
        ///animals.add(new Animal("Elephant"));
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        return animals;
    }

    /// printAnimalsWithGeneric
    /// As return type is void we cannot tell the function about generic
    public static void printGenericAnimals2(List<? extends Animal> animals) {
        /// The below add is not allowed in bound generic
        ///animals.add(new Animal("Elephant"));
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }


    /// T super Animal --> means bound Animal anything above Animal level(Parents of Animal)
}
