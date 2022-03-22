package com.example.demo.utils;
import java.sql.*;

import com.example.demo.enums.DatabaseName;
public class ConnectionFactory {
	
	public static Connection getConnection(DatabaseName key) {
		
		switch(key) {
		case ORACLE:
			return DbConnection.getOracleConnection();
		case POSTGRES:
			return DbConnection.getPostgresConnection();
	
		
		
		}
		return null;
	}
	

}
