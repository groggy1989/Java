/*
 * Errechnung des BMI-Wertes
 * bmi= Körpergewicht/Körpergröße ²
 */
class BMI1 {

	public static void main(String[] args) {
		double gewicht = 6.0;
		double groesse = .51;
		double bmi = gewicht / (groesse*groesse);
		
		System.out.printf(
				"Das Gewicht %.2f kg und die Größe %.2f m ergeben den BMI-Wert %.2f", gewicht, groesse, bmi);
		
		
				System.out.println("\n" + ((bmi >=25) ? "Übergewichtig." : ((bmi < 18)? "Untergewichtig":"Normalgewichtig")));
				
			
			
	}

}
