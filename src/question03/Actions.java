package question03;

public class Actions {
    private String action;
    private Actions next;

    public Actions(String action) {
        this.action = action;
        this.next = null;
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

    @Override
    public String toString() {
        return action;
    }
}
