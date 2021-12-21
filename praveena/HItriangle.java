import java.util.*;
public class HItriangle
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	int n=sc.nextInt();	 
             
       
	for(int i=n;i>0;i--)
               {
	     if(i==1 || i==n)
                       for(int j=1;j<=i;j++)
                         {
                               System.out.print(j);
                        }
                   else
	    {
                       for(int j=1;j<=i;j++)         
                       {  
                          	if(j==1 || j==i)
                              	System.out.print(j);
                              else
                                            System.out.print(" ");
                        }
                    }
                     System.out.println();   
               }             
    }
}