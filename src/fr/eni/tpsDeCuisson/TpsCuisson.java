package fr.eni.tpsDeCuisson;

import java.util.Scanner;

public class TpsCuisson {
	final int BOEUF = 1;
	final int PORC = 2;

	final int BLEU = 1;
	final int A_POINT = 2;
	final int BIEN_CUIT = 3;

	static int typeViande;
	static int poidsViande;
	static int typeCuisson;

	public static void main(String[] args) {

		System.out.println(
				"Quel est le type de viande? : 1 pour boeuf ou 2 pour porc");
		typeViande = scanner();

		System.out.println("Quel est le poids de la viande en gramme?");
		poidsViande = scanner();

		System.out.println("Quel est le type de cuisson ?");
		System.out.println("1 bleu, 2 à point ou 3 bien cuit");
		typeCuisson = scanner();

		if (typeViande == 1) {
			switch (typeCuisson) {
				case 1 :
					System.out.println(poidsViande * 10 / 500 * 60
							+ " secondes de cuisson");
					break;

				case 2 :
					System.out.println(poidsViande * 17 / 500 * 60
							+ " secondes de cuisson");
					break;
				case 3 :
					System.out.println(poidsViande * 25 / 500 * 60
							+ " secondes de cuisson");
					break;
				default :
					System.out.println("erreur");
					break;
			}

		} else if (typeViande == 2) {
			switch (typeCuisson) {
				case 1 :
					System.out.println(poidsViande * 15 / 400 * 60
							+ " secondes de cuisson");
					break;

				case 2 :
					System.out.println(poidsViande * 25 / 400 * 60
							+ " secondes de cuisson");
					break;
				case 3 :
					System.out.println(poidsViande * 40 / 400 * 60
							+ " secondes de cuisson");
					break;
				default :
					System.out.println("erreur");
					break;
			}
		}
	}

	public static int scanner() {
		Scanner scanner = new Scanner(System.in);
		int saisie = scanner.nextInt();
		return saisie;
	}
}
