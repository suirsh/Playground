import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet<String> Ihs=new LinkedHashSet<String>();
      String month = br.readLine();
      String[] arr = month.split(",");
      for(int i = 0;i<arr.length;i++)
      {
        Ihs.add(arr[i]);
    }
      System.out.println(Ihs);
      System.out.print("Enter the value to be deleted: ");
      String n = br.readLine();
      System.out.println(n);
      Ihs.remove(n);
      System.out.println(Ihs);
      System.out.print("Enter the value to be added: ");
      String m = br.readLine();
      System.out.println(m);
      Ihs.add(m);
      System.out.println(Ihs);
      
    }
}