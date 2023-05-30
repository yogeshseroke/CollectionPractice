package collectionPractice.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// HashMap...
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		
		System.out.println(map);
		
		for(int i=1; i<=map.size(); i++) {
			System.out.println(map.get(i));
		}
		
		map.put(4, new String("D"));
		map.put(5, new String("E"));
		map.put(6, new String("F"));
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		//LinkedHashMap...
		Map<String, Integer> me = new LinkedHashMap<>();
		
		me.put("Yogesh Seroke", 1);
		me.put("Akash Bairagi", 2);
		me.put("Yogesh Bhite", 3);
		me.put("Shivam Pal", 4);
		me.put("Raghav Dube", 5);
		me.put("Sumit Tiwari", 6);
		
		for(Map.Entry<String, Integer> m : me.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
		
		//TreeMap...
		
		Map<Integer, String> mt = new TreeMap<>();
		
		mt.put(2, "A");
		mt.put(3, "B");
		mt.put(1, "C");
		mt.put(4, "D");
		
		for(Map.Entry<Integer, String> m : mt.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		//update...
		mt.put(4, "E");
		System.out.println(mt);
		
		//remove...
		mt.remove(4);
		System.out.println(mt);
		
		//iterating through the Map...
		
		for(Map.Entry<String, Integer> m : me.entrySet()) {
			String key = m.getKey();
			
			Integer value = m.getValue();
			
			System.out.println(key+" "+value);
		}
		
		//sortedMap example...
		
		SortedMap<Integer, String> sm = new TreeMap<>();
		sm.put(3, "z");
		sm.put(1, "x");
		sm.put(2, "y");
		
		Set s = sm.entrySet();
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			Map.Entry m = (Map.Entry)i.next();
			
			int key = (int)m.getKey();
			String value = (String)m.getValue();
			
			System.out.println(key+" "+value);
		}
		
	}

}
