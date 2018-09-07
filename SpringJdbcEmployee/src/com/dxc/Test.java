package com.dxc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("Beans.xml"); 
		EmployeeDAO empDAO=(EmployeeDAO)context.getBean("edao");
		
		System.out.println("Enter choice : 1 Add Employee 2. Delete 3.Search");		
		Scanner sc=new Scanner(System.in);
		for(;;) {
		int choice=sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
		case 1:
			System.out.println("Enter name ");
			String name=sc.nextLine();
			System.out.println("Enter id ");
			String id=sc.nextLine();
		
			System.out.println("Enter salary ");
			float salary=sc.nextFloat();
			Employee e=new Employee(name,salary,id);
			empDAO.addEmployee(e);
			break;
			
		case 2: System.out.println("Enter Emp. Id to delete: ");
		String empId=sc.nextLine();
		empDAO.deleteEmployee(empId);
		System.out.println("Deleted successfully\n");
	     break;
	
		
		case 3: System.out.println("Enter Emp. Id to search: ");
		String eId=sc.nextLine();
		Employee emp = empDAO.getEmployee(eId);
		  System.out.print("\n Id : " + emp.getEmpId() );
	      System.out.print("\n Name : " + emp.getName() );
	      System.out.println("\n Salary : " + emp.getSalary());
		break;
		
		            
				
			}
		}
	}}
