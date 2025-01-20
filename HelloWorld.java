//package demo;

class HelloWorldImplementation {

    String greeting(){
        String hello ="Cordial greetings";
        return hello;
    }
}

public class HelloWorld {
	public static void main(String[] args) {
	HelloWorldImplementation varobj = new HelloWorldImplementation();
    System.out.println(varobj.greeting());
	}

}
