class Student{
	int studId;
	String studName;
	static String teacher;
	
	//static variables are same for all the objects
	//static variables are different for different objects
	//cannot use non-static variable in static block
	static {				//when you load a class
		teacher="john";
	}
	
	public Student() {		//when you create an object
		studId=100;
		studName="s1";
		
	}
	
	public void show() {
		System.out.println(studId+":"+studName+":"+teacher);
	}
}
public class StaticKeyword {

	public static void main(String[] args) {
		
		Student s1=new Student();
		
		
		Student s2=new Student();
		
		s1.show();
		s2.show();
		
		
		
	}
}
