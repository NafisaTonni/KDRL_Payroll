package com.staticvalue;

public class StaticValue {
	public static String DB_Name = "";
	public static String DB_Port = "";
	public static String DB_Server = "";
	public static String DB_User = "";
	public static String DB_Password = "";

	public static void init_db_server_parameters() {
	//db name change	
		DB_Name = "kdrl_services";
		//DB_Name = "demo";
		DB_Port = "3306";
		DB_Server = "localhost";
		DB_User = "root";
		DB_Password = "root123";
	}

	public static void main(String[] args) {
		init_db_server_parameters();
	}
}
