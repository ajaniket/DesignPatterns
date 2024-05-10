package SingletonPattern.DBConnection;
import java.sql.*; // for standard JDBC programs
import java.math.*; // for BigDecimal and BigInteger support


public interface ConnectionPool {

    void initializePool();

    DatabaseConnection getConnection();

    void releaseConnection(DatabaseConnection connection);

    int getAvailableConnectionsCount();

    int getTotalConnectionsCount();

}
