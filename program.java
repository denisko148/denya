import java.util.Scanner;

public class Program
{
	Scanner sc = new Scanner (System.in);
	String start = "";
	String finiw = "";
	
	public static void main (String[] args)
	{
		System.out.println ("Hello");
		Program program = new Program();
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

public class Mike
{
	int m, n, o;
	double z1 = 0;
	double z2 = 0;
	double z3 = 0;
	
		public Mike(int m, int n, int o)
		{
			this.m = m;
			this.n = n;
			this.o = o;
		}
		public void result (int m, int n, int o)
		{
			z1 = m + n + o;
			z2 = z1 * 4;
			z3 = z2 / 3;
			System.out.printf ("%.2f\n", z3);
		}
		public void res1 ()
		{
			System.out.printf ("%.2f\n", z1);
		}
		public void res2 ()
		{
			System.out.printf ("%.2f\n", z2);
		}
		public void res3 ()
		{
			System.out.printf ("%.2f\n", z3);
		}
}
	