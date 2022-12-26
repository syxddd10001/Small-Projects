import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
class Main
{

	public static void main(String[] args)
	{
		mainmenu();

	}

	public static void mainmenu()
	{

		Scanner myIn = new Scanner(System.in);
		System.out.println("type 1 to exit, type the base number you want to convert to");
		int m;
		int inp;


		try
		{
			m = myIn.nextInt();
			if (m == 1)
			{
				System.exit(0);
			}
			System.out.println("type the decimal number: ");
			inp = myIn.nextInt();
			Main obj = new Main();
			int p[] = obj.converter(inp,m);

			int i;
			for (i = 0; i<=p.length-1; i++)
			{
				switch (p[i])
				{

					case 10:
						System.out.print("A");
						break;
					case 11:
						System.out.print("B");
						break;
					case 12:
						System.out.print("C");
						break;
					case 13:
						System.out.print("D");
						break;
					case 14:
						System.out.print("E");
						break;
					case 15:
						System.out.print("F");
						break;
					default:
						System.out.print(p[i]);
				}
				System.out.print(" ");

			}
			System.out.println("\n");

		}
		catch(Exception e)
		{
			System.out.println("please enter a number");
		}
		finally
		{
			mainmenu();
		}

	}


	public static int[] converter(int num, int mode)
	{
		int r;
		int[] rem = new int[100];

		int counter;
		counter = 0;

		do
		{
			r = num % mode;
			num = num / mode;
			rem[counter] = r;
			counter++;
		}

		while (num > 0);

		int [] temp = new int[counter];
		int i;
		int count = 0;
		for (i = counter-1; i>=0;i--)
		{
			temp[count] = rem[i];
			count ++;

		}
		return temp;
	}

}
