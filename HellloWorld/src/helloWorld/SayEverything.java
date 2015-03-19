package helloWorld;

public class SayEverything {

	public static void main(String[] args) {
		Hello[] h = new Hello[3];
		h[0] = new HelloWorld();
		h[1] = new HelloMoon();
		h[2] = new HelloSun();
		
		for (Hello hello : h) {
			hello.sayHello();
		}
		
 		System.out.println("Ende");
		
	}

}
