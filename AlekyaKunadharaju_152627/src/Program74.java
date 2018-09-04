import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program74 {

	public static Map getSquares(int[] a)
	{
		int n=a.length;
		int[] asr=new int[n];
		for(int i=0;i<n;i++)
		{
			asr[i]=a[i]*a[i];
		}
		Map<Integer,Integer> h=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			h.put(a[i],asr[i]);
		}
	return(h);
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the  elements");
		for(int i=0;i<n;i++)
		{
	         
			ar[i]=sc.nextInt();
			
	}
		
	Map<Integer,Integer> h1=new HashMap<Integer,Integer>();
	h1=getSquares(ar);
	System.out.println(h1);
}
}