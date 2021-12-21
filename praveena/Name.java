import java.nio.channels.ClosedSelectorException;
import java.util.*;
public class Name {
    public static void main(String[] args)
    {
      
      String str="3:12:2 sunday 19-dec-2021";
      String part[]=str.split(" ");
      System.out.println(part[0]);
      System.out.println(part[1]);
      System.out.println(part[2]);
      String temp=part[0];
      String firststring[]=temp.split(":");
      System.out.println("hour:"+firststring[0]);
      System.out.println("minute:"+firststring[1]);
      System.out.println("seconds:"+firststring[2]);
      System.out.println("day :"+part[1]);
      String temp2=part[2];
      String second[]=temp2.split("-");
      System.out.println("date :"+second[0]);
      System.out.println("month :"+second[1]);
      System.out.println("year :"+second[2]);
    }
}
