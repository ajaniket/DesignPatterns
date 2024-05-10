package SingletonPattern.DBConnection;

import java.util.EmptyStackException;
import java.util.Stack;

public class ConnectionPoolImpl implements ConnectionPool {

    private static ConnectionPool instance;
    Stack<DatabaseConnection> pool;
    private final int maxConnections;
    private ConnectionPoolImpl(int maxConnections){
        this.maxConnections=maxConnections;
        instance=null;
        this.pool = new Stack<>();
        initializePool();
    }

    public static ConnectionPool getInstance(int maxConnections){
        if(instance==null)
        {
            synchronized (ConnectionPoolImpl.class){
                if(instance==null)
                    instance=new ConnectionPoolImpl(maxConnections);
            }
        }
        return instance;
    }
    public static void resetInstance(){
        instance=null;
    }
    @Override
    public void initializePool() {
        for (int i = 0; i < this.maxConnections; i++)
            this.pool.add(new DatabaseConnection());
    }

    @Override
    public DatabaseConnection getConnection() {
        try {
            return this.pool.pop();
        }
        catch (EmptyStackException e){
            System.out.println("Connection Pool is empty "+e.getMessage());
        }
        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        this.pool.add(connection);
    }

    @Override
    public int getAvailableConnectionsCount() {
        if(pool!=null)
            return this.pool.size();
        return 0;
    }

    @Override
    public int getTotalConnectionsCount() {
        return this.maxConnections;
    }
}
