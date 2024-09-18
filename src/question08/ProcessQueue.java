package question08;

public class ProcessQueue {
    private Process front;
    private Process rear;

    public ProcessQueue() {
        this.front = null;
        this.rear = null;
    }

    // Adiciona um novo processo à fila
    public void enqueue(String processName) {
        Process newProcess = new Process(processName);

        if (rear != null) {
            rear.setNext(newProcess);
        }
        rear = newProcess;
        if (front == null) {
            front = newProcess;
        }
    }

    // Remove e retorna o próximo processo da fila
    public Process dequeue() {
        if (front == null) {
            return null;
        }
        Process nextProcess = front;
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return nextProcess;
    }

    // Exibe todos os processos na fila
    public void displayQueue() {
        if (front == null) {
            System.out.println("A fila está vazia.");
            return;
        }
        Process current = front;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}
