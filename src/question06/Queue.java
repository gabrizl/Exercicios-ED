package question06;

public class Queue {
    private Customer front;
    private Customer rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    // Adiciona um novo cliente à fila
    public void enqueue(String name) {
        Customer newCustomer = new Customer(name);

        if (rear != null) {
            rear.setNext(newCustomer);
        }
        rear = newCustomer;
        if (front == null) {
            front = newCustomer;
        }
    }

    // Remove e retorna o próximo cliente da fila
    public Customer dequeue() {
        if (front == null) {
            return null;
        }
        Customer nextCustomer = front;
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return nextCustomer;
    }

    // Exibe todos os clientes na fila
    public void displayQueue() {
        if (front == null) {
            System.out.println("A fila está vazia.");
            return;
        }
        Customer current = front;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}
