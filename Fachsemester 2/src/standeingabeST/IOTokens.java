package standeingabeST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class IOTokens {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	
		System.out.println("Bitte eingeben: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StreamTokenizer st = new StreamTokenizer(br);
//		st.ordinaryChar('!'); nachschauen was das macht
		st.ordinaryChar('.');
		int currentToken = st.nextToken();
		while(currentToken != StreamTokenizer.TT_EOF) {
			if(st.ttype == StreamTokenizer.TT_WORD) {
				System.out.println("Wort: "+st.sval);
			}
			else if(st.ttype == StreamTokenizer.TT_NUMBER) {
				System.out.println("Zahl: "+st.nval);
			}
			else if(st.ttype == '!' || st.ttype == ',') {
				System.out.println("Zeichen: " + (char) currentToken);
			}
			currentToken = st.nextToken();
		}
	


		
	}


}
