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
		Scanner myInput = new Scanner(System.in);
		System.out.println("0 for creating your own number array. 1 for generating a random array.");
		int choice = myInput.nextInt();
		int [] array;
		if (choice == 0)
		{
			array = create();
		}
		else
		{
			System.out.print("enter array size: ");
			int n = myInput.nextInt();
			array = createRandom(n);
			for (int i = 0; i<n;i++)
			{
				System.out.print(array[i]+" ");
			}
		}
		int x;
		System.out.println("\nwhich number do you want to move to the right?");
		x = myInput.nextInt();
		int [] a = moveright(array,x);
		for (int i = 0; i < a.length;i++)
		{
			System.out.print(a[i]+" ");
		}


	}
	public static int [] createRandom(int n)
	{

		int [] randArray = new int[n];
		for (int i = 0; i<n;i++)
		{
			randArray[i] = (int)(Math.random()*10);

		}
		return randArray;
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
		boolean hasN = false;
		int i;
		do
		{
			for (i = 0; i<arr.length-1;i++)
			{
				if (arr[i] != num)
				{
					hasN = false;
					continue;
				}
				else
				{
					if (arr[i+1] == num)
					{
						if (hasN == true && i!=arr.length-1)
						{
							continue;
						}
						hasN = false;
						continue;
					}

					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]= temp;
					hasN = true;
				}

			}
			if (hasN == false)
			{
				break;
			}
		}

		while (true);
		return arr;
	}


}
