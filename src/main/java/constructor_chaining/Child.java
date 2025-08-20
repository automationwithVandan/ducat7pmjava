package constructor_chaining;

public class Child {
	int number;

	public Child(int number) {
		this.number = number;
		System.out.println("This is parameterized constructor");
	}

	public void printNumber() {
		System.out.println("Number is " + number);
	}

	public Child() {
		System.out.println("This is non parameterrized constructor call");
	}

	public Child(String name) {
		System.out.println("This is string parameterized constructor");
	}
}
