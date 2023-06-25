package probKlausur;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionList {

	public static List<String> transformedList(List<String> stringList, Function<String, String> p) {
		return stringList.stream().map(p).collect(Collectors.toList());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
