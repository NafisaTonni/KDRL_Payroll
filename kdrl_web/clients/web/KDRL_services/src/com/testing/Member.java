package com.testing;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.dbmanager.ConnectionMain;
import com.staticvalue.StaticValue;

public class Member { 
	
//insert	
public String AddMemberInfo( String js_input) {
		
		System.out.println("msg: " + js_input.toString());
		JSONObject js = null;

		try {
			js = new JSONObject(js_input);
		} catch (JSONException e1) {
			e1.printStackTrace();
			System.out.println("PARSE ERROR" + e1.getMessage());
		}

		if (js == null) {
			return "Requested JSON is not valid";
		}

		JSONObject js_main= new JSONObject();
		String type = "KDRLBACKEND", output = "";
		StaticValue.init_db_server_parameters();
		Connection conn = null;
		Statement stmt = null;
	    int existing=0;
		String memberForm="", SQL="",name="",company_name="",designation="",official_email="",phone_number="";
		try{
			conn = new ConnectionMain().get_mysql_connection();
			stmt = conn.createStatement();
			name = js.getString("name");
			company_name = js.getString("company_name");
			designation = js.getString("designation");
			official_email = js.getString("official_email");
			phone_number = js.getString("phone_number");
			
			SQL = "select * from memberlist where official_email = '" + official_email +"'";
			//SQL = SQL + " where mac_address = '" + mac_address +"'";
			ResultSet rset = stmt.executeQuery(SQL);
			while (rset.next()) {
				existing = 1;
			}
			rset.close();
			if(existing==0){
				SQL="INSERT INTO memberlist (name,company_name,designation,official_email,phone_number) VALUES (";
				SQL=SQL+"'"+name+"','"+company_name+"','"+designation+"',";
				SQL=SQL+"'"+official_email+"','"+phone_number+"'";
				SQL=SQL+")";
				/*System.out.println(SQL);
				System.out.println("UPDATE");*/
				int d= stmt.executeUpdate(SQL);
				js_main.put("type", type);
				if(d==1){
				 js_main.put("msg", "Successfully added");
				 js_main.put("tag", "success");
				
				}else{
					js_main.put("msg", "Something went error, Please try again!");
					js_main.put("tag", "failed");
				}
				
			}else{
				js_main.put("msg", "Data already exists!");
				js_main.put("tag", "failed");
			}
			output=js_main.toString();
		}catch(JSONException | SQLException e){
			try {
				js_main.put("type", type);
				js_main.put("msg", e.getMessage());
				js_main.put("TAG", "error");
				output=js_main.toString();
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				output="Failed: "+e1.getMessage();
			}
			
			System.out.println("Failed: "+e.getMessage());
		}
		return output;
	}

