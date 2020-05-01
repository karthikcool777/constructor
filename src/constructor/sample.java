package constructor;

public class sample {

	public sample() {
		System.out.println("parent default constructor");
	}

	public sample(int s) {
		System.out.println("parent int constructor" + s);
	}

	public sample(String n) {
		System.out.println("Parent String " + n);
	}
}