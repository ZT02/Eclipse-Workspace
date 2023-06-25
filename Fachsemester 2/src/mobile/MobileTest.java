package mobile;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star a = new Star(2);
		Star b = new Star(4);
		GlitterStar c = new GlitterStar(9);
		
		Wire ab = new Wire(a,b,9);
		Wire abc = new Wire(ab, c, 10);
		
		abc.balance();
		System.out.println(abc);
		
		c.decorate();
		abc.balance();
		System.out.println(abc);
	}

}
