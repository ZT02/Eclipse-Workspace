package woertersammlung;
import java.util.*;

public class WordColl {
	
	private Vector<Word> 	words;
	private int 			wordcounts;
	
	
	class Word {
		String 	s;
		int 	count;
		
		Word(String s) {
			this.s = s;
			this.count = 1;
		}
	}
	
	public WordColl(String... sentences) {
		words = new Vector<Word>(sentences.length,80);
		
		append(sentences);
		
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
	
	public void append(String...sentences){
		for (String s : sentences) {
			StringTokenizer st = new StringTokenizer(s);
		     while (st.hasMoreTokens()) {
		         insert(st.nextToken());
		     }
		}
	}
	
	public String top() {

		Word wordTop = words.elementAt(0);

		if (wordTop != null) {
			for (Word w : words) {
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
		result += String.format("%-20s | %2s\n","Word","count");
		result += "-----------------------------------------\n";
		
		for (Word w: words) {
			result += String.format("%-20s | %2d\n",w.s,w.count);
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

		for (Word w : words) {
			if (w.s.equals(s))
				return w;

		}
		return null;
	}

}
