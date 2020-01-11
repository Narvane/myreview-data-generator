package com.mr.data.generator.connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class ConnectionFactory {
    public static String server;
    public static String database;
    public static String port;
    public static String username;
    public static String password;
	public static java.sql.Connection doConnection(Map<String, String> databaseSelector) throws SQLException {
		try {
			Class.forName(databaseSelector.get("driver"));
			return DriverManager.getConnection(databaseSelector.get("db")+"ec2-54-221-212-126.compute-1.amazonaws.com:5432/dpgfi0t4oqaoj", "ofaqxvkwycbfjq", "2459cad22b0bf93bf313055cc36aa0c1985d94d9ffac85eec14874bb053a8559");
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getException());
		}
	}
}
