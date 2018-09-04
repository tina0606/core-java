import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Collection;
public class Program75 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		List<String> a1=new ArrayList<String>();
		
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			a1.add(sc.next());
	}
	Collections.sort(a1);
	for(String s:a1)
	{
		System.out.println(s);
	}

}
}