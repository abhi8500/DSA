package org.LLD.FunctionalProgramming.Streams;

import org.LLD.Collections.list.studentsorter.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClient {

    public static void main(String[] args) {

        List<Integer> list = List.of(5,10,2,1,16,1,2,3);
        Stream<Integer> streamList = list.stream();

        /// forEach will expect Consumer Functional Interface
        streamList.forEach(System.out::println);

        list.stream().limit(3)
                .forEach(System.out::println);

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("abhi",27));
        studentList.add(new Student("Nikki",25));
        studentList.add(new Student("Raghu",32));

        studentList.stream().filter(e -> e.getAge() > 26)
                .limit(1)
                .forEach(System.out::println);

        studentList = studentList.stream().limit(1).collect(Collectors.toList());


        List<Integer> evenList = list.stream().filter(e -> e%2 == 0).map(e -> e*e).toList();

        System.out.println(evenList);
    }
}
