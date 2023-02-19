import java.util.Scanner;
import java.util.LinkedList;
import java.io.Serializable;

public class Person implements Serializable
{
        private final int UID;
        private String firstName;
        private String lastName;
        private byte date,month;
        private short year;
        private String DOB;
        private Money money;
        
        public Person(int UID, String firstName, String lastName, byte date, byte month, short year)
        {
                this.UID = UID;
                
                this.firstName = firstName;
                this.lastName = lastName;
                this.date = date;
                this.month = month;
                this.year = year;
                this.money = money;
        }
        // polymorphism
        public Person(int UID, String firstName, String lastName, byte date, byte month, short year, Money money)
        {
                this.UID = UID;
                
                this.firstName = firstName;
                this.lastName = lastName;
                this.date = date;
                this.month = month;
                this.year = year;
                this.money = money;
        }

        public int getUID()
        {
                return UID;
        }

        public String getFullName()
        {
                return (firstName + " " + lastName);
        }

        public String getDOB()
        {
                return (date+"/"+ month + "/" +year);
        }

        public Money getMoney()
        {
                return money;
        }

        private int authKey()
        {
                return 0; 
        }
        
}