package com.qa.utils;

public class DBConfig {
		
		public static String USER = "root";  // this sets the username, password and location of the mySQL
		public static String PASSWORD = "root";
		public static String URL = "jdbc:mysql://localhost:3306/dfe?serverTimezone=BST"; // this timezone part at the end is needed because gmt has 2 timezones due to summertime
		
}
