import java.io.IOException;
import java.io.ObjectInput;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.*;
import java.util.Hashtable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




public class Login 
{
        
        int UID;
        String password;
        
        public Login(int UID, String password)
        {
                this.UID = UID;
                this.password = password;
        }
        
        public Login()
        {

        }

        private int lineCount() throws IOException
        {       
                Path path = Paths.get("loginFile.dat");
                int n_lines = (int) Files.lines(path).count();
                return n_lines;
        }
        
        
        private String login() throws IOException //reading login file
        {
                // read file method
                // login info stored in a file as <UID:password> (string)
                String loginX = "";
                if (UID>lineCount()-1) return "NO_SUCH_USER";


                try(Stream<String> lines = Files.lines(Paths.get("loginfile.dat")))
                {           
                        loginX = lines.skip(UID).findFirst().get();
                }
                
                catch(IOException e)
                {
                        System.err.println("not found");
                }

                if (!(loginX.equals(UID+":"+password))) return "WRONG_PASSWORD";
                

                return UID+":"+password;
        }

        public void authenticate() throws IOException
        {           
               System.out.println(login());
        }


        public Hashtable <String,Person> signup(String firstname, String lastname, byte date, byte month, short year, String password) throws IOException
        {
                int new_uid = lineCount()+1;
                // person = new_uid, firstname, lastname, date, month, year
                // string = uid and password

                Hashtable <String, Person> user = new Hashtable<String, Person>();
                String user_pass = new_uid+":"+password; 
                Person person = new Person(new_uid, firstname, lastname, date, month,year);
                user.put(user_pass, person);

                
                try 
                {       
                        // doesnt work 
                        // IDENTIFIED PROBLEM: the object is writing to an existing object
                        // corrupting the previous object
                        Path path = Paths.get("loginFile.dat");
                        FileOutputStream fileOut = new FileOutputStream(path.toString());
                        ObjectOutputStream o = new ObjectOutputStream(fileOut);
                        o.writeObject(user);
                        
                        o.close();
                        

                }
                catch (FileNotFoundException e)
                {
                        System.err.println("no login file");
                }
                catch (IOException e)
                {
                        System.err.println("error initializing stream");
                }            
                return user;
        }

        public void readData() throws IOException
        {
                Hashtable p2 = null;
                try 
                {
                        ObjectInputStream input = new ObjectInputStream(new FileInputStream("loginfile.dat"));        
                        p2 = (Hashtable) input.readObject(); 
                        input.close();
                } 
                catch (IOException e)
                {
                        System.err.println("cant open file");
                }
                catch (ClassNotFoundException ce)
                {
                        System.err.println("class not compatible");
                }

                String key = login();


                try{
                        Person p = new Person();
                        p = (Person)p2.get(key);
                        System.out.println(p.getFullName());
                }
                finally
                {
                        System.err.println("login error");
                }
        }

        


}
