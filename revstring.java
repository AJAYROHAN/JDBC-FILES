
import java.util.*;
public class revstring
{
 public static void main(String args[]) 
 {
     String a,reverse="";
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Any Name");
     a=sc.nextLine();
     int length = a.length();
     for(int i=length-1;i>=0;i--)
      reverse=reverse+a.charAt(i);
     System.out.println("The reversed string is : "+reverse);
     
     
 }
}
