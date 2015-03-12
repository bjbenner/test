package helloWorld;

public abstract class Hello {

	public Hello() {
		super();
	}

	public final void saySomehing(String message) {
		System.out.println(message);
	}
	
	public abstract void sayHello();

}