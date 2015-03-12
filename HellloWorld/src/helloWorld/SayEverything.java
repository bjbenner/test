package helloWorld;

public class SayEverything {

	public static void main(String[] args) {
		Hello[] h = new Hello[2];
		h[0] = new HelloWorld();
		h[1] = new HelloMoon();
		
		for (Hello hello : h) {
			hello.sayHello();
		}

	}

}
