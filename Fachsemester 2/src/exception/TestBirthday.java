package exception;

import java.util.Scanner;

import exception.Birthday.InvalidBirthdayException;

public class TestBirthday {

    public static void main(String[] args)  {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        // loop falls eingabe falsch ist, wird unterbrochen wenn Eingabe korrekt ist
        do { 

        System.out.println("Datum eingeben: ");
        try {
            //einlesen von Datum
            new Birthday(sc.next());
            check = false;
        } 
        catch (InvalidBirthdayException e) {
            //fängt die geworfenen exception aus dem try block auf, die von den methoden der "Birthday" klasse geworfen werden
            System.out.println("Ungültiges Datum \n");
        }
        }while(check);
        sc.close();
    }

}
