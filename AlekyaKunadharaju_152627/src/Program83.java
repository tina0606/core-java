
public class Program83 implements Runnable {
	static Program83 obj1;
	static Program83 obj2;
	static Thread t;
	static Thread t1;

	private int num = (int) (Math.random() * 10);
	private int fact = 1;
	int i = num;

	public void run() {
		synchronized (t) {
			if (Thread.holdsLock(t))
				System.out.println("Number:" + num);
		}
		synchronized (t1) {
			if (Thread.holdsLock(t1)) {
				while (i > 0) {
					fact = fact * i;
					i--;
				}
				System.out.println("The Factorial of Number:" + num + ":" + fact);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		obj1 = new Program83();
		obj2 = new Program83();

		t = new Thread(obj1);
		t1 = new Thread(obj2);

		t.start();
		t1.start();
		t1.sleep(2000);

	}
}
