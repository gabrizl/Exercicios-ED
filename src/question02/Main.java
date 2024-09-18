package question02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho máximo do histórico: ");
        int maxSize = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        BrowserHistory browserHistory = new BrowserHistory(maxSize);

        while (true) {
            System.out.println("\nHistórico de Navegação");
            System.out.println("1. Adicionar URL");
            System.out.println("2. Exibir Histórico");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (choice) {
                case 1:
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    browserHistory.addURL(url);
                    break;
                case 2:
                    browserHistory.displayHistory();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
