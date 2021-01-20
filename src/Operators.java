
public class Operators {
	
	//Arithmetic------  +,-,*,/,%
	//Bitwise
	//Relational
	//Logical

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=9,n=6;
		int add=m+n;
		int sub=m-n;
		int mul=m*n;
		int div=m/n;
		int quo=m&n;
		double div1=(double)m/n;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(div1);
		System.out.println(quo);
		
		n+=m;
		System.out.println(n);
		
		n++;//pre increment
		++n;//post
		m=n++;//first assigns and then increments
		System.out.println(m);
		System.out.println(n);
			

	}

}
