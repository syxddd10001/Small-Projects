import java.util.*;
import java.lang.Math;

class Main
{
  public static void main(String[] args)
  {
    System.out.println("input the list: ");
    LinkedList <String> newList = makeList(5);

    for (int i = 0; i<newList.size();i++)
    {
      if (i == newList.size()-1)
      {
        System.out.print(newList.get(i));
        break;
      }
      System.out.print(newList.get(i) + ", ");
    }

  }

  public static LinkedList <String> makeList (int s)
  {
      LinkedList <String> newList = new LinkedList<String>();
      Scanner myInput = new Scanner (System.in);
      String a;
      for (int i = 0; i<s;i++)
      {
        System.out.print("-> ");
        a = myInput.nextLine();
        newList.add(a);
        System.out.println();

      }
      return newList;
  }

}
