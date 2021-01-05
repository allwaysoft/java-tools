import java.io.*;

class ThreadJoin extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Thread: " + Thread.currentThread().getName());
			} catch (Exception ex) {
				System.out.println("Exception caught");
			}
			System.out.println(i);
		}
	}
}
