package utilities;



public class Utilities {

	public static <E> String print(E[] e) {
		String s = "[";
		if(e.length == 0)
			return null;
		for(int i = 0; i<e.length-1;i++)
			s+=e[i]+",";
		
		s+=e[e.length-1];
		s+="]";
		return s;
	}
	
	public static<E extends Comparable<? super E>> void sortiere(E[] e) {
		   // array sorting
	      // loop to control number of passes
	      for ( int pass = 0; pass < e.length; pass++ ) {

	         // loop to control number of comparisons
	         for ( int element = 0; element < e.length - 1 - pass; element++ ) {

	            // compare side-by-side elements and swap them if
	            // first element is greater than second element
	            if ( (e[ element ].compareTo(e[ element + 1 ]) >0) ) {

	                E temp;  // temporary holding area for swap

	                temp = e[ element ];
	                e[ element ] = e[ element +1 ];
	                e[ element+1 ] = temp;
	            }
	         }  // end loop to control comparisons

	      }  // end loop to control passes
	      
	}

	
	public static<E> E noNull(E...e) {
	for(E t : e)
		if(t!=null)
			return t;
	
	return null;
		
	}
	public static void main(String[] args) {
		String[] test = {"Markus", "Hallo"};	
		System.out.println(print(test));
		sortiere(test);
		System.out.println(print(test));
//		System.out.print(noNull());
		}
	
		
}
