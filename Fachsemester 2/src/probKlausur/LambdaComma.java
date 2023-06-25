package probKlausur;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaComma {

	public static String getString(List<Integer> li) {
		return li.stream().map(d->((d%2==0) ? "e"+d : "o"+d)).collect(Collectors.joining(","));
				// -> diese Endung funktioniert auch:  reduce((x, d) ->(x+","+d)).get();
	}
	
	public static void main(String[] args) {
		List<Integer> i = new LinkedList<Integer>();
		i.add(4);
		i.add(5);
		i.add(7);
		i.add(8);
		i.add(9);
		i.add(10);
		i.add(1);
		System.out.println(getString(i));
		
	}
}
