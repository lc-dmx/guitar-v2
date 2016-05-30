package db;

import java.sql.*;
import java.io.*;

public class JDBCSqlite implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Connection connection = null;
	
	public JDBCSqlite(){
		try {
			Class.forName("org.sqlite.JDBC");
			connection= DriverManager.getConnection("jdbc:sqlite:d:/Sqlite/guitar.db");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}