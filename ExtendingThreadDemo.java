// ExtendingThreadDemo.java



class ExtendingThreadDemo{
    public static void main(String [] args){
        new SThread();

        try{
            for(int i=5; i>0; i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            System.out.println("Main interrupted.");
        }
            
        
        System.out.println("Main thread exiting.");
    }
}