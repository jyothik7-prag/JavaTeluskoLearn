//final keyword is used in 3 places
//variables
//methods
//class

class X{
	final int DAY=10;
	//when using final keyword we cannot give value anywhere
	public X() {
		
	}
	
	public final void show() {
		//when using final in method we cannot use that method anywhere
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X x=new X();
		System.out.println(x.DAY);
		
	}

}
