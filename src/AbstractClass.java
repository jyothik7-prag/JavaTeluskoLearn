abstract class Human{			//abstract class
	public abstract void eat();
	public void walk() {
		
	}
}

class Man extends Human{		//concrete class
	 public void eat() {
		 
	 }
	
}

class printer{
	public void show(Number i) {	//number will accept int,float,double
		System.out.println(i);
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human h=new Man();
		
	}

}
