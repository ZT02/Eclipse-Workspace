package iofilter;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class PositionReader extends FilterReader {
	private int lineCounter;
	private int columnCounter;
	
	public static final int TAB = 8;
	
	
	protected PositionReader(Reader in) {
		super(in);
		this.lineCounter = 1;
		this.columnCounter = 0;
	}

	public int read() {
		int output = 0;
		try {
			output= colCount(super.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
	}
	
	public int read(char[] buffer, int start, int count) {
		int howManyRead = 0;
		int readVal = 0;
		try {
			
			
			in.skip(start);

			while (count > 0) {
					readVal = read();
				if(readVal == -1)
					return readVal;
				
				
					count--;
				howManyRead++;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return howManyRead;
	}
	private int colCount(int input) {
		if(input<0) {
			
		}
		
		else if(input == '\n' || input == '\r') {
			lineCounter++;
			columnCounter=0;
		}
		else if(input == '\t') {
			columnCounter = (columnCounter/TAB +1)*TAB;
		}
		else
			columnCounter++;
		
		
		
		return input;
		
		
		
	}
	
	public int column() {
		return columnCounter;
	}

	public int line() {
		return lineCounter;
	}
	

}
