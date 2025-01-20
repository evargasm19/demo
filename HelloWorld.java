//package demo;

class HelloWorldImplementation {

    String greeting(){
        String hello ="Cordial greetings";
        return hello;
    }

    int sum(){
        int a=5, b=5;
        int sum = a + b;
        return sum;
    }

    int division(){
        int a=9, b=6;
        int div = a / b;
        return div;
    }

}

public class HelloWorld {
	public static void main(String[] args) {
	HelloWorldImplementation varobj = new HelloWorldImplementation();
    System.out.println(varobj.greeting());
    System.out.println(varobj.sum());
    System.out.println(varobj.division());
	}

}
