package helloWorld;

public class HelloWorld extends Hello {

	public static void main(String[] args) {
		Hello hw = new HelloWorld();
		hw.sayHello();
	}
	
	public void sayHello(){
		this.saySomehing("Hello World");
	}
	
}
