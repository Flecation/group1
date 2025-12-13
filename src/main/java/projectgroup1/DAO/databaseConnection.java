package projectgroup1.DAO;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class databaseConnection {
    private static HikariDataSource dataSource;

    static{
        HikariConfig config =new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/salesystem");
        config.setUsername("root");
        config.setPassword("123456");

        config.setMaximumPoolSize(10);
        config.setMinimumIdle(2);

        dataSource = new HikariDataSource(config);
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

}
