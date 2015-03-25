package helloWorld;

public abstract class Hello {

	public Hello() {
		super();
	}

	public final void saySomehing(String message) {
		System.out.println(this.getClass().getCanonicalName()+"\t:\t"+ message);
	}
	
	public abstract void sayHello();

}