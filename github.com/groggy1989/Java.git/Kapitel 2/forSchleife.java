/*
 * Errechnung des BMI-Wertes
 * bmi= Körpergewicht/Körpergröße ²
 * forschleife
 */
class forSchleife {

	public static void main(String[] args) {
	
		double groesse = .51;
		for(double gewicht = 4.0; gewicht < 7.0; gewicht = gewicht +0.2) {
			
				double bmi = gewicht / (groesse*groesse);
				
				System.out.println("gewicht\t, groesse\t, bmi\t");
				System.out.printf(
						" %.2f\t%.2f\t%.2f\t", gewicht, groesse, bmi);
				
				
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
							break;
						default:
							System.out.println("Fehler");
							break;
									
						}
			}
		}
	}

