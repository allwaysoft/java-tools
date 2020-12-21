import java.util.Vector;

public class MemoryEater
{
  public static void main(String[] args)
  {
    Vector v = new Vector();
    int i=0;
    while (true)
    {
      byte b[] = new byte[1048576];
      v.add(b);
      i=i+1;
      Runtime rt = Runtime.getRuntime();
      System.out.println( "Total Memory = "
+ rt.totalMemory()
+ " Free Memory = "
+ rt.freeMemory()
+ " Allocated Memory = "
+ i
+ "MB" );
    }
  }
}