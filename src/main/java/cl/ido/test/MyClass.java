package cl.ido.test;

public class MyClass {

	private int LIMIT = 999;

	public int multiply(int x, int y) {
		// the following is just an example
		if (x > LIMIT) {
			throw new IllegalArgumentException("X should be less than 1000");
		}
		return x * y;
	}
}