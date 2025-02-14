package org.LLD.Generics.genericsintro;

public class Client {

    public static void main(String[] args) {

        /// The below object creation without diamond is raw type
        /// which legacy code before introducing generics in java 5
        /// This is allowed only because of backward compatibility
        Pair coOrdinates = new Pair(10,20);

        System.out.println(coOrdinates.getFirst());
        System.out.println(coOrdinates.getSecond());

        /// The below object creation with diamond
        Pair<Integer,Integer> coOrdinates2 = new Pair<>(10,20);

        System.out.println(coOrdinates2.getFirst());
        System.out.println(coOrdinates2.getSecond());
    }
}
