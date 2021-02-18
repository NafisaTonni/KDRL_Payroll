package com.testing;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.dbmanager.ConnectionMain;
import com.global.Global;

public class TestClass {
	private String class_name = "com.testing.TestClass";
	
//test services//
	public String get_metrics_list(JSONObject js_input) {
		String method_name = "get_metrics_list";
		String type = "";

		Connection conn = null;
		Statement stmt = null;

		JSONArray jsArr = new JSONArray();
		JSONObject js = null;
		JSONObject js_final = new JSONObject();

		try {
			type = js_input.getString("type");
			js_final.put("type", type);

			String SQL = "select * from sys.metrics order by Variable_name";
			conn = new ConnectionMain().get_mysql_connection();
			stmt = conn.createStatement();

			ResultSet rset = stmt.executeQuery(SQL);
			while (rset.next()) {
				String Variable_name = rset.getString("Variable_name");
				String Variable_value = rset.getString("Variable_value");
				String Type = rset.getString("Type");
				String Enabled = rset.getString("Enabled");

				js = new JSONObject();
				js.put("Variable_name", Variable_name);
				js.put("Variable_value", Variable_value);
				js.put("Type", Type);
				js.put("Enabled", Enabled);

				jsArr.put(js);
			}
			rset.close();

			js = new JSONObject();
			js.put("msg", "Invalid username/password.");
			js_final.put("tag", "success");
			js_final.put("data", jsArr);

		} catch (SQLException se) {
			Global.LogServiceErrors(class_name, method_name, se.getMessage());

			try {
				js = new JSONObject();
				js.put("msg", "Error getting metrics list");
				js_final.put("tag", "error");
				js_final.put("data", js);
			} catch (JSONException e1) {
				Global.LogServiceErrors(class_name, method_name, e1.getMessage());
			}
		} catch (JSONException je) {
			Global.LogServiceErrors(class_name, method_name, je.getMessage());

			try {
				js = new JSONObject();
				js.put("msg", "Error getting metrics list");
				js_final.put("tag", "error");
				js_final.put("data", js);
			} catch (JSONException e2) {
				Global.LogServiceErrors(class_name, method_name, e2.getMessage());
			}
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException se) {
				Global.LogServiceErrors(class_name, method_name, se.getMessage());
			}
		}
		return js_final.toString();
	}
//new demo
	public String insert_student(JSONObject jso) {
		int id = 0;
		String last_name = "", first_name = "", email = "";

		try {
			id = jso.getInt("id");
			last_name = jso.getString("last_name");
			first_name = jso.getString("first_name");
			email = jso.getString("email");

			String SQL = "insert into employes (id, last_name,first_name, email)";
			SQL = SQL + " values(" + id + ",'" + last_name + "','" + first_name + "','" + email + "')";

			Connection conn = new ConnectionMain().get_mysql_connection();
			Statement st = conn.createStatement();
			st.executeUpdate(SQL);

		} catch (JSONException ex) {

		} catch (SQLException ex1) {

		}

		return "";
	}
//end demo
	
//start University
	
	public String insert_admission(JSONObject jso)
	{
		int Id = 0;
		String StudentName= "", Subject="", FatherName= "", MotherName= "",StPhoneNumber="",
				DateOfBirth="",ParentNumber="",Email="", PresentAddress ="", PermanentAddress="";
		
		try{
			Id = jso.getInt("Id");
			StudentName = jso.getString("StudentName");
			Subject = jso.getString("Subject");
			FatherName = jso.getString("FatherName");
			MotherName = jso.getString("MotherName");
			StPhoneNumber = jso.getString("StPhoneNumber");
			DateOfBirth = jso.getString("DateOfBirth");
			ParentNumber = jso.getString("ParentNumber");
			Email = jso.getString("Email");
			PresentAddress = jso.getString("PresentAddress");
			PermanentAddress = jso.getString("PermanentAddress");
			
			String SQL = "insert into admissiontable(StudentName, Subject, FatherName, MotherName, StPhoneNumber, DateOfBirth, ParentNumber, Email, PresentAddress, PermanentAddress)";
			SQL = SQL + " values( " + StudentName + " ',' " + Subject + " ',' " + FatherName + " ',' " + MotherName + " ',' " + StPhoneNumber + " ',' " + DateOfBirth + " ',' " + ParentNumber + " ',' " + Email + " ',' " + PresentAddress + " ',' " + PermanentAddress + " )";
//SQL = SQL + " values(" + id + ",'" + last_name + "','" + first_name + "','" + email + "')";(coma te prob)
			

			Connection conn = new ConnectionMain().get_mysql_connection();
			Statement st = conn.createStatement();
			st.executeUpdate(SQL);

		}
		catch(JSONException ex){
			
		}
		
		catch (SQLException ex1) {

		}
	return "";	
	}
}
