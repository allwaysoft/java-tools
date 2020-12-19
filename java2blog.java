public class java2blog
{
    static int i=0 ; // declaring static variable it cannot be from a static context
    
    public static int printNum (int x) // declaring static because 
    //non-static method printNum(int) cannot be referenced from a static context
    {
        i=i+1;
        System.out.println(i);
        return i+ printNum(i+1) ;
    }
 
	public static void main (String[] args) { 
		java2blog.printNum(i) ;
	}
}
 