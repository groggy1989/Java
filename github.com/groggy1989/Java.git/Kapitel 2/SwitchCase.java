/*
 * Errechnung des BMI-Wertes
 * bmi= Körpergewicht/Körpergröße ²
 * switch-case
 */
class SwitchCase {

	public static void main(String[] args) {
		double gewicht = 6.0;
		double groesse = .51;
		double bmi = gewicht / (groesse*groesse);
		
		System.out.printf(
				"Das Gewicht %.2f kg und die Größe %.2f m ergeben den BMI-Wert %.2f", gewicht, groesse, bmi);
		
		
				int i=((bmi >=25) ? 1 : ((bmi < 18)? -1 : 0));
				switch (i) {
				case 0:
					System.out.println("\nKatzes Gewicht ist normal");
					break;
				case 1:
					System.out.println("\nKatzes Gewicht ist Übergewichtig");
					break;
				case -1:
					System.out.println("\nKatzes Gewicht ist Untergewichtig");
					break;
				default:
					System.out.println("\nFehler");
					break;
									
				}
		
	}

}
