
public class Iteration {
	
	//while,do while,for, for-each

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while
		int i=1;//initialisation
		while(i<=5) {//condition
			System.out.println(i);
			i++;//increment
		}
		
		//do while
		
		int j=10;//initialisation
		do {//condition
			System.out.println("hii");
			i++;//increment
		}
		while(j<=6);
		
		//for
		
		for(int k=0;k<5;k++) {
			System.out.println("welcome");
		}
		
		//nested for
		for(int a=1;a<4;a++) {
			for(int b=1;b<=4;b++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		//break and continue
		//continue
		for(int x=1;x<5;x++) {
			if(x==3) {
				continue;
			}
			System.out.println(x);
		}
		
		//break
		for(int x=1;x<5;x++) {
			if(x==3) {
				break;
			}
			System.out.println(x);
		}
		
	}

}
