//whenever we call a subclass it calls the constructor of subclass and also superclass

class A{
	public A() {
		System.out.println("in a");
	}
	public A(int i) {
		System.out.println("int a  param");
	}
}
class B extends A{
	public B() {
		System.out.println("in b");
	}
	public B(int i) {
		super(i);
		System.out.println("int b param");
	}
	
}
public class SuperMethod {

	public static void main(String[] args) {
		B b=new B(4);
		

	}

}
