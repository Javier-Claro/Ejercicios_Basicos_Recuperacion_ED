package ejercicios;

import java.util.Scanner;

public class Caracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String letra;
		
		//Se pregunta un carácter del teclado:
		do {
		System.out.println("Dime un carácter (espacio = salir): ");
		letra = sc.next();
		
		//Se determina si es o no es una vocal:
		if ((letra == "a")|| (letra =="e")|| (letra =="i")|| (letra =="o")|| (letra =="u"))
		System.out.println("VOCAL");
		
		else
			System.out.println("NO VOCAL");
		}while (letra != " ");
		
		System.out.println("Cierre del programa.");
		sc.close();
	}
}