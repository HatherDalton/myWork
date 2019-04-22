package inheritance;

public class BallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Basketball bob = new Basketball();
		System.out.println(bob.method1());
		System.out.println(bob.method2());
		System.out.println(bob.method3());
		System.out.println(bob.method4());

		Ball fred = new Basketball();
		System.out.println(fred.method1());
		System.out.println(fred.method2());
		System.out.println(fred.method4());
		/**
		 * System.out.println(fred.method3()); 
		 *      ^this doesn't work because the superclass
		 * object references the public methods in the superclass
		 **/
	}

}
