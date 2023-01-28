import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

class Main
{
	public static void main(String [] args)
	{
		Scanner myInput = new Scanner(System.in);
		System.out.print("0 for auto mode. 1 for edit mode.\n");
		byte m = myInput.nextByte();
		boolean m_b;

		if (m == 0)
		{
			m_b = false;
		}
		else
		{
			m_b = true;
		}

		mainmenu(m_b);
	}
	

	public static void mainmenu(boolean mode)
	{
		
		Scanner myInput = new Scanner(System.in); 


		if (mode == false)
		{
			String sample = "early bird gets the worm";
			System.out.println(replaceString(sample,"early","late"));
		}
		
		else
		{
			System.out.println("enter the original string: ");
			String user = myInput.nextLine();
			
			System.out.println("which word do you want to replace: ");
			String oWord = myInput.nextLine();
			System.out.println("what do you want to replace it with: ");
			String rWord = myInput.nextLine();

			System.out.println(replaceString(user,oWord,rWord));
		
		}

	}

	public static String replaceString(String sentence, String word1, String word2)
	{
		// replace word1 with word2 in the sentence
		
		String [] strArray = sentence.split(" ");
		String s2= ""; 
		for (int c = 0; c<strArray.length;c++)
		{
			System.out.println(strArray[c]);
			
			if (strArray[c].equals(word1))
			{
				
				strArray[c] = word2;
			
			}
			s2 += strArray[c]+ " ";
			


		}

		return s2;
		
		
			
	}



}
