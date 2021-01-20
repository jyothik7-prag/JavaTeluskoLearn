//IS-A  , HAS-A
class Calculator{						//super,parent,base
	public int add(int i,int j) {
		return i+j;
	}
}

class Calculator1 extends Calculator{	//sub,child,base    // one level inheritance  //is-a 
	public int sub(int i,int j) {
		return i-j;
	}
}
class Calculator2 extends Calculator1{	//multilevel inheritance   //is-a 
	public int mul(int i,int j) {
		return i*j;
}
}
//multiple inheritance is not supported in java

public class Inheritance {                //has-a
	
	public static void main(String[] args) {
		Calculator2 c=new Calculator2();
		int res=c.add(5,4);
		int res1=c.sub(5,4);
		int res2=c.mul(5,4);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		
	}

}
