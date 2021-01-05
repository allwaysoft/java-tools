class SThread implements Runnable{
    Thread t;

    SThread(){
        t=new Thread(this, "Second Thread");
        System.out.println("Second Thread: " + t);
        t.start();

    }

    public void run(){
        try{
            for(int i=5; i>0; i--){
                System.out.println("Second Thread: " + i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Second interrupted.");
        }
        System.out.println("Exiting Second Thread");
    }
}