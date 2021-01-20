//Types of interfaces
//single abstract method --sam -->ony single abstract class
//normal -->contains many methods    ---> functional interface  -->lamda expression ---from scala language
//marker interface --> no methods are present     Ex: serializable


// abstract --> define and declare
// interface -> only declare
//1.8 can define methods in interface
interface Xyz{
	void show();
	//default methods in interface
	default void hai() {
		System.out.println("hai");
	}
}
class XyzImpl implements Xyz{

	@Override
	public void show() {
		System.out.println("view");
	}
	
}

public class FunctionalInterfaceAndLamdaExpressions {
	public static void main(String[] args) {
		Xyz xyz=()->System.out.println("show");
		xyz.show();
		
	}
	//if we create a variable in interface, it becomes a constant
	//We can also write static method  -> static void hai(){};
//Multiple interface issue can be solved by using super keyword
	
}
