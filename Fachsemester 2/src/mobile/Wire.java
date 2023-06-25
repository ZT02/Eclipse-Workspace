package mobile;

public class Wire implements Mobile{
	
	private final Mobile m1;
	private final Mobile m2;
	
	private double distanceFirst;
	private double distanceSecond;
	
	public Wire(Mobile m1, Mobile m2, double slength) {
		this.m1 = m1;
		this.m2 = m2;
		distanceFirst = 0;
		distanceSecond = slength;
	}
	public double weight() {
		return m1.weight() + m2.weight();
		
	}
	
    public void balance() {
    	m1.balance();
    	m2.balance();
    	final double complLength = distanceFirst + distanceSecond;
    	
    	distanceFirst = m2.weight()*complLength/(m1.weight()+m2.weight());
    	distanceSecond = m1.weight()*complLength/(m1.weight()+m2.weight());
    }
    
    public String toString() {
    	return String.format("Mobile[%g:%s, %g:%s]", distanceFirst, m1.toString(), distanceSecond, m2.toString());
    }
    
    
	
}
