import java.util.HashMap;

public class hashexample {

	public static void main(String[] args) {
		HashMap<String, String> sub = new HashMap<String,String>();
		sub.put("mahesh", "100");
		sub.put("abc", "400");
		sub.put("cba", "400");
		sub.put("acb", "200");
		sub.put("bca", "500");
		sub.put("cab", "400");
		sub.put("ramesh", "400");
		sub.put("karan", "400");
		sub.put(null, "400");
		sub.put("kiran", "400");
		
		System.out.println(sub.get("mahesh"));
		

	}

}
