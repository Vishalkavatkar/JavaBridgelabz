package com.Day34;

import java.sql.Connection;

/**
 * Class to check if the connection is established
 * If our connection is not null then the connection is established.
 */
public class TestConnection {

	public static void main(String[] args) {
		Configuration config = Configuration.getInstance();
		
		Connection connection = config.getConnection();
		
		if(connection != null) 
			System.out.println(" Connection established");
		else
			System.out.println(" Connection failed");
	}
}