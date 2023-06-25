package standeingabeST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aufga {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numberlist = new ArrayList<Integer>();
		for(int i = 1; i<6; i++) {
			
			System.out.println("Bitte " +i +". Zahl eingeben");
				numberlist.add(sc.nextInt());
			}
		int result = 0;
		for(int i : numberlist)
			result = result +i;
		sc.close();
		System.out.println(numberlist.get(0)+ " + " + numberlist.get(1)+ " + " + numberlist.get(2) + " + " + numberlist.get(3) + " + " + numberlist.get(4) + " = " +     result);
}	
	}
	
	
	
	
	
