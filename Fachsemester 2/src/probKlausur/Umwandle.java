package probKlausur;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Umwandle {
	
	
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("usage Umwandle <input filename> <output filename>");
			System.exit(1);}
		try{BufferedReader br = new BufferedReader(new FileReader(args[0]));
			BufferedWriter bw = new BufferedWriter(new FileWriter(args[1])); 
			
			
			for(int c; (c = br.read()) != -1;) {
				if(c == 'X') 
					bw.write(" ");
					
				else if(c == ' ')
					bw.write("X");
				else
					bw.write(c);
			
				
			}
			br.close();
			bw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}