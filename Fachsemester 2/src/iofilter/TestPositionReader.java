package iofilter;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class TestPositionReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s =
				 String.format("Zeile 1\n\t…\n\t**\t\n\nEnde\n");
				Reader r = new StringReader(s);
				PositionReader pr = new PositionReader(r);
				for (int chr = pr.read(); chr >= 0; chr = pr.read()) {
				 System.out.printf("%c(%d, %d)",(char) chr, pr.line(), pr.column());
				}
				 try {
					pr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
	}
}
