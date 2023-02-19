import java.io.IOException;
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




public class Login {
        
        final int UID;
        String password;
        
        public Login(int UID, String password)
        {
                this.UID = UID;
                this.password = password;
        }
        
        private int lineCount() throws IOException
        {       
                Path path = Paths.get("loginFile.txt");
                int n_lines = (int) Files.lines(path).count();
                return n_lines;
        }
        
        
        private boolean readFileLOGIN() throws IOException //reading login file
        {
                // read file method
                // login info stored in a file as <UID:password> (string)
                String loginX = "";
                if (UID>lineCount()-1) return false;


                try(Stream<String> lines = Files.lines(Paths.get("loginfile.txt")))
                {           
                        loginX = lines.skip(UID).findFirst().get();
                }
                
                catch(IOException e)
                {
                        System.err.println("not found");
                }

                if (!(loginX.equals(UID+":"+password))) return false;
                

                return true;
        }

        public void authenticate() throws IOException
        {           
               System.out.println(readFileLOGIN());
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
                        FileOutputStream f = new FileOutputStream(new File("loginfile.txt"),true);
                        ObjectOutputStream o = new ObjectOutputStream(f);

                        o.writeObject(person);
                        
                        o.close();
                        f.close();

                        FileInputStream fi = new FileInputStream(new File("loginfile.txt"));
                        ObjectInputStream oi = new ObjectInputStream(fi);

                        Person x = (Person) oi.readObject();
                        System.out.println(x.getDOB());



                }
                catch (FileNotFoundException e)
                {
                        System.err.println("no login file");
                }
                catch (IOException e)
                {
                        System.err.println("error initializing stream");
                }
                catch (ClassNotFoundException e)
                {
                        e.printStackTrace();
                }



                
                return user;
        }

        


}
