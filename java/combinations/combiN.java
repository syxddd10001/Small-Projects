package combinations;
import java.util.LinkedList;
import java.util.Scanner;

//import
class Main
{
    public static void main(String [] args)
    {
        Scanner ninput = new Scanner(System.in);
        
        System.out.println("num: ");
        int num = ninput.nextInt();
        
        System.out.println(comboN(num));


    }

    public static int comboN(int num)
    {
        // 64 (8x5+6x4)
        LinkedList <Integer> nList = new LinkedList<Integer>();

        int count = 0;
        
        int tempN = num;
        int modx = 0;
        while (num>0)
        {
            if (num % 5 == 0)
            {
                count ++;
            }
            num -= 4;           
        }
        num = tempN;
        while (num>0)
        { 
            if (num % 4 == 0)
            {
                count ++;
            }
            num -=5;       
        }

        return count;

    }
    public static void loop2(int num, int count)
    {
        while (num > 0)
        {
            System.out.println(num);
            num -= count;
        }
    }

}
