import java.util.*;
class employee {
    
       String empname;
       int empid;
       String designation;
       employee(String empname,int empid,String designation) 
       {
          this.empname=empname;
          this.empid=empid;
          this.designation=designation;


       }

}
class Testemp
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in) ;
       int n=sc.nextInt();
       employee list[]=new employee[n];
       for(int i=0;i<n;i++)
        {
            System.out.println("enter the name");
            String empname=sc.next();
            
            System.out.println("enter the designation");
            String designation=sc.next();
            System.out.println("enter the id");
            int empid=sc.nextInt();
            employee e=new employee(empname, empid, designation);
            list[i]=e;

        }
     System.out.println("enter the saerch number");
     int search=sc.nextInt();
     for(employee t:list)   
      {
          if(t.empid==search)
           {
               System.out.println("match found");
               System.out.println("employee no "+t.empid);
               System.out.println("employee name  "+t.empname);
               System.out.println("employee designation    "+t.designation);
               

           }
      }
    }
}
