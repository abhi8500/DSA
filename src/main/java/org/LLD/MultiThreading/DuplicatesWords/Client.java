package org.LLD.MultiThreading.DuplicatesWords;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        String[] lines = new String[100];
        lines[0] = "The problem is that you are trying to declare a variable ";
        lines[1] = "without enclosing it inside curly braces";
        lines[2] = "You are not submitting any tasks to the thread pool";

        ExecutorService es = Executors.newFixedThreadPool(100);
        for (int i = 0; i < lines.length; i++) {
            Line line = new Line(lines[i], i);
            Future<Line> lineFuture = es.submit(line);
            Line nonDuplicatedLine = lineFuture.get();
            lines[nonDuplicatedLine.getLineNo()] = nonDuplicatedLine.getSentence();
        }

        es.shutdown();

        for(String str : lines){
            System.out.println(str);
        }
    }
}
