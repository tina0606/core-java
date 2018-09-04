package lab11;

public abstract class Program113 implements Program113Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="Hello";
			String s1="Hello";
			Program113Interface log=(uname,pass)->uname.equals(pass)?true:false;
			boolean result=log.login(s, s1);
			System.out.println(result);
	}

}
