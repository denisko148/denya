import java.util.Scanner;

public class program
{
	Scanner scanner = new Scanner (System.in);

	public static void main (String[] args)
	{
		System.out.println ("Hello");
		program program = new program();
		program.start();
	}
	public start ()
	{
		int a = input("vasia, enter pls 1 number: ");
		int b = input("vasia, pls, 2  chislo: ");
		System.out.println("brat, vot tvoja summa: " + sum(a, b);
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
