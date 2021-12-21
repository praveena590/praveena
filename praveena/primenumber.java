import java.io.*;
import java.util.*;
 class primenumber
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     if(num>1)
      {
       for(int i=2;i<num;i++)
        {
         if((num%i)==0)
            {
             System.out.println("not a prime number");
             break;
            }
          else
            {
            System.out.println(" prime number"); 
            break;
          }
        }
      }
      else
      {
       System.out.println("not a primr number");
      }
    }
  }
 