package com.cogniax.project;

import java.util.Scanner;

public class Choose_Your_Input extends Employee_input_Scanner {

	private int INPUT_CHOICE;
	Scanner SC_INP = Scanner_DATA.Sc;

	public void Choose_Your_Input() {

		do {

			System.out.println("Choose the function that you wanna use :\n" + " (1) - " + "Add Data\n" + " (2) - "
					+ "update Employee data \n" + " (3) - " + "Remove EmployeeData \n" + " (4) - "
					+ "Dispaly employees Data \n" + "(5) - " + " TO ADD Departments \n " + " (6) - "
					+ "To Return to Main Menu Enter  number '5' to return to your Main Menu \n");

			INPUT_CHOICE = SC_INP.nextInt();
			switch (INPUT_CHOICE) {

			case 1:
				System.out.println("=============ADD Employees DATA=============");
				EmployeeInputdata();
				
				break;

			case 2:

				System.out.println("=========Update  Employee Information========= ");
				UPDATE_EmployeeInputdata();
				break;

			case 3:

				System.out.println("=========Remove Employee Information========= ");
				REMOVE_EmployeeInputdata();
				break;

			case 4:

				System.out.println("=========Display  Employee Information========= ");
				DISPLAY_EmployeeInputdata();
				break;

			case 5:
				/// --->> TO ADD in more Department
				System.out.println("=========ADD Department Information============= ");
				ADD_Departm_Type();
				break;

			case 6:

				System.out.println("===============HAVE A NICE DAY======================");
				break;

			default:
				break;
			}
		} while (INPUT_CHOICE != 6);

	}

}
