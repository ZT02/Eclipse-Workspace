package woertersammlung;
import java.util.*;

public class WordCollUntyped {
	
	private Vector 	words;
	private int 	wordcounts;
	
	
	class Word {
		String 	s;
		int 	count;
		
		Word(String s) {
			this.s = s;
			this.count = 1;
		}
	}
	
	public WordCollUntyped(String... chapter) {
		words = new Vector(chapter.length,80);
		
		append(chapter);
		
	}
	
	public int size() { 
		return wordcounts;
	}
	
	public int count (String word) {
		Word w = included(word);
		if (w != null)
			return w.count;
		else 
			return 0;
		
	}
	
	public void append(String...chapter){
		for (String s : chapter) {
			StringTokenizer st = new StringTokenizer(s);
		     while (st.hasMoreTokens()) {
		         insert(st.nextToken());
		     }
		}
	}
	
	public String top() {

		Word wordTop = (Word) words.elementAt(0);

		if (wordTop != null) {
			for (Object o : words) {
				Word w = (Word) o;

				if (wordTop.count < w.count)
					wordTop = w;
			}
			return wordTop.s;
		}
		else
			return null;

	}
	
	public String toString() {
		String result="";
		result += result.format("%-20s | %2s\n","Word","count");
		result += "-----------------------------------------\n";
		
		for (Object o: words) {
			Word w = (Word)o;
			result += result.format("%-20s | %2d\n",w.s,w.count);
		}
		result += "-----------------------------------------\nTotal: " + wordcounts;
		return result;
		
	}
	
	private void insert(String s) {
		Word wo = included(s);
		
		if (wo != null) wo.count++;
		else {
			wo = new Word(s);
			words.add(wo);
		}
		wordcounts++;
		
		
	}
	
	private Word included(String s) {
		Word r;
		for (Object o : words) {
			String st = ((Word)o).s;
			if (st.equals(s)) {
				r = (Word) o;
				return r;
			}
		}
		return null;
	}

}
