package com.greatlearning.service;

import com.greatlearning.model.SuperDepartment;

public class HrDepartment extends SuperDepartment {

	
	public String departmentName() {
		return "Welcome to HR Department";
	}
	
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team Lunch";
	}
}



 