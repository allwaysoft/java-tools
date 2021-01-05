class Intellipaat {
	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		t1.start();
		t2.start();
		try {
			System.out.println("Thread: " + Thread.currentThread().getName());
			t1.join();
		} catch (Exception ex) {
			System.out.println("Exception caught");
		}
		//t2.start();
		try {
			System.out.println("Thread: " + Thread.currentThread().getName());
			t2.join();
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		
		System.out.println("Thread: " + Thread.currentThread().getName());
	}
}