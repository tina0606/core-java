


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program33{

	public static void main(String[]args)
	{

     DateTimeFormatter date= DateTimeFormatter.ofPattern("dd/MM/yyyy");
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter date");
	 
	 String s=sc.next();
	 
	 LocalDate myDate= LocalDate.parse(s,date);
	 LocalDate today=LocalDate.now();
	 Period diff=myDate.until(today);
	 
	 System.out.println("Difference in Years"+ diff.getYears());
	 System.out.println("Difference in Months"+ diff.getMonths());
	 System.out.println("Difference in Days"+ diff.getDays());
	}
}