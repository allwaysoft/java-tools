// MainThreadDemo.java

class MainThreadDemo{
    public static void main(String [] args){
        Thread t = Thread.currentThread();
        System.out.println("Main thread: " + t); 
        
                //now changing the name of the thread
        t.setName("New Name");
        System.out.println("Name changed to: " + t);
    }
}