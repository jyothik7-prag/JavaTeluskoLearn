
public class FirstCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		int _$ab4d=10;   //int--- 4 bytes---32bits  
		double num=5.5;  //double--8 bytes
		float f=5.5f;    //float---4 bytes
		short s=5;       //short---2 bytes
		byte b=5;        //byte----1 byte
		long l=500000000l;//lonag--8 bytes
		char c='A';      //or
		char c1=65;      //ascii - Amnerican Standard Code For International Interchange
		c1++;
		System.out.println(c1);
		
		double d=5;       //implicit conversion
		int i=(int) 5.5;  //type casting
		System.out.println(d);
		System.out.println(i);
		
		// byte->(char,short)->int->long->float->double
		
		//NAMING CONVENTIONS
		//variables---studentname
		//constant----STUDENT_NAME
		//class-------StudentName
		//method------studentName()
		//constructor-StudentName()
		//interface---Runnable,Readable,Remote
		

	}

}
