//package demo;

class Demo9Implementation {

    String greeting(){
        String hello ="Cordial greetings";
        return hello;
    }

    double fraction(){
        double a=9.4, b=3.66767, c;
        return c = a/b;
    }

}

public class Demo9 {
	public static void main(String[] args) {
	HelloWorldImplementation varobj = new HelloWorldImplementation();
    System.out.println(varobj.greeting());
    System.out.println(varobj.fraction());
	}

}
