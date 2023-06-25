package zählerlisten;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class CountList<E> extends ArrayList<E>{
	
	protected List<E> liste;
	protected HashSet<E> sett;
	
	public CountList() {
		this.liste = new ArrayList<E>();
		this.sett = new HashSet<E>();
	}
	
	public boolean add(E element) {
		liste.add(element);
		return true;
	}
	public int count(E element) {
		int counter = 0;
		for(E e : liste)
		{
			if(e.equals(element))
			counter++;
		}
		return counter;
	}

	public int unique() {
		if(liste.size()==0)
			return 0;
		
		sett.addAll(liste);
		return sett.size();
		
	}

	public Map<E, Integer> counts() {
		Map<E, Integer> output = new HashMap<E, Integer>();
		
		if(liste.size()==0)
			return null;
		
		for(E e : sett)
		output.put(e, count(e));
		
		return output;
	}

}
