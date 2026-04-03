package inheritancePractice;

/**
 * 1. A, B and C are classes
 * 2. A is a super class. B is a subclass of A. C is a subclass of B.
 * 3. Create three methods in each class, 2 methods are specific to each class and third
 * method (override method) should be in all three Classes A, B and C
 * 4. Create a class with main method. Create an object for each class A, B and C in main
 * method and call every method of each class using its own object/instance.
 * 5. Call an overridden method with super class reference to B and C class’s objects
 * 6. Runtime Polymorphism with Data Members/Instance variables, Repeat the above
 * process only for data member
 */

	class A{
		int n = 1;
		void methodA1() {
			System.out.println("This is Class A method 1");
		}
		void methodA2() {
			System.out.println("This is Class A method 2");
		}
		void method3() {
			System.out.println("This is Class A");
		}
	}
	class B extends A{
		int n = 2;
		void methodB1() {
			System.out.println("This is Class B method 1");
		}
		void methodB2() {
			System.out.println("This is Class B method 2");
		}
		void method3() {
			System.out.println("This is Class B");
		}
	}
	class C extends B{
		int n = 3;
		void methodC1() {
			System.out.println("This is Class C method 1");
		}
		void methodC2() {
			System.out.println("This is Class C method 2");
		}
		void method3() {
			System.out.println("This is Class C");
		}
	}
public class Inheritance {
	public static void main(String[] args) {
		//Object for class A
		A a = new A();
		a.methodA1();
		a.methodA2();
		a.method3();
		//Object for class B
		B b = new B();
		b.methodB1();
		b.methodB2();
		b.method3();
		//Object for class B
		C c = new C();
		c.methodC1();
		c.methodC2();
		c.method3();
		//Overriden classes execution
		A overe;
		overe = new B();
		overe.method3();
		overe = new C();
		overe.method3();
		//polumorphism
		A rtp;
		rtp = new A();
		System.out.println(rtp.n);
		rtp = new B();
		System.out.println(rtp.n);
		rtp = new C();
		System.out.println(rtp.n);
	}
}
