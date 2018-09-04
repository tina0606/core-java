
import java.util.Scanner;
public class Program38 {

	public static void main(String[] args)
	{
		int n;
		String temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of names:");
		n=sc.nextInt();
		String names[]=new String[n];
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter all the names:");
		for(int i=0;i<n;i++)
		{
			names[i]=sc1.nextLine();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(names[i].compareTo(names[j])>0)
						{
							temp=names[i];
							names[i]=names[j];
							names[j]=temp;
				}
			}
		}
		System.out.println("Names in sorted order:");
		for(int i=0;i<n;i++)
		{  String scndpart=(names[i].substring(names[i].length()/2)).toLowerCase();
		   String firstpart=(names[i].substring(0,(names[i].length())/2)).toUpperCase();
		   names[i]=firstpart+scndpart;
			System.out.println(names[i] + ",");
			
	}
	}
}
