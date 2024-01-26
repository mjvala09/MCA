// Collection Demo Iterator
import java.util.*;
class CollectionDemoIerator{
	public static void main(String[] args) {
		int index = 0;
		Collection<Object> c = new ArrayList<Object>();
		c.add(100);
		c.add(true);
		c.add(123456789123L);
		c.add(3.14);
		c.add('A');
		c.add("Atmiya University");
		System.out.println(""+c);
		Iterator i = c.iterator();
		while(i.hasNext()){
			System.out.println(index + " " + i.next());
			index++;
		}
	}
}