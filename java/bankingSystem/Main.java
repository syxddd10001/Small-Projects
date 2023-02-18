package bankingSystem;

import java.util.Scanner;
import java.util.LinkedList;

class Main
{
        public static void main(String [] args)
        {
                mainMenu();
                
                System.out.println("SUCCESS");
        }

        public static void mainMenu()
        {
                Scanner inp = new Scanner(System.in);
                Person p1 = new Person(0, "Syed","Itefat",29,2,2003);
                System.out.println(p1.getFullName());
                
        }
}
