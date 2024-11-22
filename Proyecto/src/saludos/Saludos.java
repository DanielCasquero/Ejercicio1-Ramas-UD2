package saludos;

import java.util.Scanner;

public class Saludos {
	
	static final int HORA = 12;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nombre: ");
		String nombre = input.nextLine();
		System.out.print("Apellido: ");
		String apellido = input.nextLine();
		System.out.println("Introduzca la hora (formato 24h), sin introducir los minutos");
		int horaActual =input.nextInt();
		if (horaActual <= HORA) {
			System.out.println("Buenos dias " + nombre + " " + apellido);
		}else if (horaActual > HORA) {
			System.out.println("Buenos tardes " + nombre + " " + apellido);
		}

		
		System.out.println("Hola, " + nombre + " " + apellido );
		

		input.close();
	}

}
