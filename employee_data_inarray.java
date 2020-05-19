package com.cogniax.project;

import java.util.ArrayList;
import java.util.HashMap;



public class employee_data_inarray {

	private static ArrayList<Employee_Info> ALL_employee = new ArrayList<Employee_Info>(); /// Allocating and setting my
																							/// Array

	//private static ArrayList<Department> ADD_DEPARTMENTS = new ArrayList<Department>();

	private static HashMap<String , Department> ADD_DEPARTMENTS = new HashMap<String , Department>();
	


	public employee_data_inarray(ArrayList<Employee_Info> employee,HashMap<String , Department> ADD_DEPARTMENTS ) {
		super();
		employee_data_inarray.ALL_employee = employee;
		employee_data_inarray.ADD_DEPARTMENTS = ADD_DEPARTMENTS;
	}

	public static ArrayList<Employee_Info> getALL_employee() {

		return ALL_employee;
	}

	public static void setALL_employee(ArrayList<Employee_Info> employee) {
		ALL_employee = employee;
	}

	public static HashMap<String, Department> getADD_DEPARTMENTS() {
		return ADD_DEPARTMENTS;
	}

	public static void setADD_DEPARTMENTS(HashMap<String, Department> aDD_DEPARTMENTS) {
		ADD_DEPARTMENTS = aDD_DEPARTMENTS;
	}

	
}
