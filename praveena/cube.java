//cube the number
import java.util.*;
class Cube 
{
 public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    double num = sc.nextDouble();
    double power =sc.nextDouble();
    double result = Math.pow(num,power);
    System.out.println("cube of "+num+" is "+result);
  }
}
    
