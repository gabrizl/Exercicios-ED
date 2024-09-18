package question07;

public class PrintQueue {
    private PrintJob front;
    private PrintJob rear;

    public PrintQueue() {
        this.front = null;
        this.rear = null;
    }

    // Adiciona um novo trabalho de impressão à fila
    public void enqueue(String documentName) {
        PrintJob newPrintJob = new PrintJob(documentName);

        if (rear != null) {
            rear.setNext(newPrintJob);
        }
        rear = newPrintJob;
        if (front == null) {
            front = newPrintJob;
        }
    }

    // Remove e retorna o próximo trabalho de impressão da fila
    public PrintJob dequeue() {
        if (front == null) {
            return null;
        }
        PrintJob nextPrintJob = front;
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return nextPrintJob;
    }

    // Exibe todos os trabalhos de impressão na fila
    public void displayQueue() {
        if (front == null) {
            System.out.println("A fila está vazia.");
            return;
        }
        PrintJob current = front;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}

