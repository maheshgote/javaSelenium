
public class StringReverse {

	public static void main(String[] args) {
		String s="";
		String name = "maheshgote";
		for(int i = name.length()-1; i>=0; i--) {
			
			System.out.println(name.charAt(i));
			s= s + name.charAt(i);
			
			System.out.println(s);
		}

	}

}
