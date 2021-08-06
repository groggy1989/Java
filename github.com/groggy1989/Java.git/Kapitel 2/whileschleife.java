/*
 * Errechnung des BMI-Wertes
 * bmi= Körpergewicht/Körpergröße ²
 * forschleife
 */
class whileschleife {

	public static void main(String[] args) {
	
		double groesse = .51;
		double gewicht = 4.0;
		do {
			
				System.out.println("gewicht\tgroesse\tbmi\t");
				double bmi = gewicht / (groesse*groesse);
				System.out.printf(" %.2f\t%.2f\t%.2f\t", gewicht, groesse, bmi);
						int i=((bmi >=25) ? 1 : ((bmi < 18)? -1 : 0));
						switch (i) {
						case 0:
							System.out.println("normal");
							break;
						case 1:
							System.out.println("bergewichtig");
							break;
						case -1:
							System.out.println("Untergewichtig");
						default:
							System.out.println("Fehler");
							break;
									
						}
						gewicht +=  +0.2;
			} while( gewicht < 7.0);
		}
	}

