package streamsganzezahlen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysAndStreams {
public static void main(String[] args) {
int[] values = { 2, 9, 5, 0, 3, 7, 1, 4, 8, 6 };

Integer[] result;
// display original values
System.out.printf("Original values: %s%n", Arrays.toString((values)));

// Ausgabe aller Werte von values in aufsteigender Reihenfolge 
System.out.println("Aufsteigende Reihenfolge"+ Arrays.toString(IntStream.of(values).sorted().toArray()));

// Ausgabe aller Werte in values, die größer als 4 sind
System.out.println("Größer 4"+ Arrays.toString(IntStream.of(values).filter(x->x>4).toArray()));


// Filtern von allen Werten in values, die größer als 4 sind, und
// sortierte diese anschließend
System.out.println("Größer 4 und sortiert"+ Arrays.toString(IntStream.of(values).filter(x->x>4).sorted().toArray()));


}
} // end class ArraysAndStreams