/*
 * Errechnung des BMI-Wertes
 * bmi= Körpergewicht/Körpergröße ²
 * forschleife
 */
class arrayverwenden {

	public static void main(String[] args) {
	
		double groesse = .51;
		System.out.println("gewicht\t, groesse\t, bmi\t");
		double[] gewicht = {4.0,4.2,4.4,4.6,4.8,5.0,5.2,5.4,5.6,5.8,6.0,6.2,6.4,6.6,6.8,};
		for(int index=0; index < 15; index++) {
			
				double bmi = gewicht[index] / (groesse*groesse);
				
				
				System.out.printf(
						" %.2f\t%.2f\t%.2f\t", gewicht[index], groesse, bmi);
				
				
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

