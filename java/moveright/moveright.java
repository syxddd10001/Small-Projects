import java.util.Scanner;
import java.lang.Math;

class Main
{
	public static void main(String [] args)
	{
		mainmenu();

	}

	public static void mainmenu()
	{
		//add
	}


	public static int [] create()
	{
		System.out.println("how many numbers do you want to enter? default is 4");
		Scanner myInput = new Scanner(System.in);
		int nums;
		nums = myInput.nextInt();
		if (nums < 4)
		{
			nums = 4;
		}
		int[] array = new int[nums];
		int i;
		for (i = 0; i<array.length;i++)
		{
			System.out.println("num "+(i+1));
			nums = myInput.nextInt();
			array[i] = nums;

		}
		return array;

	}


	public static int [] moveright(int [] arr, int num)
	{
		int temp;
		boolean hasN = true;

		for (int i = 0; i < arr.length;i++)
		{
			if (arr[i] != num)
			{
				continue;
			}
			else if (arr[i] == num)
			{
				//start here
			}
		}
		return arr;
	}


}
