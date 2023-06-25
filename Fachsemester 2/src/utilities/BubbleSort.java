// BubbleSort algorithm for sorting the array
package utilities;
public class BubbleSort{

   public static void main(String[] args)
   {
      int array[] = { 2000, 2, 45, 34, 100000, 345, 56, 78, 99 ,756,  999, 0,
       666, 2345, 7492, 22 };

      String output = "Data items in original order\n";

      // append original array values to String output
      for ( int counter = 0; counter < array.length; counter++ )
         output += "   " + array[ counter ];



      // array sorting
      // loop to control number of passes
      for ( int pass = 0; pass < array.length; pass++ ) {

         // loop to control number of comparisons
         for ( int element = 0; element < array.length - 1 - pass; element++ ) {

            // compare side-by-side elements and swap them if
            // first element is greater than second element
            if ( array[ element ] > array[ element + 1 ] ) {

                int temp;  // temporary holding area for swap

                temp = array[ element ];
                array[ element ] = array[ element +1 ];
                array[ element+1 ] = temp;
            }



         }  // end loop to control comparisons

      }  // end loop to control passes



       // output
      output += "\n\nData items in ascending order\n";

      // append sorted\ array values to String output
      for ( int counter = 0; counter < array.length; counter++ )
         output += "   " + array[ counter ];

      System.out.print(output);

   }  // end main method


}  // end class BubbleSort


