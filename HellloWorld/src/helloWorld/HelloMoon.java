package helloWorld;

public class HelloMoon extends Hello {

	public static void main(String[] args) {
		Hello hw = new HelloMoon();
		hw.sayHello();
	}

	public void sayHello(){
		this.saySomehing("Hello Moon");
	}
}
