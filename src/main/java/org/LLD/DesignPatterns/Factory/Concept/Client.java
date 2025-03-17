package org.LLD.DesignPatterns.Factory.Concept;

import org.LLD.DesignPatterns.Factory.Concept.components.Button.Button;
import org.LLD.DesignPatterns.Factory.Concept.components.Dropdown.Dropdown;
import org.LLD.DesignPatterns.Factory.Concept.components.Menu.Menu;

public class Client {

    public static void main(String[] args) {


        /**
         * The below approach of object creation will have 4 problems
         * 1. The client class is coupled with child class
         * 2. Lots of duplicate code because every client have to write the below logic.
         * 3. It is breaking the SRP principle because client uses this object and do some extra things bases on the object
         * 4. It is breaking the OCP Principle as if new child objects comes then we should modify existing code instead of extension
         */
        User user;
        String userType = "Student";
        if (userType.equals("Student")) {
            user = new Student("John", "Doe");
        } else if (userType.equals("Teacher")) {
            user = new Teacher("John", "Doe");
        } else if (userType.equals("Principle")) {
            user = new Principle("John", "Doe");
        }

        /**
         * The below approach of object creation solved all the problems which are mentioned above expect OCP Principle
         * Now object creation is not duplicated , SRP is not breaking,and we get of tight coupling of client class with child classes.
         */
        User simpleFactoryUser = SimpleUserFactory.createUser(userType);

        /**
         * The below approach of object creation solved all the problems which are mentioned even OCP Principle also
         * But with a lot of extra code , But the implementation cannot be like different types of children, it can be based on strategy
         * Like in VideoGame Application there is a obstacle it can be tree,snake or stone , now factory method implementation can be done using strategies
         * If a user wants Balanced Obstacle from level 1 to level 5 then the factory method implementation is responsible to provide the obstacle  out of 3 we have
         * balanced and after level 5 obstacles are random the  another factory implementation to give random obstacles.
         * So the final point is the implementation is just responsible for creating objects. But not to follow OCP principle
         */
        UserFactoryMethod userFactoryMethod = new TeacherFactoryMethodImpl();
        User factoryMethodUser = userFactoryMethod.createUser();


        /**
         * The below approach of object creation do all the abstraction of the object creation and client no need to worry about logic
         * We can use simple factory in abstract factory. So Abstract Factory means basically factory of factories
         * For example if we create separate factories for Button,Menu,Dropdown . If one factory returns the Android Button and
         * checkbox factory returns the IOS factory means this will make the system inconsistency. That's why we created a factory of factories where all the
         * objects of same platform are returning from the factory.
         */
        String systemPlatform = "IOS";
        Platform platform = PlatformFactory.getPlatform("systemPlatform");
        UIComponentFactory uiComponentFactory = platform.createUIComponentFactory();

        Button button = uiComponentFactory.createButton();
        Dropdown dropdown = uiComponentFactory.createDropdown();
        Menu menu = uiComponentFactory.createMenu();

    }
}
