import java.util.Scanner;
import java.lang.Math;

class Main
{
	public static void main(String [] args)
	{
		mainMenu();

	}

	public static void mainMenu()
	{
		int [] arr = ArrayNumbers();

		boolean same = sameDiff(arr);
		if (same == true)
		{
			System.out.println("The difference between all the numbers in the array are the same");
		}
		else
		{
			System.out.println("The difference between all numbers in the array are not the same");
		}
	}


	public static int[] ArrayNumbers()
	{
		Scanner myIn = new Scanner(System.in);
		System.out.println("how many numbers do you want to enter, default is 3");

		int size_array = myIn.nextInt();
		if (size_array < 3)
		{
			size_array = 3;
		}


		int [] array = new int[size_array];
		int i;
		int nums;
		for (i = 0; i<size_array;i++)
		{
			System.out.print(i + " num: ");
			nums = myIn.nextInt();
			array[i] = nums;
			System.out.println("");
		}

		return array;
	}

	public static boolean sameDiff(int [] arr)
	{
		int i;
		int difference = arr[0]-arr[1];

		boolean same = false;
		for (i = 1; i < arr.length;i++)
		{
			if (Math.abs(arr[i]-arr[i-1])!=Math.abs(difference))
			{
				same = false;
				break;
			}
			same = true;
		}

		return same;
	}


}
