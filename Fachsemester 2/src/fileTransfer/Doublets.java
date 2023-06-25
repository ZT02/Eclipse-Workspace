package fileTransfer;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Doublets extends FTW{

	private List<File> filesDoubles;
	private List<File> directoriesDoubles;
	List<String> placeHolder;
	List<String> placeHolder2;
	public Doublets(String directory) {
		super(directory);
		// TODO Auto-generated constructor stub

		  directoriesDoubles = new LinkedList<File>();
		  filesDoubles = new LinkedList<File>();
		  placeHolder = new LinkedList<String>();
			placeHolder2 = new LinkedList<String>();
	}

	public void checkDoubles(File file) {
		if(checkMainPath(file))
			file = new File(getDirectory().getPath()+"/"+file.getName());
		
		List<File> hereFiles = Arrays.asList(file.listFiles());
		
		for(File e: hereFiles) {
			
			
			if(e.isFile()) {
				if(placeHolder.contains(e.getName())) {

				System.out.println("File Doppelt\n"+"Name: "+e.getName()+"\nPath: "+"Name: "+e.getPath());
				}
				else
				placeHolder.add(e.getName());
				
				
				
				atFile(e);
			}
			else if(e.isDirectory()) {
				if(placeHolder2.contains(e.getName())) {
					System.out.println("Directory Doppelt\n"+"Name: "+e.getName()+"\nPath: "+"Name: "+e.getPath());
				}
					else
				placeHolder2.add(e.getName());
				
					
				enterDir(e);
				
			}
			else {
				leaveDir(e);
			}
			
			
		}
			
	}
	
	public void enterDir(File d) {
		checkDoubles(d);
	}
	
	public void leaveDir(File d) {
		checkDoubles(d.getParentFile());
	}
	public static void main(String[] args) {
		Doublets fc = new Doublets("C:/Users/Studying Markus L/Documents");
		fc.checkDoubles(new File("dummy"));
	
		
		
	}
	
}
