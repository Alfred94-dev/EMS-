package com.cogniax.project;


import java.util.Scanner;

public class Employee_input_Scanner implements Scanner_DATA {

static Department DT = null;
public static Department getDep() {
	return DT;
}
	
	
	//****************************(1)******Employee Input Data*****************************************************//
	public static void EmployeeInputdata() {
		Scanner sc = Scanner_DATA.Sc;
		int CHOOSE_TO_DO;
		CHOOSE_TO_DO = sc.nextInt();
	

		/// ----->>> set for the employee an ID
		System.out.println("Set for this Employee an ID ?");
		int Employee_ID = sc.nextInt();

		// -->> Enter Employee Name
		System.out.println("What's Your Name ?");
		String Name = sc.next().trim();

		// --> Enter his Phone Number

		System.out.println("What's Your Phone Number ?");
		Long Phone = sc.nextLong();

		/// -->> Enter His Age
		System.out.println("How old are you ?");
		int Age = sc.nextInt();

		// -->> Enter His Salary &&& check if the salary has a negative value

		System.out.println("Enter employee Annual Salary :");
		Long AnnualSalary = sc.nextLong();
		
		System.out.println("Enter his/her Department ID : ");
		String CHOOSE_DEP_id =sc.next();
	
		
		Employee_Info EMS_DATA = new Employee_Info(Employee_ID, Name, Phone, Age, AnnualSalary, CHOOSE_DEP_id );

		employee_data_inarray.getALL_employee().add(EMS_DATA);

		System.out.println(EMS_DATA);
		if(Check_Ava_DEP_ID(CHOOSE_DEP_id) == true ) {
			
		
		Linking_employeeinfo_to_departmentID(CHOOSE_DEP_id);
		}
		else {
			System.out.println("Department ID not Found ");
		}
		
		
		

	}

	
	//******************************(2)*************UPDATE_Employee Input Data****************************************************************//
////--->>> it update data from employee you have to know his ID and 
	/* then you setALL_employee to modify any data */
	public void UPDATE_EmployeeInputdata() {

		System.out.println("Enter your Employee ID : ");

		Scanner ID_INPUT = Scanner_DATA.Sc;
		int id = ID_INPUT.nextInt();

		for (int i = 0; i < employee_data_inarray.getALL_employee().size(); i++) {
			if (Employee_Info.getEmployee_ID() == id) {

				// -->>
				System.out.println(employee_data_inarray.getALL_employee().get(i));
			}

			// -->> SAVING DATA in emp
			Employee_Info empdata = employee_data_inarray.getALL_employee().get(i);
			int choose;
			String cont;
			do {
			/// --->> to ask what you want you want to do
			System.out.println("What do you want to Change in your Employee_Information" + "1" + "To modify Name" + "2"
					+ "To modify phone number" + "3" + "To modify his Age " + "4" + "To modify his Annual Salary "+
					"5"+ "To update Department Id assigned to this employee"+"6"+"TO continue Press 'Y' ");

			Scanner WHAT_TO_SET = Scanner_DATA.Sc;
			 choose = WHAT_TO_SET.nextInt();
			
			switch (choose) {
			case 1:
				String Name_TO_UPDATE;
				System.out.println("Name");
				Name_TO_UPDATE = WHAT_TO_SET.nextLine();
				empdata.setName(Name_TO_UPDATE);
				break;
			case 2:

				Long Phone_TO_UPDATE;
				System.out.println("Phone Number");
				Phone_TO_UPDATE = WHAT_TO_SET.nextLong();
				empdata.setPhone(Phone_TO_UPDATE);
				break;
			case 3:
				int Age_TO_UPDATE;
				System.out.println("AGE");
				Age_TO_UPDATE = WHAT_TO_SET.nextInt();
				empdata.setAge(Age_TO_UPDATE);
				break;
			case 4:
				int AnnualSalary_TO_UPDATE;
				System.out.println("Annual Salary");
				AnnualSalary_TO_UPDATE = WHAT_TO_SET.nextInt();
				empdata.setAnnualSalary(AnnualSalary_TO_UPDATE);
				break;
			case 5:
				String Dep_TO_UDATE;
				System.out.println("Department ID  ASSigned to this Employee");
				Dep_TO_UDATE = WHAT_TO_SET.next();
				empdata.setworkDepartment(Dep_TO_UDATE);
				break;
			default:
				break;
				
			}
		   	Scanner What_to_do =Scanner_DATA.Sc;
		   	cont= What_to_do.next();
		   	
			}while(cont.equals("Y"));
		}

	}
	//********************************(3)*****REMOVE_Employee Input Data****************************************************************//

///--->>  Remove and employee by his ID before removing it will show you the employee data before 
///******    removing these data.
	public void REMOVE_EmployeeInputdata() {
		System.out.println("Enter your Employee ID : ");
		Scanner ID_INPUT = Scanner_DATA.Sc;
		int id = ID_INPUT.nextInt();

		for (int i = 0; i < employee_data_inarray.getALL_employee().size(); i++) {
			if (Employee_Info.getEmployee_ID() == id) {
				System.out.println(employee_data_inarray.getALL_employee().get(i));
				System.out.println(employee_data_inarray.getALL_employee().remove(i));
			}

		}

	}
	
	
	//**********************************(4)************DISPLAY_Employee Input Data******************************************************//

///--->> Display the arraylist of all employees

