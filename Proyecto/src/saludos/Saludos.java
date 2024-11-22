package saludos;

import java.util.Scanner;

public class Saludos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String nombre = input.nextLine();
		System.out.print("Apellido: ");
		String apellido = input.nextLine();
		
		System.out.println("Hola, " + nombre + " " + apellido );

		input.close();
	}

}
