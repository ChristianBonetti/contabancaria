package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
int numero,somaPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o numero");
		numero = leia.nextInt();
		
		while(numero != 0) {
			
			
			if(numero % 2 == 0) {
				somaPar += numero;
			} else {
				contImpar++;
				}
			System.out.println("\nEntre com um número");
			numero = leia.nextInt();
		}	
		
		System.out.println("\nSomatório dos números pares foi de:"+somaPar);
		System.out.println("\nQuantidade de números ímpares foi de:"+contImpar);
		
		
		

	}

}
