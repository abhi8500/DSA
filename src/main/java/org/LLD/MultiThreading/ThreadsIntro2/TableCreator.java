package org.LLD.MultiThreading.ThreadsIntro2;

public class TableCreator implements  Runnable{

    int tableNumber ;

    public TableCreator(int tableNumber){
        this.tableNumber = tableNumber;
    }

    @Override
    public void run(){

        for (int i=1;i<=10;i++){
            System.out.println(this.tableNumber + " times " + i + " is " + tableNumber * i);
        }
    }
}
