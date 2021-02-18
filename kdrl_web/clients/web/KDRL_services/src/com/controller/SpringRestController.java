package com.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.global.Global;
import com.staticvalue.StaticValue;
import com.testing.Member;
import com.testing.Salary;
import com.testing.TestClass;

@RestController
public class SpringRestController {
	private String class_name = "com.controller.SpringRestController";

	@RequestMapping(value = "/restservice_post", method = RequestMethod.POST)
	public String RequestDispatcher(@RequestBody String js_input) {
		String method_name = "RequestDispatcher";
		System.out.println("msg: " + js_input.toString());

		StaticValue.init_db_server_parameters();

		JSONObject js = null;

		try {
			js = new JSONObject(js_input);
		} catch (JSONException e1) {
			e1.printStackTrace();
		}

		if (js == null) {
			return "Requested JSON is not valid";
		}

		String type = "", output = "";

		try {
			type = js.getString("type");

			if (type.equalsIgnoreCase("testing")) {
				output = new TestClass().get_metrics_list(js);
			} 
			/////////////////////////////////////////for demo///////////////////////////////////////////////////
			else if (type.equalsIgnoreCase("insert_employee")) {
				output = new TestClass().insert_student(js);
			}
			//end//
			
			///////////////////////////////////////////for university/////////////////////////////////////////
			else if (type.equalsIgnoreCase("insert_admissiontable")) {
				output = new TestClass().insert_admission(js);
			}
///////////////////////////////////////////KDRL Member/////////////////////////////////////////
			
			//get
			else if (type.equalsIgnoreCase("get_member_info")) {
				output = new Member().GetMemberInfo(js_input);
			}
			//insert
			else if (type.equalsIgnoreCase("add_member_info")) {
				output = new Member().AddMemberInfo(js_input);
			}
			//update
			else if (type.equalsIgnoreCase("update_member_info")) {
				output = new Member().GetMemberInfoUpdate(js_input);
			}
			//delete
			else if (type.equalsIgnoreCase("delete_member_info")) {
				output = new Member().GetMemberInfoDelete(js_input);
			}
			///end////
			
///////////////////////////////////////////KDRL Member salary/////////////////////////////////////////
			//get
			else if (type.equalsIgnoreCase("get_salary_info")) {
				output = new Salary().GetSalaryInfo(js_input);
			}
			//insert
			else if (type.equalsIgnoreCase("add_salary_info")) {
				output = new Salary().AddSalaryInfo(js_input);
			}
			//update
			else if (type.equalsIgnoreCase("update_salary_info")) {
				output = new Salary().GetSalaryInfoUpdate(js_input);
			}
			//delete
			else if (type.equalsIgnoreCase("delete_salary_info")) {
				output = new Salary().GetSalaryInfoDelete(js_input);
			}
			///end////
		
		} catch (Exception e) {
			Global.LogServiceErrors(class_name, method_name, e.getMessage());
		}

		return output.replaceAll(":", "@#");
	}
}
