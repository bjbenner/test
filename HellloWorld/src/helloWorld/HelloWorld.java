package helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		hw.sayHello();
	}
	
	public void sayHello(){
		this.saySomehing("Hello World");
	}
	
	public void saySomehing(String message){
		System.out.println(message);
	}
}
