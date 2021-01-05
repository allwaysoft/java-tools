/**
 * This is the first sample program in Core Java Chapter 3
 * @version 1.01 1997-03-22
 * @author Gary Cornell
 */
import java.util.Date;
public class FirstSample
{
   public static void main(String[] args)
   {
      System.out.println("We will not use 'Hello, World!'");
      System.out.println(2.0-1.1);
      System.out.println("\u03C0");
      String greeting="Hello";
      String s=greeting.substring(0,3);
      System.out.println(s);
      String all=String.join("/","L","S","X");
      System.out.println(all);
      System.out.println("Hello".equalsIgnoreCase("hello"));
      String mys=null;
      System.out.println(mys);
      System.out.println("Hello".startsWith("Hel"));
      StringBuilder builder= new StringBuilder();
      builder.append("A");
      builder.append("B");
      System.out.println(builder.toString());
      System.out.printf("%tc", new Date());
   }
}
