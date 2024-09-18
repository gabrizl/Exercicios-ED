package question01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\nGerenciador de Tarefas");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Exibir Tarefas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (choice) {
                case 1:
                    System.out.print("Nome da Tarefa: ");
                    String name = scanner.nextLine();
                    taskManager.addTask(name);
                    break;
                case 2:
                    System.out.print("Nome da Tarefa a Remover: ");
                    String nameToRemove = scanner.nextLine();
                    taskManager.removeTask(nameToRemove);
                    break;
                case 3:
                    System.out.print("Nome da Tarefa a Marcar como Concluída: ");
                    String nameToMark = scanner.nextLine();
                    taskManager.markTaskAsCompleted(nameToMark);
                    break;
                case 4:
                    taskManager.displayTasks();
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

