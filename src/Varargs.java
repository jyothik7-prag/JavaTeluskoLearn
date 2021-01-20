class Calci1{
	public int add(int ... n) {   //variable length arguments
		int sum=0;
		for(int i:n) {
			sum+=i;
		}
		return sum;
	}
}

public class Varargs {

	//stands for variable arguments or variable length arguments
	public static void main(String[] args) {
		Calci1 c=new Calci1();
		System.out.println(c.add(1,2,3,4,5,6));
		
	}

}
