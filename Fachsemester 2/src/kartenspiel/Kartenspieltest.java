package kartenspiel;

public class Kartenspieltest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Kartenspiel first = new Kartenspiel(5);

        System.out.println(first.toString());
        first.mischen();
        System.out.println(first.toString()); 
        first.kartenspielHinzufuegen(new Kartenspiel(2));
        System.out.println(first.toString());
    }

}