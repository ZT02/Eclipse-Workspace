package iofilter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;


public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = new ByteArrayInputStream("Abrakadabra".getBytes());
		is = new ReverseInputStream(is);
		byte[] buffer = new byte[4];
		
		
		for(int n = is.read(buffer, 0, buffer.length); n>=0; n = is.read(buffer, 0, buffer.length))
			System.out.println(new String(buffer, 0, n));
		
		
		
		
	}

}
