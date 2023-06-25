package zählerlisten;

public class CountListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final CountList<Integer> cl = new CountList<Integer>();
		cl.add(2);
		cl.add(5);
		cl.add(2);
		cl.add(5);
		cl.add(3);
		
		System.out.println(cl.count(2));
		System.out.println(cl.unique());
		System.out.println(cl.counts());
	}

}
