package question05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hand hand = new Hand();

        while (true) {
            System.out.println("\nJogo de Cartas");
            System.out.println("1. Adicionar Carta");
            System.out.println("2. Remover Carta");
            System.out.println("3. Mover Carta");
            System.out.println("4. Exibir Mão");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (choice) {
                case 1:
                    System.out.print("Digite o valor da carta: ");
                    String rank = scanner.nextLine();
                    System.out.print("Digite o naipe da carta: ");
                    String suit = scanner.nextLine();
                    hand.addCard(rank, suit);
                    break;
                case 2:
                    System.out.print("Digite o valor da carta a remover: ");
                    String rankToRemove = scanner.nextLine();
                    System.out.print("Digite o naipe da carta a remover: ");
                    String suitToRemove = scanner.nextLine();
                    hand.removeCard(rankToRemove, suitToRemove);
                    break;
                case 3:
                    System.out.print("Digite o valor da carta a mover: ");
                    String rankToMove = scanner.nextLine();
                    System.out.print("Digite o naipe da carta a mover: ");
                    String suitToMove = scanner.nextLine();
                    System.out.print("Digite a nova posição (0 para o início): ");
                    int newPosition = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    hand.moveCard(rankToMove, suitToMove, newPosition);
                    break;
                case 4:
                    hand.displayHand();
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
