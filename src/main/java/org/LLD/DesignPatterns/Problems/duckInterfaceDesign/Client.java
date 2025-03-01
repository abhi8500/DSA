package org.LLD.DesignPatterns.Problems.duckInterfaceDesign;

public class Client {

    public static void main(String[] args) {

        ///  Problems

        /**
         * <b>Problem -1</b>
         * <br>
         * <b> Duplicate code - difficult to maintain</b>
         * <p>
         * Can you say, “duplicate code”? If you thought having to override a few methods was bad,
         * how are you gonna feel when you need to make a little change to the flying
         * behavior... in all 48 of the flying Duck subclasses?!
         * </p>
         **/
        Duck duck = new RubberDuck();
        duck.display();
    }
}
