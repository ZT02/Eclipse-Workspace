package lambda;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {
	
	public static void applyAndPrint(Integer a, Integer b, Function<Integer, Integer> f) {
		List<Integer> l = new LinkedList<Integer>();
		List<Integer> l2 = new LinkedList<Integer>();
		for(int i = 0; i<=(Math.max(a, b)-Math.min(a, b)); i++) {
			l.add(Math.min(a, b)+i);
		}
	
		
		for(Integer e : l) {
			l2.add(f.apply(e));
		}
	
		
		
		
		l2.forEach(s->System.out.println(s + ""));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		applyAndPrint(2, 5, x->x*x);
	}

}