	public String GetMemberInfo( String js_input) {
		
		System.out.println("msg: " + js_input.toString());
		JSONObject js = null;

		try {
			js = new JSONObject(js_input);
		} catch (JSONException e1) {
			e1.printStackTrace();
			System.out.println("PARSE ERROR" + e1.getMessage());
		}

		if (js == null) {
			return "Requested JSON is not valid";
		}

		JSONObject js_main= new JSONObject();
		JSONArray js_arr = new JSONArray();
		String type = "KDRLBACKEND", output = "";
		StaticValue.init_db_server_parameters();
		Connection conn = null;
		Statement stmt = null;
	    int existing=0;
		String memberForm="", SQL="";
		try{
			conn = new ConnectionMain().get_mysql_connection();
			stmt = conn.createStatement();
	
			SQL = "select id,name,company_name,designation,official_email,phone_number from memberlist";
			
			ResultSet rset = stmt.executeQuery(SQL);
			while (rset.next()) {
				int id = rset.getInt("id"); 
				String name = rset.getString("name");
				String company_name = rset.getString("company_name");
				String designation = rset.getString("designation");
				String official_email = rset.getString("official_email");
				String phone_number = rset.getString("phone_number");
				

				JSONObject js_output= new JSONObject();
				js_output.put("id",id);
				js_output.put("name",name);
				js_output.put("company_name",company_name);
				js_output.put("designation",designation);
				js_output.put("official_email",official_email);
				js_output.put("phone_number",phone_number);
				js_arr.put(js_output);
			}
			rset.close(); 
			js_main.put("type", type);
			js_main.put("member_data", js_arr);
			js_main.put("tag", "Success");
			output=js_main.toString();
		}catch(JSONException | SQLException e){
			try {
				js_main.put("type", type);
				js_main.put("msg", e.getMessage());
				js_main.put("tag", "error");
				output=js_main.toString();
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				output="Failed: "+e1.getMessage();
			}
			
			System.out.println("Failed: "+e.getMessage());
		}
		return output;
	}
	

//update
public String GetMemberInfoUpdate( String js_input) {
	
	System.out.println("msg: " + js_input.toString());
	JSONObject js = null;

	try {
		js = new JSONObject(js_input);
	} catch (JSONException e1) {
		e1.printStackTrace();
		System.out.println("PARSE ERROR" + e1.getMessage());
	}

	if (js == null) {
		return "Requested JSON is not valid";
	}

	JSONObject js_main= new JSONObject();
	JSONArray js_arr = new JSONArray();
	String type = "KDRLBACKEND", output = "";
	StaticValue.init_db_server_parameters();
	Connection conn = null;
	Statement stmt = null;
    int existing=0,id=0;
	String memberForm="", SQL="",name="",company_name="",designation="",official_email="",phone_number="";
	try{
		conn = new ConnectionMain().get_mysql_connection();
		stmt = conn.createStatement();
		id = js.getInt("id");
		name = js.getString("name");
		company_name = js.getString("company_name");
		designation = js.getString("designation");
		official_email = js.getString("official_email");
		phone_number = js.getString("phone_number");
		
		SQL = "select * from memberlist where id="+id+" and official_email = '" + official_email +"'";
		ResultSet rset = stmt.executeQuery(SQL);
		while (rset.next()) {
			existing = 1;
		}
		rset.close(); 
		if(existing==1){
			SQL="update memberlist set name= '"+name+"', company_name ='"+company_name+"'";
			SQL=SQL+" , designation = '"+designation+"', phone_number = '"+phone_number+"' ";
			SQL=SQL+" where id="+id+" and official_email = '"+official_email+"'";

			//System.out.println(SQL);
			int d= stmt.executeUpdate(SQL);
			js_main.put("type", type);
			if(d==1){
				js_main.put("msg", "Successfully updated");
				 js_main.put("tag", "Success");
			}else{
				js_main.put("msg", "Something went error, Please try again!");
				js_main.put("tag", "failed");
			}
			
			}else{
				js_main.put("msg", "Data not found");
				js_main.put("tag", "Failed");
			}
		
		output=js_main.toString();
		
	}catch(JSONException | SQLException e){
		try {
			js_main.put("type", type);
			js_main.put("msg", e.getMessage());
			js_main.put("tag", "error");
			output=js_main.toString();
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			output="Failed: "+e1.getMessage();
		}
		
		System.out.println("Failed: "+e.getMessage());
	}
	return output;
}
//delete
public String GetMemberInfoDelete( String js_input) {
	
	System.out.println("msg: " + js_input.toString());
	JSONObject js = null;

	try {
		js = new JSONObject(js_input);
	} catch (JSONException e1) {
		e1.printStackTrace();
		System.out.println("PARSE ERROR" + e1.getMessage());
	}

	if (js == null) {
		return "Requested JSON is not valid";
	}

	JSONObject js_main= new JSONObject();
	JSONArray js_arr = new JSONArray();
	String type = "KDRLBACKEND", output = "";
	StaticValue.init_db_server_parameters();
	Connection conn = null;
	Statement stmt = null;
	int existing=0,id=0;
	String memberForm="", SQL="",official_email="";
	//String admissionForm="", SQL="",student_name="",subject="",father_name="",mother_name="",student_phone_number="",date_of_birth="",guardian_phone_number="",student_email="",present_address="",permanent_address="";

	try{
		conn = new ConnectionMain().get_mysql_connection();
		stmt = conn.createStatement();
		id = js.getInt("id"); 
		official_email = js.getString("official_email");
		
		//SQL = "select id,student_name,subject,father_name,mother_name,student_phone_number,date_of_birth,guardian_phone_number,student_email,present_address,permanent_address from admissioninfo";
		//SQL="update admissioninfo set student_name= '+student_name+' where student_phone_number = 'student_phone_number'";
		
		SQL="select * from memberlist where id="+id+" and official_email = '"+official_email+"'";
		ResultSet rset = stmt.executeQuery(SQL);
		while (rset.next()) {
			existing = 1;
		}
		rset.close(); 
		if(existing==1){
			SQL="delete from memberlist where id="+id+" and official_email = '"+official_email+"'";
			
			System.out.println(SQL);
			int d= stmt.executeUpdate(SQL);
			js_main.put("type", type);
			if(d==1){
			 js_main.put("msg", "Successfully deleted");
			 js_main.put("tag", "Success");
			}else{
				js_main.put("msg", "Something went error, Please try again!");
				js_main.put("tag", "failed");
			}
			
		}else{ 
			js_main.put("msg", "Data not found");
			js_main.put("tag", "failed");
		}
		js_main.put("type", type);
		output=js_main.toString();
	}catch(JSONException | SQLException e){
		try {
			js_main.put("type", type);
			js_main.put("msg", e.getMessage());
			js_main.put("tag", "error");
			output=js_main.toString();
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			output="Failed: "+e1.getMessage();
		}
		
		System.out.println("Failed: "+e.getMessage());
	}
	return output;
}
}
