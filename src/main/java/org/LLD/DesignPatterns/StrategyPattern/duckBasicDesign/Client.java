package org.LLD.DesignPatterns.StrategyPattern.duckBasicDesign;

public class Client {

    public static void main(String[] args) {

        ///  Problems

        /**
         * <b>Problem -1</b>
         * <br>
         * <b> Inheriting behaviors by child which are not applicable to children</b>
         * <p>
         *   As we know the child class will implement all the state and behavior from its parent
         *   we are getting  fly behaviour for rubber duck also.
         * </p>
         * <b>Problem -2</b>
         * <br>
         * <b> Adding an abstract behaviour in parent class should be override in all its child classes</b>
         * <p>
         *   As we know the child class will implement all the state and behavior from its parent
         *   we are getting  fly behaviour for rubber duck also.
         * </p>
         **/
        Duck duck = new RubberDuck();
        duck.fly();
    }
}
