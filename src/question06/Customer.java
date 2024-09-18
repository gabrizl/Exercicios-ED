package question06;

public class Customer {
    private String name;
    private Customer next;

    public Customer(String name) {
        this.name = name;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public Customer getNext() {
        return next;
    }

    public void setNext(Customer next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "'}";
    }
}
