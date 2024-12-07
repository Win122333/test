package org.example.db;

import java.sql.*;

public class DataBaseHandler extends db.Configs {
    Connection connection;
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String conStr = "jdbc:postgresql://" + dbHost + ":"
                + dbPort + "/" + dbName;
        connection = DriverManager.getConnection(conStr, dbUser, dbPass);
        return connection;
    }
    public void addString (String name, String surname, int age, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeQuery("INSERT INTO " + db.Const.USER_TABLE + " (surname, name, age) VALUES ('" + name + "', '" + surname + "', '" + age + "');");
    }
}
