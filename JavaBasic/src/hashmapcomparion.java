import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class hashmapcomparion {

	public static void main(String[] args) {

		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("A", "100");
		map1.put("B", "200");
		map1.put("C", "300");


		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("A", "100");
		map2.put("B", "200");
		map2.put("C", "300");
		map2.put("D", "300");

		HashSet<String> unic = new HashSet<String>(map1.keySet());
		unic.addAll(map2.keySet());
		System.out.println(unic);
		unic.removeAll(map1.keySet());
		System.out.println(unic);
		Iterator<Entry<String, String>> a = map1.entrySet().iterator();
		//contain, containall, retain, retain all, clear
		while (a.hasNext()){
			Map.Entry se = (Map.Entry)a.next();
			String s = (String) se.getKey();
			String v = (String) se.getValue();

		}
	

	
	}

}
