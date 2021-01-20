
public class Wrapper {

	public static void main(String[] args) {
	int i=5;  	//primitive data type
	Integer ii=new Integer(5);    //wrapper class
	//Integer ii=new Integer(5);  //boxing (or) wrapping
	
	int j=ii.intValue();          //unboxing (or) unwrapping
	
	Integer value=i;             //autoboxing
	
	int k=value;                 //autounboxing
	
	String str="123";
	int res=Integer.parseInt(str);
	}

}
