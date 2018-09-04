package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;



public class Main {

	public static void main(String[] agrs)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter salary");
		double salary=sc.nextDouble();
		System.out.println("Enter Designation");
		String d=sc.next();
		
		Service ser=new Service();
		ser.salary=salary;
		ser.servicesOffered();
		
		Employee emp=new Employee();
		emp.id=id;
		emp.name=name;
		emp.salary=salary;
		emp.d=d;
		System.out.println(emp);
		System.out.println(ser.servicesOffered());
}
}
