package helloWorld;

public class HelloMoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloMoon hw = new HelloMoon();
		hw.sayHello();
	}

	public void sayHello(){
		this.saySomehing("Hello Moon");
	}
	
	public void saySomehing(String message){
		System.out.println(message);
	}
}
