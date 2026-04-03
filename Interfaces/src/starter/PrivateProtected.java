package starter;
/**

 * Create a PRIVATE or PROTECTED interface and print the values as above scenario
 * Create an interface with private, public and protected fields
 * Create an interface with static final variable
 */
interface priProtected{
	static int n = 121;
	final static int m = 111;
	public int num = 1121;
}
public class PrivateProtected implements priProtected{
	public static void main(String[] args) {
		
		System.out.println(priProtected.n + " " + priProtected.num + " " + priProtected.m);
	}
}
/* NOTE :
1. Interface in Java is similar to class but, it contains only abstract methods and
   fields which are final and static.

2. If the members of the interface are private you cannot provide implementation to
   the methods or, cannot access the fields of it in the implementing class.

3. The protected members can be accessed in the same class or,the class inheriting it.
   But, we do not inherit an interface we will implement it.

 */