package copoutcomp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Cat {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		// in kommentar altes Programm
		try {
			FileReader file = new FileReader(args[0]);
		//	FileInputStream in = new FileInputStream(args[0]);
			BufferedReader br = new BufferedReader(file);
		//	ByteArrayOutputStream bs = new ByteArrayOutputStream();
			boolean check = false;
			
			List<String> linesR= br.lines().collect(Collectors.toList());
			
			for(int i = 0; i<linesR.size();++i) {
				if(i%40 ==0 && check == true) {
				System.out.println("Please continue with return");
				sc.nextLine();
				check = false;
				}
				else { 
					System.out.println(linesR.get(i));
				}
				if(i%40 == 0) {
					check = true;
				}
			}
			
//			linesR.forEach(d->System.out.println(d));
		sc.close();
		br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
//			int len;
//			byte[] buff = new byte[1024];
//			while((len = in.read(buff))>0) {
//				bs.write(buff, 0, len);
//				lnr.read(buff);
//				System.out.println(bs.toString("UTF-8"));
//			}
//			
//		
//			in.close();
//			bs.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
//ENDE
