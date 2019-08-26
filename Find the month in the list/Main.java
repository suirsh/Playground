import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedList<String> II = new LinkedList<String>();
      String month = br.readLine();
      String[] arr = month.split(",");
      for(int i = 0;i<arr.length;i++)
      {
        II.add(arr[i]);
      }
      System.out.println(II);
      System.out.println("Size of the linked list: "+II.size());
      System.out.println("Is LinkedList empty? "+II.isEmpty());
      String m1 = br.readLine();
      System.out.println("Does LinkedList contains "+m1+"?");
                         System.out.println(II.contains(m1));
                         
    }
}