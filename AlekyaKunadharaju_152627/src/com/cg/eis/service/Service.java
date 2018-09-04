package com.cg.eis.service;

public class Service implements EmployeeService
{
public double salary;

@Override
public String servicesOffered() {
	// TODO Auto-generated method stub
	{
	if(salary>5000 && salary<20000)
	{
		return "scheme A";
}
     else if(salary>=20000 && salary<40000)
{
	 return "scheme B";
	 
} 
     else if(salary>40000)


     {
    	 return "scheme C";

} else 
	return "NO SCHEME";
     
}}
}


