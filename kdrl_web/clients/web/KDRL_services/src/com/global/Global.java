package com.global;

import java.util.Date;

public class Global {		
	public static String ERR_MSG_DB = "Something went wrong. Please contact with vendor";
	
	public static void LogServiceErrors(String class_name, String method_name, String error_desc) {
		String err_detail = " ";
		err_detail = err_detail + "\n" + "Error Details";
		err_detail = err_detail + "\n" + "-------------";
		err_detail = err_detail + "\n" + "Class name  : " + class_name;
		err_detail = err_detail + "\n" + "Method name : " + method_name;
		err_detail = err_detail + "\n" + "Description : " + error_desc;
		err_detail = err_detail + "\n" + "Time        : " + new Date();
		err_detail = err_detail + "\n" + "----------------------------------------------------------------------";

		System.out.println(err_detail);
	}	
}
