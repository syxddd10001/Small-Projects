import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Main
{
	public static void main(String [] args)
	{
		mainmenu(); //calling mainmenu method
	}
	
	public static void mainmenu()
	{
		ArrayList <Integer> array = createArray(10); //creating a random ArrayList of size 10
		for (int i = 0; i<array.size(); i++) // displaying the ArrayList we just created to the user
		{
			System.out.print(array.get(i) + " ");
		}
		ArrayList <Integer> empty = new ArrayList<Integer>(); 

		ArrayList <Integer> parted = part(array,empty);
		System.out.println(" ");	
		for (int i = 0; i<parted.size(); i++)
		{
			System.out.print(parted.get(i) + " ");
		}
	}

	public static ArrayList <Integer> createArray(int s)
	{
		ArrayList <Integer> array = new ArrayList<Integer>();
		for (int i = 0; i<s; i++)
		{
			 array.add((int)(Math.random()*100));
		}
		return array;
	}

	public static ArrayList <Integer> part(ArrayList<Integer> array, ArrayList<Integer> nArray)
	{	
		// []
		// [8,6,4,3,5,1]
		
		if (array.size() == 0)
		{
			return nArray;
		}
		else
		{
			for (int i = 0; i<array.size();i++)
			{
				if ((array.get(i)%2)==0)
				{
					nArray.add(array.get(i));
					array.remove(i);
					return part(array,nArray);
				}

			}

			for (int i = 0; i<array.size();i++)
			{
				if ((array.get(i)%2)==1)
				{
					nArray.add(array.get(i));
					array.remove(i);
					return part(array,nArray);
				}
			
			}
		
		
		}
		return nArray;
		
	}	

}
