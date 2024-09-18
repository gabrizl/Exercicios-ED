package question02;

public class URL_List {
    private String url;
    private URL_List next;

    public URL_List(String url) {
        this.url = url;
        this.next = null;
    }

    public String getUrl() {
        return url;
    }

    public URL_List getNext() {
        return next;
    }

    public void setNext(URL_List next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return url;
    }
}

