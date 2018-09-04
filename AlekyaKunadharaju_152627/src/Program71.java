

import java.util.ArrayList;
import java.util.Collections;

public class Program71 {

	public static void main(String[] args)
	{
		int[] arr = {15,91,88,4};
		getSorted(arr);
	}
	
	public static int getSorted(int[] arr)
	{
		System.out.println("first:");
	    for(int i=0;i<arr.length;i++)
	{
		System.out.print("\t"+arr[i]);
	}
	for(int i=0;i<arr.length;i++)
	{
		int a=arr[i]%10;
		int b=arr[i]/10;
		int c=a*10+b;
		arr[i]=c;
	}
	System.out.println("\nrev:");
	for(int i=0;i<arr.length;i++)
		
	{
		System.out.print("\t"+arr[i]);;
		
	}
	
	ArrayList<Integer> list= new ArrayList<Integer>();
	
	for(int i=0;i<arr.length;i++)
		
	{
		list.add(arr[i]);
	}
	Collections.sort(list);
   System.out.println(list);
   return 0;
	}
}