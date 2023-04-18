package conta;

import java.util.Scanner;

public abstract class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Opção 3");
            System.out.println("4 - Sair");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Opção 1 selecionada");
                    break;
                case 2:
                    System.out.println("Opção 2 selecionada");
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada");
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}