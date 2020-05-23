package pjatk;

public class Book {

    @BookTitle(key = "Test this")
    String title;
    int catNo;

    public Book(String title, int id) {
        this.title = title;
        this.catNo = id;
    }


    public String getTitle() {
        return title;
    }

    public int getId() {
        return catNo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.catNo = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", catNo=" + catNo +
                '}';
    }
}
