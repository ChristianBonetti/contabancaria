package conta;

import java.util.Scanner;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    
    public static int lerNumeroConta() {
        System.out.print("Digite o número da conta: ");
        return scanner.nextInt();
    }
    
    public static float lerValor() {
        System.out.print("Digite o valor: ");
        return scanner.nextFloat();
    }
}