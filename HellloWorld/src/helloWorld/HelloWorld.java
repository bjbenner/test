package helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();
		hw.sayHello();
		hw.saySomehing("Hello Moon");
	}
	
	public void sayHello(){
		this.saySomehing("Hello World");
	}
	
	public void saySomehing(String message){
		System.out.println(message);
	}
}
