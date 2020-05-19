package com.cogniax.project;



class Department{
	
	
	
	
protected  static  String Department_ID;
protected  static  String Departmentname;
protected  static  String Location;


public Department(String department_ID, String departmentname, String location) {
	super();
	Department.Department_ID = department_ID;
	Department.Departmentname = departmentname;
	Department.Location = location;
}


public static String getDepartment_ID() {
	return Department_ID;
}


public void setDepartment_ID(String  department_ID) {
	Department_ID = department_ID;
}


public  static String getDepartmentname() {
	return Departmentname;
}


public static void setDepartmentname(String departmentname) {
	Departmentname = departmentname;
}


public String getLocation() {
	return Location;
}


public void setLocation(String location) {
	Location = location;
}


@Override
public String toString() {
	return "Department [Department_ID=" + Department_ID + ", Departmentname=" + Departmentname + ", Location="
			+ Location + "]";
}



	
	
	
}