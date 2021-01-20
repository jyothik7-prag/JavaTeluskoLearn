class Outer{
	
	public void show() {
		
	}
	
	//inner class
	//member class
	//static class
	//anonymous class
	class Inner{
		public void display() {
			System.out.println("In display");
		}
	}
}


public class InnerClass {
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.show();
		Outer.Inner inner = outer.new Inner();
		inner.display();
		
		//if static then
		 //Outer.Inner inner = new Outer.Inner();
		
	}

}