	public void DISPLAY_EmployeeInputdata() {

		/// --->>> I used to Array so when it display my Array it will show me from
		/// first to last element just like Qeue
		employee_data_inarray.getALL_employee();

	}

	///***********************************(5)****************ADD_Departm_Type*********************************************//
	//// ---->>> To ADD more Departments to my calss Departm_Type
	public static void ADD_Departm_Type() {

		System.out.println("ADD your new Department : ");
		Scanner DATA_OF_DEP = Scanner_DATA.Sc;
		/// ----->>> set for this Department an ID
		System.out.println("Set for this Department an ID ?");
		String  department_ID = DATA_OF_DEP.next().trim();
		System.out.println("Enter the Name of this Department ?");
		String departmentname = DATA_OF_DEP.next().trim();
		System.out.println("what is the location of this Department ?");
		String location = DATA_OF_DEP.next().trim();

		DT = new Department(department_ID, departmentname, location);
		
		///--->>> TO ADD in Department_ID as key , and each value of the department id p5
		employee_data_inarray.getADD_DEPARTMENTS().put(department_ID, DT);
		
	}

	//***************************(6)************Remove_Departm_Type*****************************************************//

	public void Remove_Departm_Type() {

		System.out.println("Which Department you want to delete just Enter its number (index): ");
		Scanner ID_OF_DEP = Scanner_DATA.Sc;
		String id = ID_OF_DEP.next();

		for (int i = 0; i < employee_data_inarray.getADD_DEPARTMENTS().size(); i++) {
			if (Department.getDepartment_ID().equals(id)) {
				System.out.println(employee_data_inarray.getADD_DEPARTMENTS().get(i));
				employee_data_inarray.getADD_DEPARTMENTS().remove(i);
			}

		}

	}
	
	//========================================LINKING=======================================
	
	public static boolean Check_Ava_DEP_ID(String ID_DEP) {
		
		for(int i=0 ; i<employee_data_inarray.getADD_DEPARTMENTS().size(); i++) {
			 if(ID_DEP.equals(Department.getDepartment_ID()))
			 {
				 return true;
			 }
		}
		
		return false;
		
	}

	public static void Linking_employeeinfo_to_departmentID(String department) {
		
	Department DT2 = getDep();
    
	
	if(DT2!=null) {
 
    	employee_data_inarray.getADD_DEPARTMENTS().put(department, DT2);
    	System.out.println(DT2);
    }
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
