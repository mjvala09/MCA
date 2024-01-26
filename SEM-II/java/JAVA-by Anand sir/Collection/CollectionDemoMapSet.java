// Collection Demo Map
import java.util.*;
class CollectionDemoMapSet{
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1,"MCA");
		m.put(2,"MSCIT");
		m.put(3,"BCA");
		m.put(2,"BSCIT");
		m.put(2,"MBA");
		m.put(3,"BBA");

		System.out.println(m);

		Set s = m.entrySet();	
		
		Iterator i = s.iterator();			
		while(i.hasNext()){
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+" : "+me.getValue());
		}
	}
}