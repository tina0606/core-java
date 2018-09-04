import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Program91 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(new File("input.txt")).useDelimiter("\\Z");
		String contents=s.next();
		contents=new StringBuilder(contents).reverse().toString();
		System.out.println("Original Content is  "+ contents);

		contents=new StringBuilder(contents).reverse().toString();
		System.out.println("Reversed content is  "+contents);
		
		FileWriter fwt=new FileWriter("out.txt");
		BufferedWriter br=new BufferedWriter(fwt);
		br.write(contents);
		br.close();
		s.close();
		
		
	}

	private static void useDelimiter(String string) {
		// TODO Auto-generated method stub
		
	}

	
		
	}

