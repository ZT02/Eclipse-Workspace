package Artikelverwaltung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Artikelverwaltungstest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try(FileOutputStream fos = new FileOutputStream("Artikelverwaltung.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream("Artikelverwaltung.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			Artikelverwaltung a1 = new Artikelverwaltung(Artikelverwaltung.create(10));
			Artikelverwaltung a2 = new Artikelverwaltung();
			oos.writeObject(a1);
			a2 = (Artikelverwaltung) ois.readObject();
//			a1.write("Artikel.dat");
//			
//			a2.read("Artikel.dat");
			System.out.println(a2);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
