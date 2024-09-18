package question06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();

        while (true) {
            System.out.println("\nSimulador de Fila de Atendimento em um Banco");
            System.out.println("1. Adicionar Cliente à Fila");
            System.out.println("2. Chamar Próximo Cliente");
            System.out.println("3. Exibir Fila de Clientes");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (choice) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String name = scanner.nextLine();
                    queue.enqueue(name);
                    break;
                case 2:
                    Customer nextCustomer = queue.dequeue();
                    if (nextCustomer != null) {
                        System.out.println("Chamando próximo cliente: " + nextCustomer.getName());
                    } else {
                        System.out.println("Nenhum cliente na fila.");
                    }
                    break;
                case 3:
                    queue.displayQueue();
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
