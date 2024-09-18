package question04;

public class Editor {
    private Actions current;

    public Editor() {
        this.current = null;
    }

    // Adiciona uma nova ação à lista
    public void addAction(String action) {
        Actions newAction = new Actions(action);

        if (current != null) {
            current.setNext(newAction);
            newAction.setPrev(current);
        }

        current = newAction;
    }

    // Desfaz a última ação realizada
    public String undo() {
        if (current == null) {
            return "Nenhuma ação para desfazer.";
        }

        String undoneAction = current.getAction();
        current = current.getPrev();
        return "Ação desfeita: " + undoneAction;
    }

    // Refaz a última ação desfeita
    public String redo() {
        if (current == null || current.getNext() == null) {
            return "Nenhuma ação para refazer.";
        }

        current = current.getNext();
        return "Ação refeita: " + current.getAction();
    }

    // Exibe todas as ações na lista
    public void displayActions() {
        Actions start = current;
        while (start != null && start.getPrev() != null) {
            start = start.getPrev();
        }

        while (start != null) {
            System.out.println(start);
            start = start.getNext();
        }
    }
}
