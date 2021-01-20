
public class Selection {
	//if
	//ternary     ?:  --> condition?exp1:exp2
	//switch
	
	public static void main(String args[]){
		//if else
		int a=9;
		if(a%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
	//nested if
	int b=0;
	if(b==0)
		System.out.println("zero");
	else if(b%2==0)
		System.out.println("even");
	else
		System.out.println("odd");
	
	//ternary operator
	
	int i=5,j=0;
	j=i>6?1:2;
	System.out.println(j);
	
	//switch
	
	String n="abc";
	switch(n) {
	case "abc":
		System.out.println("Three");
		break;
	case "b":
		System.out.println("four");
		break;
	case "c":
		System.out.println("seven");
		
	}
	
	
}

}
