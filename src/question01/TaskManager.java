package question01;

public class TaskManager {
    private Task head;

    public TaskManager() {
        this.head = null;
    }

    // Adiciona uma nova tarefa à lista
    public void addTask(String name) {
        Task newTask = new Task(name);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newTask);
        }
    }

    // Remove uma tarefa da lista pelo nome
    public void removeTask(String name) {
        if (head == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        if (head.getName().equals(name)) {
            head = head.getNext();
            return;
        }

        Task current = head;
        Task previous = null;
        while (current != null && !current.getName().equals(name)) {
            previous = current;
            current = current.getNext();
        }

        if (current == null) {
            System.out.println("Tarefa não encontrada.");
            return;
        }

        previous.setNext(current.getNext());
    }

    // Marca uma tarefa como concluída pelo nome
    public void markTaskAsCompleted(String name) {
        Task current = head;
        while (current != null) {
            if (current.getName().equals(name)) {
                current.setCompleted(true);
                return;
            }
            current = current.getNext();
        }
        System.out.println("Tarefa não encontrada.");
    }

    // Exibe todas as tarefas
    public void displayTasks() {
        if (head == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}

