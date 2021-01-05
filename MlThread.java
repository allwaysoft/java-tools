import java.util.*;

public class MlThread {

	public static void main(String[] args) {
		System.out.println("main start");

		ThreadGroup lThreadGroup = new ThreadGroup("CThread's Group");
		CThread lCThread;

		for (int count = 0; count < 10; count++) {
			lCThread = new CThread(lThreadGroup, "Thread - " + count);
			lCThread.start();
		}

		while (lThreadGroup.activeCount() > 0) {
			try {
				System.out.println("Waiting for " + lThreadGroup.activeCount() + " CThreads to Complete");
				Thread.sleep(1000); // Main Thread or someThradObject.sleep();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main end");

	}
}

class CThread extends Thread {

	public CThread(ThreadGroup pThreadGroup, String pThreadName) {
		super(pThreadGroup, pThreadName);
	}

	public void run() {
		System.out.println(this.getName() + " Thread begins..");
		try {
			Random randomno = new Random();
			Thread.sleep(1000 * randomno.nextInt(10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + " Thread ends...");
	}

}