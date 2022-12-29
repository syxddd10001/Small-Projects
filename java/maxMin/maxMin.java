import java.util.Scanner;
import java.lang.Math;

class Main
{
	public static void main(String [] args)
	{
		do
		{
			mainmenu();
			System.out.println("\n- - - - - - - -");
		}
		while (true);
	}
	
	public static void mainmenu()
	{
		int [] array = arrayGenerator(10);
		Scanner myInput = new Scanner(System.in);

			
		for (int i = 0;i<array.length ;i++)
		{
			System.out.print(array[i]+ " ");
		}

		System.out.println("\n0 for min. 1 for max. 2 for both min and max. Any other number to exit");
		int user = myInput.nextInt();
		if (user == 0)
		{
			System.out.println("the min num of the array is "+ min(array));
		}
		
		else if (user == 1)
		{
			System.out.println("the max num of the array is "+ max(array));
		}

		else if (user == 2)
		{
			System.out.println("the min num of the array is "+ min(array));
			System.out.println("the max num of the array is "+ max(array));

		}



		else
		{
			System.exit(0);
		}
	}
	
	public static int [] arrayGenerator(int size1)
	{
		int [] array = new int[size1];
		for (int i = 0; i<size1; i++)
		{
			array[i] = (int)(Math.random()*100);
					
		}
		return array;
		//done
	}

	public static int max(int [] array)
	{
		int max = array[0];
		int counter = 0; 
		// [1,5,10,2,3,4,15,2] 
		do
		{
			if (array[counter]>max)
			{
				max = array[counter];
			}
			counter ++;

		}
		while (counter < array.length);	
		return max;
		//done
	}
	
	public static int min(int [] array)
	{
		int min = array[0];
		int counter = 0; 
		// [1,5,10,2,3,4,15,2] 
		do
		{
			if (array[counter]<min)
			{
				min = array[counter];
			}
			counter ++;

		}
		while (counter < array.length);	
		return min;
		//done
	}
}
