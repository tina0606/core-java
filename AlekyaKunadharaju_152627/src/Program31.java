import java.util.Scanner;

public class Program31
	{
		public static void main(String[] args)
		{
			String s1;
			int choice;
			Scanner sc=new Scanner(System.in);
			Scanner sc1=new Scanner(System.in);
			s1=sc.next();
			choice=sc1.nextInt();
			switch(choice)
			{
			case 1:
				String s2=s1+s1;
				System.out.println(s2);
				break;
			
			case 2:
				for(int i=0;i<=s1.length();i++)
				{
					if(i%2!=0)
					{
						s1=s1.substring(0, i-1)+"#"+s1.substring(i,s1.length());
					}
				}
				System.out.println(s1);
			break;
			
			case 3:
				int l=s1.length();
				char duplicate;
				String ans=" ";
				for(int j=0;j<1;j++)
				{
					duplicate=s1.charAt(j);
					if(duplicate!=' ')
						 ans=ans+duplicate;
					s1=s1.replace(duplicate, ' ');
				}
		         System.out.println(ans);
		         break;
			case 4:
				int x=0;
				char ch1;
				for(x=0;x<s1.length();x++)
				{
					ch1=s1.charAt(x);
					if(x%2==0)
					{
						System.out.print(Character.toLowerCase(ch1));
					}
					else
						
						System.out.print(Character.toUpperCase(ch1));
				}
			
			 break;
			
			}
		
			
			
		}
	}
