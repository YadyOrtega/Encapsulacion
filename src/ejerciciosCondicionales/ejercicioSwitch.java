package ejerciciosCondicionales;

import java.util.Scanner;

public class ejercicioSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la estación (Invierno, Verano, Primavera, Otoño)");
		String  estaciones = sc.nextLine();

		switch(estaciones) {
		case "Invierno":
			System.out.println("Estamos en Invierno");
			break;
		case "Verano":
			System.out.println("Estamos en Verano");
			break;
		case "Otoño":
			System.out.println("Estamos en Otoño");
			break;
		case "Primavera":
			System.out.println("Estamos en Primavera");
			break;
		default:
			System.out.println("No corresponde a ninguna estación");
		}

	}

}



