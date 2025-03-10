package org.LLD.DesignPatterns.Singleton.connectionPool;

public class DatabaseConnection {

    int connectionNo;
    boolean isAvailable;

    public DatabaseConnection(int connectionNo,boolean isAvailable){
        this.connectionNo = connectionNo;
        this.isAvailable = isAvailable;
    }
}
