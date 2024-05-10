package SingletonPattern.DBConnection;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        ConnectionPool connectionPool=ConnectionPoolImpl.getInstance(5);
        connectionPool.initializePool();
        List<DatabaseConnection> db=new ArrayList<>();
        for(int i=0;i<4;i++)
            db.add(connectionPool.getConnection());
        System.out.println("Connections Available "+connectionPool.getAvailableConnectionsCount());
        connectionPool.getConnection();
        System.out.println("Connections Available 2 "+connectionPool.getAvailableConnectionsCount());
        connectionPool.getConnection();
        connectionPool.releaseConnection(db.get(db.size()-1));
        connectionPool.releaseConnection(db.get(db.size()-1));
        System.out.println("Connections Available 2 "+connectionPool.getAvailableConnectionsCount());
    }
}
