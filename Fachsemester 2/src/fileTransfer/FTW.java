package fileTransfer;

import java.io.File;
import java.util.Arrays;

import java.util.List;

public class FTW {

	
	protected int count;
	protected int intDepth;
	protected int maxDepth;

	protected File directory;
	
	public FTW(String directory) {
		this.directory = new File(directory);
		this.count = 0;
		this.intDepth = 1;
		this.maxDepth = 1;
	}

	public void enterDir(File d) {
		walk(d);
	}
	
	public void leaveDir(File d) {
		walk(d.getParentFile());
	}
	
	public void atFile(File f) {
		count++;
	}
	public int count() {
		return this.count;
	}
	
	public void walk(File file) {
		if(checkMainPath(file))
			file = new File(directory.getPath()+"/"+file.getName());
		
		List<File> hereFiles = Arrays.asList(file.listFiles());
		
		for(File e: hereFiles) {
			
			
			 if(e.isFile()) {
				atFile(e);
			}
			else if(e.isDirectory()) {
				enterDir(e);
				
			}
			else {
				leaveDir(e);
			}
			
			
		}
			
	}
	//dir zeug
	protected void enterDir2(File d) {
		atDir(d);
		dirDepth(d);
		
	}
	
	protected void leaveDir2(File d) {
		dirDepth(d.getParentFile());
	}
	
	protected void atDir(File f) {
		intDepth++;
	}
	protected int maxDepth() {
		return maxDepth;
	}
	
	protected void dirDepth(File file) {
		if(checkMainPath(file))
			file = new File(directory.getPath()+"/"+file.getName());
		
		
		List<File> hereFiles = Arrays.asList(file.listFiles());
		for(File e: hereFiles) {
			
			 if(e.isFile()) {
				atFile(e);
			}
			else if(e.isDirectory()) {
				enterDir2(e);
				if(checkMainPath(file)) {
					maxDepth = (intDepth >= maxDepth)  ? intDepth: maxDepth;
				intDepth = 1; }
				
				
			}
			else {
				leaveDir2(e);
			}
			
			
		}
		System.out.println(file.getParent());
		
		
	}
	
	protected boolean checkMainPath(File file) {
		return (new File(directory.getPath()+"/"+file.getName()).exists());
	}
	protected File getDirectory() {
		return directory;
	}
	
	public static void main(String args[]) {
		FTW fc = new FTW("C:/Users/Studying Markus L/Documents");
		fc.walk(new File("dummy"));
		System.out.println(fc.count());
		fc.dirDepth(new File("dummy"));
		System.out.println(fc.maxDepth());
		
	}
	
	
}
