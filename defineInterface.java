package interfaceTest;

public interface defineInterface {
	  int a=1;
	static void worker() {
		System.out.println("this is static method worker"+a);
	}
	default void eat(){
		System.out.println("this is default method eat");
	}
	default void sleep(){
		System.out.println("this is default method sleep");
	}
}
