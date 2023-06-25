package exception;
import java.text.DateFormat;
import java.text.ParseException;

class Birthday {
    private String theDay;

    public Birthday(String s) throws InvalidBirthdayException {
        this.theDay = s;
        try {
            checkDay(s);

        }
        //fängt Exception aus checkday auf und wirft eine InvalidBirthdayException
        catch (InvalidBirthdayException e) {
            throw new InvalidBirthdayException();
        }
    }

        public void checkDay(String s) throws InvalidBirthdayException {

            DateFormat df = DateFormat.getDateInstance(); //"Gets the date formatter with the default formatting stylefor the default FORMAT locale"
            df.setLenient(false); //Datum soll streng sein, dh wird exakt überprüft. Ist nicht nachlässig.
            try {
            df.parse(s); //überprüft Zeichen für zeichen, ob das Datum gültig ist.
            }
            //parse Error kann enstehen, dieser wird abgefangen und ein InvalidBirthday Exception geworfen, diese Exception wird nach "public Birthday" weitergegeben und diese zu TestBirthday, wo sie ausgewertet wird.
            catch(ParseException e) {
                throw new InvalidBirthdayException();
            }
        }


        class InvalidBirthdayException extends Exception { //BirthdayException. Kann auch in einer extra Datei angelegt werden.

            public InvalidBirthdayException() {
                super();

            }
        }
}