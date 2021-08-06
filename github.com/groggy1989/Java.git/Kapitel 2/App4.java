/*
 * Errechnung des BMI-Wertes
 * bmi= Körpergewicht/Körpergröße ²
 */
class App4 {

	public static void main(String[] args) {
		double gewicht = 6.0;
		double groesse = .51;
		double bmi = gewicht / (groesse*groesse);
		
		System.out.printf(
				"Das Gewicht %.2f kg und die Größe %.2f m ergeben den BMI-Wert %.2f", gewicht, groesse, bmi);
		boolean übergewichtig = bmi >= 25;
		boolean untergewichtig = (bmi < 18);
		boolean normalgewichtig = !übergewichtig & !untergewichtig;
		if(normalgewichtig) {
			System.out.println("\nKatze hat normal Gewicht");
		} else if(übergewichtig) {
			System.out.println("\nKatze ist übergewichtig ");
		} else if (untergewichtig){
			System.out.println("\nKatze ist nicht übergewichtigt");
		} 
	}

}
