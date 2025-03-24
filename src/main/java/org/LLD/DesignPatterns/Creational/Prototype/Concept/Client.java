package org.LLD.DesignPatterns.Creational.Prototype.Concept;

public class Client {
    public static void main(String[] args) {

        NormalStudent normalStudent = new NormalStudent();
        normalStudent.setId(1);
        normalStudent.setName("Abhi");
        normalStudent.setPsp(92);
        normalStudent.setGender("M");


        /**
         * The below copy logic is called shallow copy where the pointer (copyNormalStudent)
         * will point to same object
         */
        NormalStudent copyNormalStudent = normalStudent;


        /**
         * The below copy logic is called deep copy using setters
         * This approach will create a new object and sets all data same as normalStudent
         * but the problem is lot of duplicate logic . Client have to write all this setters.
         */
        NormalStudent copyUsingSetter = new NormalStudent();
        copyUsingSetter.setId(normalStudent.getId());
        copyUsingSetter.setName(normalStudent.getName());
        copyUsingSetter.setPsp(normalStudent.getPsp());
        copyUsingSetter.setGender(normalStudent.getGender());


        /**
         * The below approach will create deep copy of NormalStudent object .
         * But the issue of the below approach is with inherited objects.
         * As explained in example below
         */
        NormalStudent copyConstructorStudent = new NormalStudent(normalStudent);

        ///  In the below example I am passing Intelligent Student object with NormalStudent reference,
        /// But with deep copy logic it will create NormalStudent Object.
        doSomething(new IntelligentStudent());

        ///  In the below example I am passing Intelligent Student object with NormalStudent reference,
        /// But due to copy method we are getting exact copy of the object.
        doSomethingPrototype(new IntelligentStudent());


    }

    public static  NormalStudent doSomething(NormalStudent student){
        NormalStudent student1 = new NormalStudent(student);
        return student1;
    }

    public static  NormalStudent doSomethingPrototype(NormalStudent student){
        NormalStudent student1 = student.copy();
        return student1;
    }
}
