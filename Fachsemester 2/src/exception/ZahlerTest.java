package exception;

public class ZahlerTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Zaehler first = new Zaehler();
		while(true){
			first.zaehlen();
			Thread.sleep(1000);
		}
	}

}
