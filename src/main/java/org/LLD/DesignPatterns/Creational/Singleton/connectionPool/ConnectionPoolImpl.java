package org.LLD.DesignPatterns.Creational.Singleton.connectionPool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolImpl implements ConnectionPool{

    private int maxConnections = 0;
    private static ConnectionPoolImpl instance;

    private List<DatabaseConnection> databaseConnections = new ArrayList<>();


    private ConnectionPoolImpl(int maxConnections){
        this.maxConnections = maxConnections;
        initializePool();
    }

    @Override
    public void initializePool() {
        for (int i=0;i<maxConnections;i++){
            databaseConnections.add(new DatabaseConnection(i,true));
        }
    }

    public  static ConnectionPoolImpl getInstance(int maxConnections){
        if (instance == null){
            synchronized (ConnectionPoolImpl.class){
                if (instance == null){
                    instance = new ConnectionPoolImpl(maxConnections);
                }
            }
        }
        return instance;
    }

    public static void resetInstance(){
        instance = null;

    }

    @Override
    public DatabaseConnection getConnection() {
        for (DatabaseConnection connection : databaseConnections){
            if (connection.isAvailable){
                connection.isAvailable = false;
                return connection;
            }
        }
        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        connection.isAvailable = true;
    }

    @Override
    public int getAvailableConnectionsCount() {
        int count  = 0;
        for (DatabaseConnection connection : databaseConnections){
            if (connection.isAvailable){
                count++;
            }
        }
        return count;
    }

    @Override
    public int getTotalConnectionsCount() {
        return databaseConnections.size();
    }
}
