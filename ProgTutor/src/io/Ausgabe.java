package io;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class Ausgabe {

	static void ausgabe(String file) {
		BufferedReader br;
		try {
			 br = new BufferedReader(new FileReader(file));
			
			List<String> allLines = br.lines().collect(Collectors.toList());
			
			
			allLines.forEach(d->System.out.println(d));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
