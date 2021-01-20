//thread-->unit of a process

//uses
//all different codes
//asynchronous request
//web applications
//gaming

//methods--- start(),wait(),notify(),sleep() usually in milliseconds(2s-2000ms)

//class Hi extends Thread{
//	public void run() {
//		for(int i=0;i<5;i++) {
//		System.out.println("hi");
//		try {Thread.sleep(500);}catch(Exception e) {};
//		
//		}
//	}
//}
//
//class Hello extends Thread{
//	public void run() {
//		for(int i=0;i<5;i++) {
//		System.out.println("hello");
//		try {Thread.sleep(500);}catch(Exception e) {};
//		
//		}
//	}
//}
//
//
//public class MultiThreading {
//
//	public static void main(String[] args) {
//		
//		Hi h1=new Hi();
//		Hello h2=new Hello();
//		
//		Thread t=new Thread();
//		h1.start();
//		try {t.sleep(10);}catch(Exception e) {};
//		h2.start();
//		
//	
//	}
//
//}




//using interfaces

//class Hi implements Runnable{
//	public void run() {
//		for(int i=0;i<5;i++) {
//		System.out.println("hi");
//		try {Thread.sleep(500);}catch(Exception e) {};
//		
//		}
//	}
//}
//
//class Hello implements Runnable{
//	public void run() {
//		for(int i=0;i<5;i++) {
//		System.out.println("hello");
//		try {Thread.sleep(500);}catch(Exception e) {};
//		
//		}
//	}
//}
//
//
//public class MultiThreading {
//
//	public static void main(String[] args) {
//		
//		Runnable h1=new Hi();
//		Runnable h2=new Hello();
//		
//		Thread t1=new Thread(h1);
//		Thread t2=new Thread(h2);
//		
//		t1.start();
//		try {Thread.sleep(10);}catch(Exception e) {};
//		t2.start();
//		
//	
//	}
//
//}
//
// the above code can also be written as below  


public class MultiThreading {

	public static void main(String[] args) throws Exception {
		
		Runnable h1=() ->{
				for(int i=0;i<5;i++) {
				System.out.println("hi");
				try {Thread.sleep(500);}catch(Exception e) {};
				
				}
		};
		Runnable h2=() -> {
				for(int i=0;i<5;i++) {
				System.out.println("hello");
				try {Thread.sleep(500);}catch(Exception e) {};
				}
		};
		
		Thread t1=new Thread(h1);
		Thread t2=new Thread(h2);
		
		//we can give name to the thread using get and set
		//t1.setName("hi thread");
		//System.out.println(t1.getName());
		
		// we can give priority
//		t2.setPriority(1);
//		System.out.println(t2.getPriority());
//		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {};
		t2.start();
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		System.out.println("bye");
		System.out.println(t1.isAlive());
	}
}

//join and alive method
//join will wait for completing and joining all the threads and then prints the remaining
//isalive is used to check whether the thread is alive or not





