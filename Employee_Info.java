package com.cogniax.project;





public class  Employee_Info {
	
	
	
	protected static int Employee_ID;
	protected static String Name;
	protected static long Phone;
	protected static int Age ;
	protected static long AnnualSalary;
	protected static String WorkDepartment;
    



	public  Employee_Info(int Employee_ID,String Name, long Phone, int Age, long AnnualSalary,
			String  WorkDepartment) {
		super();
		Employee_Info.Employee_ID =Employee_ID; 
		Employee_Info.Name = Name;                         
		Employee_Info.Phone = Phone;
		Employee_Info.Age = Age;
		Employee_Info.AnnualSalary = AnnualSalary;
		Employee_Info.WorkDepartment = WorkDepartment;
	}	
	 
	public static int getEmployee_ID() {
		return Employee_ID;
	}

	public static void setEmployee_ID(int employee_ID) {
		Employee_ID = employee_ID;
	}



	public String getName() {
		
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
		
	
	
	}
	
	public long getPhone() {
		return Phone;
	}
	
	
	
	public void setPhone(long phone) {
		Phone = phone;
	}
	
	
	
	
	public int getAge() {
		return Age;
	}
	
	
	
	public void setAge(int age) {
		Age = age;
	}
	
	
	public long getAnnualSalary() {
		return AnnualSalary;
	}
	
	
	
	public void setAnnualSalary(long annualSalary) {
		AnnualSalary = annualSalary;
	}
	
	
	public String  getWorkDepartment() {
		return WorkDepartment;
	}
	
	
	
	
	public String  setworkDepartment(String  WorkDepartment) {
		return WorkDepartment;
	}

	
	 public String toString() {
		return "Employee_Info [Name=" + Name + ", Phone=" + Phone + ", Age=" + Age + ", AnnualSalary=" + AnnualSalary
				+ ", WorkDepartment=" + WorkDepartment + "]";
	}
	

	
	
	
	
}
