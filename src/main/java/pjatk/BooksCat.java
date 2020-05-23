package pjatk;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class BooksCat {
    String title;
    int catNo;

    public BooksCat() {
        this.catNo = catNo;

    }

    public String getTitle() {
        return title;
    }

    public int getCatNo() {
        return catNo;
    }

    public List<Book> getCat1() {
        return cat1;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCatNo(int catNo) {
        this.catNo = catNo;
    }

    public void setCat1(List<Book> cat1) {
        this.cat1 = cat1;
    }

    private List<Book> cat1 = new ArrayList<>();

    public List<Book> findAllBooks() {
        return this.cat1;

    }

    public void catAddPos(String title, int catNo) {

        Book book1 = new Book(title, catNo);
        cat1.add(book1);

    }

    public Optional<Book> findById(int catNo) {
        return cat1.stream().filter(book -> book.getId() == catNo).findFirst();

    }

    public void booksBorrowing(int catNo, String name) {
        Optional<Book> byCatNo = findById(catNo);
        cat1.remove(catNo);
        System.out.println("There is your " + byCatNo.get() + " Mister " + " " + name);
    }


    public void booksReturning(String name, String title) {
        Book book1 = new Book(title, cat1.size() + 2);
        cat1.add(book1);
        System.out.println("Thank you " + name + " for books returning");

    }
}