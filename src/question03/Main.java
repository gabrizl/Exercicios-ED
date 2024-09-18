package question03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UndoManager undoManager = new UndoManager();

        while (true) {
            System.out.println("\nEditor de Texto - Sistema de Reversão");
            System.out.println("1. Realizar Ação");
            System.out.println("2. Desfazer Ação");
            System.out.println("3. Exibir Ações");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (choice) {
                case 1:
                    System.out.print("Digite a ação: ");
                    String action = scanner.nextLine();
                    undoManager.addAction(action);
                    break;
                case 2:
                    System.out.println(undoManager.undoAction());
                    break;
                case 3:
                    undoManager.displayActions();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
