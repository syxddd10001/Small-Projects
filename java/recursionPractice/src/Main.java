import java.lang.Math;
import java.util.*;
import java.io.*;
import java.util.Arrays;
public class Main
{

    public static void main(String[] args) throws IOException
    {
        mainmenu();
    }


    public static void mainmenu() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner myInput = new Scanner(System.in);
        System.out.println("1 for factorial. 2 for fibonacci sequence. 3 to reverse a string. 4 to countdown. 5 to enter a list and reverse it. 6 for conversion from decimal to binary. 7 to do binary search on a list");
        int user = myInput.nextInt();

        if (user == 1)
        {
            System.out.println("What factorial do you want? ");
            int num = Integer.parseInt(br.readLine());
            System.out.println(num + " factorial is: " + factorial(num, 1));
        }
        else if (user == 2)
        {
            int n = Integer.parseInt(br.readLine());
            System.out.println(fibonacci(n));
        }

        else if (user == 3)
        {
            System.out.println("enter a string: ");
            String s = br.readLine();
            System.out.println("your string reversed: " + reverseString(s,""));
        }

        else if (user == 4)
        {
            System.out.println("what number do you want to countdown from: ");
            int c = Integer.parseInt(br.readLine());
            System.out.println("enter the increment you want to countdown by: ");
            int i = Integer.parseInt(br.readLine());
            System.out.println(countdown(c,i));

        }

        else if (user == 5)
        {
            System.out.println("enter the size of the list you want to create");
            int s = myInput.nextInt();
            LinkedList <String> userList = createList(s);
            LinkedList <String> empty = new LinkedList <String>();
            LinkedList <String> reversedList  = reverseList(userList,empty);
            //start
            for (int i = 0; i<reversedList.size();i++)
            {
                System.out.println(reversedList.get(i));
            }

        }

        else if (user == 6)
        {
            System.out.println("enter a decimal number: ");
            int d = Integer.parseInt(br.readLine());
            System.out.println(convDeciBin(d,""));

        }

        else if (user == 7)
        {
            System.out.print("enter the size of the list you want to create: ");
            int i_length = myInput.nextInt();
            LinkedList <Integer> new_list = createIntList(i_length);

            for (int i = 0; i<new_list.size();i++)
            {
                System.out.print(new_list.get(i)+" ");
            }

            int [] array = listToArray(new_list);

            System.out.print("what do you want to search: ");
            int input = myInput.nextInt();


            int bin_result = binSearch(array,input);
            if (bin_result != 0000000)
            {
                System.out.println("Number found at index: " + bin_result);
            }

            else
            {
                System.out.println("Number not found");
            }
        }
    }

    public static LinkedList <String> createList(int elem) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner myInput = new Scanner(System.in);
        if (elem<4)
        {
            elem = 4;
        }
        LinkedList <String> newList = new LinkedList<String>();
        String input;
        for (int i = 0; i<elem;i++)
        {
            input = br.readLine();
            newList.add(input);
        }


        return newList;
    }

    public static LinkedList <Integer> createIntList(int elem) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner myInput = new Scanner(System.in);
        if (elem<4)
        {
            elem = 4;
        }
        LinkedList <Integer> newList = new LinkedList<Integer>();
        int input;
        for (int i = 0; i<elem;i++)
        {
            input = Integer.parseInt(br.readLine());
            newList.add(input);
        }
        return newList;
    }
    public static int factorial(int n, int fact)
    {
        if (n == 0)
        {
            return fact;
        }

        else
        {
            fact = fact * n;
            return factorial(n-1,fact);
        }
    }

    public static int fibonacci(int fib)
    {
        if (fib == 1 || fib == 2)
        {
            return fib;
        }
        else
        {
            return fibonacci(fib-1) + fibonacci(fib-2);
        }
    }

    public static String reverseString(String s, String r)
    {
        if (s.length() == 0)
        {
            return r;
        }

        else
        {
            r = s.substring(0,1)+r;
            s = s.substring(1,s.length());
            return reverseString(s,r);
        }
    }

    public static int countdown(int x, int increment)
    {
        if (x == 0)
        {
            return x;
        }

        else
        {
            System.out.println(x);
            return countdown(x-increment,increment);

        }
    }

    public static LinkedList <String> reverseList(LinkedList <String> s, LinkedList <String> r)
    {
        if (s.size() == 0)
        {
            return r;
        }

        else
        {
            r.add(s.get(s.size()-1));
            s.removeLast();
            return reverseList(s,r);
        }
    }

    public static String convDeciBin(int q, String r)
    {
        //input -- d3 = b11
        // 3%2 = 1, 3/2 = 1, 1%2 = 1, 1/2 = 0
        int temp;
        if (q == 0)
        {
            return r;
        }
        else
        {
            temp = q % 2;
            r = temp + r;
            q = q/2;
            return convDeciBin(q,r);
        }
    }

    public static int [] listToArray(LinkedList <Integer> list)
    {
        int [] array = new int[list.size()];

        for (int i = 0; i<array.length;i++)
        {
            array[i] = list.get(i);
        }
        return array;
    }
    public static int binSearch(int [] array, int a)
    {
	int index = 0;

	





	return index;
    }
}
