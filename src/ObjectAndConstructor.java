class Calci{
	int n1;
	int n2;
	
	
	//constructor overloading
	public Calci() {
		
	}
	
	public Calci(int number1) {
		n1=number1;
		
	}
	
	public Calci(int n1,int n2) {
		this.n1=n1;
		this.n2=n2;
		
	}
	
	//method overloading
	public void add(int n1,int n2) {
		System.out.println(n1+n2);
		
		}
	
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}
public class ObjectAndConstructor{
	public static void main(String args[]) {
			Calci cal=new Calci();
			cal.add(3,4);
			cal.add(1, 2, 3);
			
	}
	
	
	/*
	 * constructor
	 * 1.Member method
	 * same as class name
	 * no return type
	 * used to allocate memory
	 * 
	 * same constructor with different parameters is known as constructor overloading*/

}
