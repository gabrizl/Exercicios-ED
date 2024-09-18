package question04;

public class Actions {
    private String action;
    private Actions next;
    private Actions prev;

    public Actions(String action) {
        this.action = action;
        this.next = null;
        this.prev = null;
    }

    public String getAction() {
        return action;
    }

    public Actions getNext() {
        return next;
    }

    public void setNext(Actions next) {
        this.next = next;
    }

    public Actions getPrev() {
        return prev;
    }

    public void setPrev(Actions prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return action;
    }
}
