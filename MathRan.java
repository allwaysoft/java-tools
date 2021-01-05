class MathRan {
	public static void main(String args[]) {
		int small = 0;
		int large = 25;

		int random_number = (int)(Math.random() * (large - small + 1) + small);
		System.out.println(random_number);
	}
}