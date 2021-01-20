

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling {

	public static void main(String[] args) throws IOException {
	try {
		int arr[]=new int[4];
		//arr[5]=6;
		int n=0;
		int m=6;
		int res=n/m;
		if(res==0)
			throw new MyException("Zero exception");
		System.out.println("output is "+res);
	}
	catch(MyException e) {
		System.out.println("error "+e);
	}
	catch(ArithmeticException e) {
		System.err.println("error");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.err.println("out");
	}
	finally {
		System.out.println("bye");
	}
	int n=0;
//	try with resource---> is used to close the resource even it is not followed by catch and finally
//	try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
//		n=Integer.parseInt(br.readLine());
//	}
	}

}

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}
