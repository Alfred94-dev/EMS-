package com.cogniax.project;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.cogniax.project.*;




public class Write_Employee_data {
	
 

	///->>invoke default method in interface to override it
	 
	public void Create_Write_InFile()throws FileNotFoundException, IOException {
		ArrayList<Employee_Info> employee = null;
		
		try {
    		//--->> setting up a File in this location  and setting up its reference
    		//-->> Creates a new buffered output stream to write data to the specified underlying output stream.
    		BufferedWriter EMS_data = new BufferedWriter(new FileWriter
    				("D:\\Eclipse-workspace\\Employee Managment\\src\\com\\cogniax\\project\\"));
    		
    		
    		// I am trying to call employeeinfo in Employee_input_Scanner and iterate thats why i used for each loop
    		for(Employee_Info data1 : employee ) {
    			
    			///-->> Casting data which is data type is Object to Char Because append can take either []Char or int 
    			EMS_data.append((CharSequence) data1);
    			//--->>  flush() you are assuring that any buffered data will be flushed (written) in your file
    			EMS_data.flush();
    		}
    		
    		
//    			//--->> setting up a File in this location  and setting up its reference
//    		 FileOutputStream fout=new FileOutputStream("D:\\Eclipse-workspace\\Employee Managment\\src\\com\\cogniax\\project"); 
//    		
//    		 //-->> Creates a new buffered output stream to write data to the specified underlying output stream.
//    		 BufferedOutputStream bout=new BufferedOutputStream(fout);   
    		 
    		 
    	}
    	
    	catch (FileNotFoundException ex) {

            System.out.print("Unable to open file " + "EMS.txt");
        }
            catch (IOException ex) {
                System.out.print("Unable to write in file  "+"EMS.txt");

        }
    	
    }

	

}
