import java.util.concurrent.ThreadLocalRandom;

class ThreadLocalRand {
	public static void main(String args[]) {
		int small = 0;
		int large = 25;

		ThreadLocalRandom random_number_generator = ThreadLocalRandom.current();
		int random_number = random_number_generator.nextInt(small, large);
		System.out.println(random_number);
	}
}