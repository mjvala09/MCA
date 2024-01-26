// Generic Collection
import java.util.*;
class CollectionGeneric{
	public static void printCollection(Collection<Number> c){
		for(Object o : c){
			System.out.println(o);	
		}
	}
	public static void main(String[] args) {
		Collection<Number> c = new ArrayList<Number>();
		c.add(100);
		c.add(123456789123L);
		c.add(3.14);
		c.add(5.50f);
		CollectionGeneric.printCollection(c);	
	}
}