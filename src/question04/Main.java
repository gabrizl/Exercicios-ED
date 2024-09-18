package question04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Editor editor = new Editor();

        while (true) {
            System.out.println("\nEditor de Texto - Sistema de Desfazer/Refazer");
            System.out.println("1. Realizar Ação");
            System.out.println("2. Desfazer Ação");
            System.out.println("3. Refazer Ação");
            System.out.println("4. Exibir Ações");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (choice) {
                case 1:
                    System.out.print("Digite a ação: ");
                    String action = scanner.nextLine();
                    editor.addAction(action);
                    break;
                case 2:
                    System.out.println(editor.undo());
                    break;
                case 3:
                    System.out.println(editor.redo());
                    break;
                case 4:
                    editor.displayActions();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
