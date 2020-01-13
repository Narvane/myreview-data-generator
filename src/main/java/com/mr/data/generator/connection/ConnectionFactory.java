package com.mr.data.generator.connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

public class ConnectionFactory {
    public static String server;
    public static String database;
    public static String port;
    public static String username;
    public static String password;
    public static String db;
    public static String driver;
	public static java.sql.Connection doConnection() throws SQLException {
            System.out.println(db+server+":"+port+"/"+database+"?serverTimezone=UTC");
            System.out.println("jdbc:mysql://localhost:3306/myreview?serverTimezone=UTC");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(db+server+":"+port+"/"+database+"?serverTimezone=UTC", username, password);
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getException());
		}
	}
}
