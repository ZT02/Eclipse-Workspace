package lagerort;
public class WassersaeuleSelected implements Selectable<Jacke> {
	
		private int saeule;
		
		public WassersaeuleSelected(int saeule) {
			this.saeule = saeule;
		}
		
		public boolean isSelected(Jacke j ) {
			return (saeule == j.wassersaeule )? true : false;
		}

}
