package com.Rishikesh;

import java.util.List;

import com.Rishikesh.EmailEntity.Employee;
import com.Rishikesh.EmailRepository.*;
import com.Rishikesh.EmailEntity.Constants;

public class Interface {

    public static void main(String[] args) {
     
		if (args.length == 0)
			System.out.println("Enter Parameter");

		if (args.length > 0 && "AddEmployee".equals(args[0])) {
		
			AddEmployee empDetails = new AddEmployee();
	    	Employee newEmployee = new Employee(1, "Rishikesh", "rishikeshc369@outlook.com", "2003-02-21");
	        empDetails.insertEmployee(newEmployee);
	    	
		}
		if(args.length > 0 && "Birthday Wish".equals(args[0])) {

	        List<Employee> employees = FetchCelebrant.getTodayCelebrantDetails();
	
	        for (Employee emp : employees) {
	            Constants.sendCelebrantDetails(emp);
	        
	        }
		}
    }
}
