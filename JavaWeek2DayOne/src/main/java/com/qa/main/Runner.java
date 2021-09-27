package com.qa.main;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Runner {

	public static void main(String[] args) throws SQLException {
		DBConnect db = new DBConnect();
		//db.createProduct("table", 10); // wont run unless you already have a table made
		//System.out.println("Created"); // so you know it has worked
		db.readAll(); // will just print memory location
		System.out.println("---------------------------------------");
		
//		db.updateByID("test",50, 1); // this isnt working :(
//		//newDB.updateByPrice("test2", 10);
//		db.updateByName("Cat", "test2");
//		db.add("Chair", 30);
//		db.add("Mirror", 45);
//		db.add("Sofa", 699);
//		db.add("Bed frame", 150);
//		db.add("pillows", 15);
		//newDB.remove(1); // removes depending on product_ID
		//newDB.removAll(); // removes all entries
		//db.addColumn("colour", "VARCHAR (200)");
		//db.add3Column("Mirror", 45, "silver");
		// db.topFiveByPrice(); // this one isnt working at the moment
		
	}
	
	
	
	}

