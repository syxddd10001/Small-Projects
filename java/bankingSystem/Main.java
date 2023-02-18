import java.util.Scanner;
import java.util.LinkedList;
import java.io.IOException;
class Main
{
        public static void main(String [] args) throws IOException
        {
                //mainMenu();
                
                
                Login login = new Login(3, "joblin");
                login.authenticate();

                System.out.println("\nPROGRAM RAN SUCCESSFULLY");
        }

        public static void mainMenu()
        {
                Scanner inp = new Scanner(System.in);
                Person p1 = new Person(0, "Syed","Itefat",29,2,2003);
                System.out.println(p1.getFullName());
                
        }
}
