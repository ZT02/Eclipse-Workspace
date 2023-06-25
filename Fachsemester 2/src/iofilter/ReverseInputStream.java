package iofilter;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;


public class ReverseInputStream extends FilterInputStream{

	protected ReverseInputStream(InputStream in) {
		super(in);
		this.in = reverseInput(in);
	}
	
	public int read() {
	int output = 0;
	
	try {
		if(in.available()==0)
			return -1;
		
		output = in.readNBytes(1)[0];
	}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
		
	}
	
	
	
	public InputStream reverseInput(InputStream in) {
		byte[] allBytes;
		byte[] reverseBytes = null;
		try {
			allBytes = in.readAllBytes();
			reverseBytes = new byte[allBytes.length];
			for(int i = 0, x = allBytes.length-1; i<allBytes.length; i++, x--) {
				reverseBytes[i] = allBytes[x];
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ByteArrayInputStream(reverseBytes);
		
	}
	
	
	
	
	public int read(byte[] array, int input, int input2) {
		int counter = 0;
		try {
			if(in.available()==0)
				return -1;
			
			counter = in.readNBytes(array, input2, counter);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return counter;
	}

	
	
	
	
}
