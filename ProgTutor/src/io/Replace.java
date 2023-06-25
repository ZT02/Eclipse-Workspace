package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Replace {
	
	static void replace(String s) {
		String text = "";
		try(BufferedReader br = new BufferedReader(new FileReader(s));
			BufferedWriter bw = new BufferedWriter(new FileWriter("Smiley.txt"));
				) {
			
			List<String> lines = new LinkedList<String>();
			
			lines = br.lines().collect(Collectors.toList());
			for(int i = 0; i<lines.size(); i++) {
				for(int x = 0; x<lines.get(i).length();x++)
					text +=lines.get(i).charAt(x)+" ";
				text+="\n";}
			
			
			text = text.replace("0", " ");
			text = text.replace("1", "o");
			text = text.replace("2", "*");
			text = text.replace("3", "|");
			bw.write(text);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
	public static void main(String[] args) {
		replace("./src/io/file.txt");
	}
	
}
