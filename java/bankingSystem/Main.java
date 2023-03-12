import java.util.Scanner;
import java.util.LinkedList;
import java.io.IOException;
class Main
{
        public static void main(String [] args) throws IOException
        {
                //mainMenu();
                
                //sample data

                Login log = new Login();
               //log.signup("Von", "Heimer", (byte)2, (byte)5, (short)1992, "pswd");
                log.readData();

                System.out.println("\nPROGRAM RAN SUCCESSFULLY");
        }

        public static void mainMenu()
        {
                Scanner inp = new Scanner(System.in);
                
               
                
        }

        public static void loginPromt() throws IOException
        {
                Login login = new Login(0, "password");
                login.authenticate(); // LOGIN PROMT
        }
}
