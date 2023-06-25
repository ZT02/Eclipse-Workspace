package fahrzeug;

public class FahrzeugSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ENTKOMMENTIEREN -> markieren -> strg + shift + forward slash
		// 1. Test: beschleunigung, fahren
		Pkw pkw1 = new Pkw("Golf");
		PkwOAbs pkw2 = new PkwOAbs("Volkwagen");
		Lkw Mercedes = new Lkw("Mercedes", 0, 6);
		Lkw MercedesVollBeladen = new Lkw("MCB", 6, 6);
//		pkw1.beschleunigen(15);
//		pkw2.beschleunigen(15);
//		Mercedes.beschleunigen(30);
//		MercedesVollBeladen.beschleunigen(30);
//		pkw1.fahren(3/4);
//		pkw2.fahren(3/4);
//		Mercedes.fahren(0.5);
//		MercedesVollBeladen.fahren(0.5);

//		System.out.println(pkw1.getGeschwindigkeit() + " " + pkw2.getGeschwindigkeit()+ " " + Mercedes.getGeschwindigkeit()+ " " + MercedesVollBeladen.getGeschwindigkeit());
//		System.out.println(pkw1.getPosition()+ " " +pkw2.getPosition()+ " " +Mercedes.getPosition()+ " " +MercedesVollBeladen.getPosition());

		// 2. Test: bis Maximalgeschwindigkeit beschleunigen und überprüfen ob Fahrzeuge
		// Maximalgeschwindigkeit fahren
//		pkw1.beschleunigen(50);
//		pkw2.beschleunigen(60);
//		Mercedes.beschleunigen(60);
//		MercedesVollBeladen.beschleunigen(60);

//		System.out.println(pkw1.getGeschwindigkeit() + " " + pkw2.getGeschwindigkeit()+ " " + Mercedes.getGeschwindigkeit()+ " " + MercedesVollBeladen.getGeschwindigkeit());

		// 3. Test: 20 Minuten fahren -> Strecke ausgeben

//		pkw1.beschleunigen(50);
//		pkw2.beschleunigen(60);
//		Mercedes.beschleunigen(60);
//		MercedesVollBeladen.beschleunigen(60);
//		pkw1.fahren(20);
//		pkw2.fahren(20);
//		Mercedes.fahren(20);
//		MercedesVollBeladen.fahren(20);
//		System.out.println(pkw1.getPosition()+ " " +pkw2.getPosition()+ " " +Mercedes.getPosition()+ " " +MercedesVollBeladen.getPosition());

		// 4. Test: Beschleunigen, fahren, stoppen und immer Position ausgeben

		pkw1.beschleunigen(50);
		pkw2.beschleunigen(60);
		Mercedes.beschleunigen(60);
		MercedesVollBeladen.beschleunigen(80);
		System.out.println(pkw1.getPosition() + " " + pkw2.getPosition() + " " + Mercedes.getPosition() + " "
				+ MercedesVollBeladen.getPosition());
		pkw1.fahren(60);
		pkw2.fahren(60);
		Mercedes.fahren(60);
		MercedesVollBeladen.fahren(60);
		System.out.println(pkw1.getPosition() + " " + pkw2.getPosition() + " " + Mercedes.getPosition() + " "
				+ MercedesVollBeladen.getPosition());
		System.out.println(
				pkw1.stoppen() + " " + pkw2.stoppen() + " " + Mercedes.stoppen() + " " + MercedesVollBeladen.stoppen());
		System.out.println(pkw1.getPosition() + " " + pkw2.getPosition() + " " + Mercedes.getPosition() + " "
				+ MercedesVollBeladen.getPosition());

	}

}
