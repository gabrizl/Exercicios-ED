package question08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProcessQueue processQueue = new ProcessQueue();

        while (true) {
            System.out.println("\nSistema de Gerenciamento de Processos");
            System.out.println("1. Adicionar Processo");
            System.out.println("2. Executar Próximo Processo");
            System.out.println("3. Exibir Fila de Processos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (choice) {
                case 1:
                    System.out.print("Digite o nome do processo: ");
                    String processName = scanner.nextLine();
                    processQueue.enqueue(processName);
                    break;
                case 2:
                    Process nextProcess = processQueue.dequeue();
                    if (nextProcess != null) {
                        System.out.println("Executando processo: " + nextProcess.getProcessName());
                    } else {
                        System.out.println("Nenhum processo na fila.");
                    }
                    break;
                case 3:
                    processQueue.displayQueue();
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
