package question07;

public class PrintJob {
    private String documentName;
    private PrintJob next;

    public PrintJob(String documentName) {
        this.documentName = documentName;
        this.next = null;
    }

    public String getDocumentName() {
        return documentName;
    }

    public PrintJob getNext() {
        return next;
    }

    public void setNext(PrintJob next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "PrintJob{documentName='" + documentName + "'}";
    }
}

