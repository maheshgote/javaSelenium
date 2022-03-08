import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streamexample {
	
	public static void main(String args[]) {
		
		
		List<String> names = Arrays.asList("cup",null,"tea", "ravi","ajit");
		List<String> namesfilter = new ArrayList<String>();
		namesfilter = names.stream().filter(s-> s!=null).collect(Collectors.toList());
		System.out.println(namesfilter);
		
		namesfilter = namesfilter.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(namesfilter);
		namesfilter.stream().forEach(e->System.out.println(e));
		
	}

}
