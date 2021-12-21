//frequency of a charcter
import java.util.*;
public class search 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char ch = sc.next().charAt(0);
    int count=0;
    for(int i=0;i<str.length();i++)
     {
         if(ch==str.charAt(i))
          {
            count++;
          }
    }
     if(count>0)
     {
         System.out.println("count is "+count);
     }else
     {
         System.out.println("invalid");
     }

  } 
}
