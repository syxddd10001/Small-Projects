import java.util.Scanner;
import java.util.LinkedList;
import java.io.IOException;
class Main
{
        public static void main(String [] args) throws IOException
        {
                //mainMenu();
                
                //sample data

                Login log = new Login(1,"");
                log.signup("Ron", "Denver", (byte)1, (byte)3, (short)1999, "whatisthis");
                

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
