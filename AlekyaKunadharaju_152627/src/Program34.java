
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program34 {

	public static void main(String[]args)
	{
		DateTimeFormatter date= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter first date");
		 
		 String date1=sc.next();
		 LocalDate Date1= LocalDate.parse(date1,date);
		 
		 System.out.println("Enter Second date");
		 
		 String date2=sc.next();
		 LocalDate Date2= LocalDate.parse(date2,date);
		 
		 Period diff=Date1.until(Date2);
		 
		 System.out.println("Difference in Years"+ diff.getYears());
		 System.out.println("Difference in Months"+ diff.getMonths());
		 System.out.println("Difference in Days"+ diff.getDays());
	
	}
}