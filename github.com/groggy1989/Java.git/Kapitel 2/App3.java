/*
 * Errechnung des BMI-Wertes
 * bmi= K�rpergewicht/K�rpergr��e �
 */
class App3 {

	public static void main(String[] args) {
		double gewicht = 6.0;
		double groesse = .51;
		double bmi = gewicht / (groesse*groesse);
		
		System.out.printf(
				"Das Gewicht %.2f kg und die Gr��e %.2f m ergeben den BMI-Wert %.2f", gewicht, groesse, bmi);
		boolean �bergewichtig = bmi >= 25;
		System.out.println("\nKatze ist �bergewichtig " + �bergewichtig);
	}

}
