package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class variables_numericas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);		
		
		//Se pregunta los números a generar:
		System.out.println("Indique cuantos números desea generar: ");
		int num = sc.nextInt();
		
		//Se crea un Array:
		int[] listaNum = new int [num];
		
		//Se general los números aleatorios y se guardan en el Array:
		Random rnd = new Random();
		for(int i = 0; i < num; i++) {
			
			int numero = rnd.nextInt();
			
			listaNum[i] = numero;			
		}
		
		//Se crean los contadores de números para determinar cuántos hay de cada:
		int contadorNegativo = 0;
		int contadorPositivo = 0;
		int contador0 = 0;
		
		for(int i = 0; i < listaNum.length; i++) {
			
			if (listaNum[i] < 0)
				contadorNegativo++;
			
			else if (listaNum[i] > 0)
				contadorPositivo++;
			
			else if (listaNum[i] == 0)
				contador0++;
		}
		
		//Se imprimen por pantalla:
		System.out.println("Números mayores de 0: " + contadorPositivo);
		System.out.println("Números 0: " + contador0);
		System.out.println("Números menores de 0: " + contadorNegativo);
		
		sc.close();
	}
}