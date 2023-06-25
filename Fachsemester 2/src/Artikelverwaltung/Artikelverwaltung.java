package Artikelverwaltung;


import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.Arrays;

import java.util.LinkedList;


import Artikelverwaltung.Kleidungsstück.Farbe;


public class Artikelverwaltung implements Serializable {
	private LinkedList<Artikel> artikel;
	public Artikelverwaltung() {
		this.artikel = new LinkedList<Artikel>();
	}
	
	
	public Artikelverwaltung(Artikel[] artikels) {
		this.artikel = new LinkedList<Artikel>(Arrays.asList(artikels));
	}
//Exceptionhandling nicht vergessen wie in aufgabe
//	public void write(String filename) {
//	
//		
//		 try(FileOutputStream fos = new FileOutputStream(filename);
//				 ObjectOutputStream oos = new ObjectOutputStream(fos);) {
//			
//					oos.writeObject(artikel);
//				
//		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//
//	}
	public static Farbe convert(String fname) {
			if(fname.equals("SCHWARZ")) {
			return Farbe.SCHWARZ;
		}
		else if (fname.equals("GRÜN")) {
			return Farbe.GRÜN;
		}
		
		else if (fname.equals("ROT")) {
			return Farbe.ROT;
		}
		
		else if (fname.equals("BLAU")) {
			return Farbe.BLAU;
		}
		
		else if (fname.equals("GRAU")) {
			return Farbe.GRAU;
		}
		else
			return null;
			
		
	}
//	@SuppressWarnings("unchecked")
//	public void  read(String filename) {
//
//	
//	try(FileInputStream fos = new FileInputStream(filename);
//			 ObjectInputStream oos = new ObjectInputStream(fos);) {
//		
//			artikel = (LinkedList<Artikel>) oos.readObject();
//		
//			
//		
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	} catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	}
	
	
	public static Artikel[] create(int anz) {
		Artikel[] artikel = new Artikel[anz];
		
		String[] bez = { "Levis", "Wrangler", "Denim",
				"Boss" };
		int[] groesse = { 34, 36, 38, 40, 42, 44 };
		int[] schritt = { 340, 360, 380, 400, 420, 440 };

		for (int i = 0; i < anz; i++) {
			String bezeich = bez[i % bez.length];

			Kleidungsstück.Farbe f = Farbe.values()[i % Kleidungsstück.Farbe.values().length];
			int gr = groesse[i % groesse.length];
			int s = schritt[i % schritt.length];
			Kleidungsstück k = new Jeans(gr, f, bezeich, s);
			artikel[i] = k;

		}
		return artikel;
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < artikel.size(); i++) {
			if (i < artikel.size() - 1)
				s += artikel.get(i).toString() + "\n";
			else
				s += artikel.get(i).toString() + "\n";
		}

		return s;
	}

	

}
