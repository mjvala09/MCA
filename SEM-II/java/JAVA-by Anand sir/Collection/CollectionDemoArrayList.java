// Collection Demo ArrayList
import java.util.*;
class CollectionDemoArrayList{
	public static void main(String[] args) {
		Collection<Object> c = new ArrayList<Object>();
		c.add(100);
		c.add(true);
		c.add(123456789123L);
		c.add(3.14);
		c.add('A');
		c.add("Atmiya University");

		System.out.println(c);
		System.out.println(c.size());
		c.remove(3.14);
		System.out.println(c);
		System.out.println(c.size());

		System.out.println(c.contains("Atmiya University"));

		System.out.println(c.isEmpty());
		c.clear();
		System.out.println(c.isEmpty());
		System.out.println(c);
	}
}