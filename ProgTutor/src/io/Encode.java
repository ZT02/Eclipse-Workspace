package io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Das Tutorium hat sich gelohnt, da ihr Beide Zusammenhänge & Unklarheiten erklären könnt,"
				+ " dadurch ist das Hexenwerk namens Java verständlicher geworden. 10/10, würde die Prüfung nicht bestehen, um nochmal teilnehmen zu dürfen.";

	try(BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("./src/io/Bewertung101.bin"));) {
		
		for(int i = 0; i<s.length();i++) {
			if(!s.substring(i, i+1).equals(" ")) {
				bw.write((byte)'-'+(byte)s.charAt(i));
					
				
			}
			else
				bw.write((byte)' ');
		}
		
		
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	}

}
