import java.util.function.*;
public class lambadaExpression {

	public static void main(String[] args) {
		Function<Integer, Integer> f = a->a*a;
		System.out.println("test "+f.apply(5));
		

	};

}
