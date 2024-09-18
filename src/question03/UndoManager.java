package question03;

public class UndoManager {
    private Actions head;

    public UndoManager() {
        this.head = null;
    }

    // Adiciona uma nova ação à lista
    public void addAction(String action) {
        Actions newAction = new Actions(action);

        if (head == null) {
            head = newAction;
        } else {
            newAction.setNext(head);
            head = newAction;
        }
    }

    // Desfaz a última ação realizada
    public String undoAction() {
        if (head == null) {
            return "Nenhuma ação para desfazer.";
        }

        String undoneAction = head.getAction();
        head = head.getNext();
        return "Ação desfeita: " + undoneAction;
    }

    // Exibe todas as ações na lista
    public void displayActions() {
        if (head == null) {
            System.out.println("Nenhuma ação registrada.");
            return;
        }

        Actions current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}
