//interface is same like abstract class but the diff is In abstract class we can have normal methods and
//abstract methods whereas in interface we can only have abstract methods
//we use IMPLEMETS keyword to implement the interface 
//We can implement multiple intefaces but not inheritance
//All the methods in ineterface are by default abstract
//We cannot create obj of interface but we can use it as a reference
//1) interface Writer{
//	void write();
//}
//class Pen implements Writer{
//
//	@Override
//	public void write() {
//		// TODO Auto-generated method stub
//		System.out.println("pen");
//		
//	}
//	
//}
//class pencil implements Writer{
//
//	@Override
//	public void write() {
//		// TODO Auto-generated method stub
//		System.out.println("pencil");
//		
//	}
//	
//	
//}
//class Kit{
//	public void write(Pen p) {
//		p.write();
//	}
//}
//public class Interface {
//	Kit k=new Kit();
//	Writer p=new Pen();
//	Writer pc=new pencil();
//}

//2)interface Abc{
//	void show();
//}
//
//class implimentor implements Abc{
//	public void show() {
//		System.out.println("show");
//	}
//}
//
//public class Interface{
//	public static void main(String[] args) {
//		Abc a=new implimentor();
//		a.show();
//	}
//}

//anonymous class is a class which doesnot have a name


interface Abc{
	void show();
}


public class Interface{
	public static void main(String[] args) {
		Abc a=new Abc() {
			
			@Override
			public void show() {
				System.out.println("show");
				
			}
		};
		a.show();
	}
}

