package question02;

public class BrowserHistory {
    private URL_List head;
    private int size;
    private int maxSize;

    public BrowserHistory(int maxSize) {
        this.head = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    // Adiciona uma nova URL ao histórico
    public void addURL(String url) {
        URL_List newURL = new URL_List(url);

        if (head == null) {
            head = newURL;
        } else {
            URL_List current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newURL);
        }
        size++;

        if (size > maxSize) {
            removeOldestURL();
        }
    }

    // Remove a URL mais antiga do histórico
    private void removeOldestURL() {
        if (head != null) {
            head = head.getNext();
            size--;
        }
    }

    // Exibe todas as URLs no histórico
    public void displayHistory() {
        if (head == null) {
            System.out.println("O histórico está vazio.");
            return;
        }

        URL_List current = head;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }
}
