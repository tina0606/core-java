import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program92 {

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner s=new Scanner(new File("numbers.txt"));
		String contents=s.next();
		
		
		System.out.println("Original Contents is"+contents);
		
		String str[]= contents.split(",");
		for(String string:str)
		{
			int value=Integer.parseInt(string);
			if(value %2==0)
			{
				System.out.printf("%d \t", value);
			}
		}
	}
}
