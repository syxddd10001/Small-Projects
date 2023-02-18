import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.*;

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
        
        
        private boolean readFileLOGIN() throws IOException
        {
                // read file method
                // login info stored in a file as UID:password
                String loginX = "";
                if (UID>lineCount()-1) return false;


                try(Stream<String> lines = Files.lines(Paths.get("loginfile.txt")))
                {           
                        loginX = lines.skip(UID).findFirst().get();
                }
                
                catch(IOException e)
                {
                        System.out.println("not found");
                }

                if (loginX.equals(UID+":"+password)) return true;
                

                return false;
        }

        public void authenticate() throws IOException
        {           
               System.out.println(readFileLOGIN());
        }


        public void signup()
        {
                

        }


}
