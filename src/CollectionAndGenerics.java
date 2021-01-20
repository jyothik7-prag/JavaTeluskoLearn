import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//collection -->concept
//Collection -->interface
//Collections -->class

//list,set,map
//list - duplicates are allowed
//set- dupli not allowed and unordered whereas treeset is ordered set
//map will have key and value
public class CollectionAndGenerics {

	public static void main(String[] args) {
//		Collection c=new ArrayList();
//		c.add(4);
//		c.add(5);
//		c.add(6);
//		System.out.println(c);
//		
		// iterator to fetch the values
		
//		Iterator it=c.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
		//List c=new ArrayList();
		List<Integer> c=new ArrayList<>();
		
		c.add(4);
		c.add(5);
		c.add(6);
		//System.out.println(c);
		Collections.sort(c);
		Collections.reverse(c);
		for(Integer o:c)
			System.out.println(o);
		
	}

}
