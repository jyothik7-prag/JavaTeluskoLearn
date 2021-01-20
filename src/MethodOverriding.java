class A1{
	public void show() {
		System.out.println("A");
	}
}
class B1 extends A1{
	public void show() {
		super.show(); 				//method overriding the super class 
		System.out.println("B");
	}
	
}
class C1 extends A1{
	public void show() {
		super.show(); 				//method overriding the super class 
		System.out.println("C");
	}
	
}


public class MethodOverriding {

	public static void main(String[] args) {
		//B1 b=new B1();
		//b.show();
		A1 a1=new B1(); 	//runtime polymorphism
		a1.show();
		
		a1=new C1();
		a1.show();		//dynamic method dispatch

	}

}
