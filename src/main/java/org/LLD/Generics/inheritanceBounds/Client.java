package org.LLD.Generics.inheritanceBounds;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog"));
        animals.add(new Animal("Tiger"));
        animals.add(new Animal("Lion"));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Pitbull"));
        dogs.add(new Dog("Labardor"));
        dogs.add(new Dog("German Sephard"));


        /// This will allow as function is excepting list of animal objects
        AnimalUtility.printAnimals(animals);

        /// This will not allow as List<Dog> is not a chile of List<Animal>
        /// The child of LList<Animal> is ArrayList<Animal> / LinkedList<Animal> etc...
        /// AnimalUtility.printAnimals(dogs);
        /// To achieve above we can use bound generic like below
        AnimalUtility.printGenericAnimals(dogs);
        AnimalUtility.printGenericAnimals(animals);

        /// Type Erasure
        /// Generics were introduced to the Java language to provide tighter type checks at compile time and to support generic programming. To implement generics, the Java compiler applies type erasure to:

        ///  Replace all type parameters in generic types with their bounds or Object if the type parameters are unbounded. The produced bytecode, therefore, contains only ordinary classes, interfaces, and methods.
        ///     Insert type casts if necessary to preserve type safety.
        ///  Generate bridge methods to preserve polymorphism in extended generic types.
        ///Type erasure ensures that no new classes are created for parameterized types; consequently, generics incur no runtime overhead.


    }
}
