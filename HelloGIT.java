//package demo;

public class HelloGIT {
    static String  w, s;
	
	public static void main(String[] args) {
		System.out.println("Hello, GIT!");
		System.out.println(HelloGIT.work());
	}
	
	public void sum(int a, int b) {
		int c = a+b;
		System.out.println(a + " + " + b + " is " + c);
	}

    public static String work(){
		s="working";
        return s;
    }

    public void study(){
		System.out.println("studying");
    }

}
