package copoutcomp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader isr1 = new FileReader(args[0]);
			FileReader isr2 = new FileReader(args[1]);
			BufferedReader br1 = new BufferedReader(isr1);
			BufferedReader br2 = new BufferedReader(isr2);
			List<String> fileone = br1.lines().collect(Collectors.toList());
			List<String> filetwo = br2.lines().collect(Collectors.toList());
			
			if(fileone.size() != filetwo.size()) {
				System.out.println(fileone.size() +"\n"+filetwo.size());
				System.out.println("false");
				System.exit(1);
		}
			else if(fileone.size() == 0 && filetwo.size() == 0) {
				System.out.println("true");
				System.exit(1);
		}
			else {
				for(int i = 0; i< fileone.size(); i++) 
					if(!fileone.get(i).equals(filetwo.get(i))) {
						System.out.println("false");
						System.exit(1);
					}
								
			}
		System.out.println("true");
		
			br1.close();
			br2.close();
			
		}
		catch(IOException e) {
			System.out.println(e.fillInStackTrace());
		}
		
	
	
	}

}
