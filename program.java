import java.util.Scanner;

public class program
{
	Scanner sc = new Scanner (System.in);
	String start = "";
	String finiw = "";
	
	public static void main (String[] args)
	{
		System.out.println ("Hello");
		program program = new program();
		program.start();
	}
	public void start ()
	{
		int a = input("vasia, enter pls 1 number: ");
		int b = input("vasia, pls, 2  chislo: ");
		System.out.println("brat, vot tvoja summa: " + sum(a, b));
		System.out.print("Zelaete ispolzovat mike class?(yes/no) : ");
		start = sc.next();
		if (start.equals("no"))
			return;
		if (start.equals("yes"))
		{
			System.out.print("Enter 1 number: ");
			int m = sc.nextInt();
			System.out.print("Enter 2 number: ");
			int n = sc.nextInt();
			System.out.print("Enter 3 number: ");
			int o = sc.nextInt();
			System.out.print("Result: ");
			Mike g = new Mike(m, n, o);
			g.result(m, n, o);
			System.out.println("Zelaete oznakomitsia podrobnej?(yes/no): ");
			finiw = sc.next();
			while (true) 
			{
				if (finiw.equals("no"))
				{
					System.out.println("Rabota zakonchena, pozdravliaju. Rabotodatel gandon");
					return;
				}
				if (finiw.equals("yes"))
				{
					System.out.print("Interesuet pervaja, vtoraja ili tretja operacija?(1/2/3): ");
					int t = sc.nextInt();
					if (t == 1)
						g.res1();
					if (t == 2)
						g.res2();
					if (t == 3)
						g.res3();
					System.out.println("Zelaete ewe podrobnostej?(yes/no): ");
					finiw = sc.next();
				}
			}
		}
	}
	public int sum (int a, int b)
	{
		return a + b;
	}
	public int input (String text)
	{
		System.out.print (text);
		return sc.nextInt();
	}
}


