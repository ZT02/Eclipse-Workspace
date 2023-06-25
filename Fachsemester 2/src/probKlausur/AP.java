package probKlausur;

import java.util.Arrays;



public class AP{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static final ArrayProcessor max = (double[] array) -> {return Arrays.stream(array).reduce((x,y) -> (x>y ? x: y)).getAsDouble();};
	public static final ArrayProcessor min = (double[] array) -> {return Arrays.stream(array).reduce((x,y) -> (x<y ? x: y)).getAsDouble();};
	public static final ArrayProcessor sum = (double[] array) -> {return Arrays.stream(array).reduce((x,y) -> (x+y)).getAsDouble();};
	public static final ArrayProcessor average = (double[] array) -> { return Arrays.stream(array).reduce(0, (d, p)->d+p/array.length);};

	public static ArrayProcessor counter(double value) {
		return null;
		
		
		
	}
}
