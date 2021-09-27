package com.qa.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; // the java.sql one not the others

import com.qa.utils.DBConfig;

public class DBConnect {
	
	private Connection connect;
	private Statement statement;
	
	public DBConnect() throws SQLException {
		connect = DriverManager.getConnection(DBConfig.URL, DBConfig.USER, DBConfig.PASSWORD);
		this.statement = connect.createStatement(); // this creates a statement object
		}
	public void createProduct(String productName, int productPrice) throws SQLException {
		String sqlStatement = String.format("INSERT INTO products(`productName`, `productPrice`) VALUES ('%s', '%d')", productName, productPrice ); // need to use string.format because we are putting in inputs
		statement.executeUpdate(sqlStatement);
	}
	public void readAll() throws SQLException {
		String sqlStatement = "SELECT * FROM products"; // can just use a simple string because not passing in inputs to database
		// This will return a RresultSet
		ResultSet set = statement.executeQuery(sqlStatement);
		//System.out.println(set); // prints out memory location
		while(set.next()) { // resultset has a cursor that it uses to move through the results, set.next() returns a boolean whether there is an entry or not. Thr cursor starts before the first entry so you will usually have at least one. 
		System.out.println("ID: " + set.getInt("product_ID") + ". Product Name: " + set.getString("productName") + ". Product price:  " + set.getInt("productPrice")); // prints out the product and the price
		}	
	}
	public void updateByID(String productName, int productPrice, int product_ID) throws SQLException {
		String sqlStatement = String.format("UPDATE products SET productName = ('%s'), productPrice = ('%d') WHERE product_ID = ('%d');", productName, productPrice, product_ID);
		statement.executeUpdate(sqlStatement);
		String sqlStatement2 = "SELECT * FROM products"; // can either re write this to select it all and print it
//		ResultSet set = statement.executeQuery(sqlStatement2);
//		while(set.next()) {
//		System.out.println("ID: " + set.getInt("product_ID") + ". Product Name: " + set.getString("productName") + ". Product price:  " + set.getInt("productPrice"));
//	}
	}

	
	public void updateByPrice(String productName, int productPrice) throws SQLException {
		String sqlStatement = String.format("UPDATE products SET productName = ('%s') WHERE productPrice = ('%d');", productName, productPrice);
		statement.executeUpdate(sqlStatement);
		//readAll(); // or can reference the readAll method again - this is neater so better. 
	}
	
	public void updateByName(String newproductName, String productName) throws SQLException {
		String sqlStatement = String.format("UPDATE products SET productName = ('%s') WHERE productName = ('%s');", newproductName, productName);
		statement.executeUpdate(sqlStatement);
		//readAll(); // or can reference the readAll method again - this is neater so better. 
	}
	
	public void add(String productName, int productPrice) throws SQLException {
		String sqlStatement = String.format("INSERT INTO products (productName, productPrice) VALUES ('%s', '%d');", productName, productPrice);
		statement.executeUpdate(sqlStatement);
		//readAll();
	}

	
	public void remove(int product_ID) throws SQLException {
		String sqlStatement = String.format("DELETE FROM products WHERE product_ID = ('%d');", product_ID);
		statement.executeUpdate(sqlStatement);
		//readAll();
	}
	
	public void removAll() throws SQLException {
		String sqlStatement = String.format("DELETE FROM products;");
		statement.executeUpdate(sqlStatement);
		//readAll();
	}
	
	public void addColumn(String columnName, String type) throws SQLException {
		String sqlStatement = String.format("ALTER TABLE products ADD ('%s, '%s');");
		statement.executeUpdate(sqlStatement);
		//readAll();
	}
	
	public void add3Column(String productName, int productPrice, String colour) throws SQLException {
		String sqlStatement = String.format("INSERT INTO products (productName, productPrice, colour) VALUES ('%s', '%d', '%s');", productName, productPrice, colour);
		statement.executeUpdate(sqlStatement);
		//readAll2();
	
	}
	
	public void readAll2() throws SQLException {
		String sqlStatement = "SELECT * FROM products"; 
		ResultSet set = statement.executeQuery(sqlStatement);
		while(set.next()) { 
		System.out.println("ID: " + set.getInt("product_ID") + ". Product Name: " + set.getString("productName") + ". Product price:  " + set.getInt("productPrice") + "Colour: " + set.getString("colour")); // prints out the product and the price
		}
	}
		
	public void topFiveByPrice() throws SQLException {
		String sqlStatement = "SELECT * FROM products ORDER BY productPrice DESC LIMIT 5";
		statement.executeUpdate(sqlStatement);
		ResultSet set = statement.executeQuery(sqlStatement);
		while(set.next()) {
		System.out.println("ID: " + set.getInt("product_ID") + ". Product Name: " + set.getString("productName") + ". Product price:  " + set.getInt("productPrice"));
	}
	}
}



