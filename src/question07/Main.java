package question07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintQueue printQueue = new PrintQueue();

        while (true) {
            System.out.println("\nSistema de Gerenciamento de Impressões");
            System.out.println("1. Adicionar Trabalho de Impressão");
            System.out.println("2. Processar Próximo Trabalho de Impressão");
            System.out.println("3. Exibir Fila de Trabalhos de Impressão");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (choice) {
                case 1:
                    System.out.print("Digite o nome do documento: ");
                    String documentName = scanner.nextLine();
                    printQueue.enqueue(documentName);
                    break;
                case 2:
                    PrintJob nextPrintJob = printQueue.dequeue();
                    if (nextPrintJob != null) {
                        System.out.println("Processando trabalho de impressão: " + nextPrintJob.getDocumentName());
                    } else {
                        System.out.println("Nenhum trabalho de impressão na fila.");
                    }
                    break;
                case 3:
                    printQueue.displayQueue();
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
