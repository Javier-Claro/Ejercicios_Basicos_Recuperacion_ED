package ejercicios;

import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    int numero1, numero2, minimo, maximo;
	    
	    // Solicitud de datos al usuario:
	    System.out.print("Introduzca el primer número: ");
	    numero1 = sc.nextInt();
	    System.out.print("Introduzca el segundo número: ");
	    numero2 = sc.nextInt();
	    
	    // Ordenamos los valores en mayor y menor
	    if (numero1 < numero2) {
	      minimo = numero1;
	      maximo = numero2;
	    } else {
	      minimo = numero2;
	      maximo = numero1;
	    }
	    
	    // Realización del ciclo para hacer cálculos y mostrar en pantalla
	    for (int i=minimo+1; i < maximo; i++){
	      if (i%2==0){
	        System.out.println(i); 
	      }
	    }
	    sc.close();
	  }		
	}