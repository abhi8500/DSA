package org.DSA.OOPS;

public class Client {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.age = 10;
//        s1.name = "A";
//
//        Student s2 = new Student();
//        s2.age = 20;
//        s2.name = "B";
//
//        swap(s1, s2);
//
//        s1.display();

        P obj = new C();
        System.out.println(obj.d1);
        System.out.println(obj.d);
        obj.fun1();
        obj.fun();
        obj.sfun();
    }

    private static void swap(Student s1, Student s2) {
        Student temp = s1;
        s1 = s2;
        s2 = temp;
    }
}
