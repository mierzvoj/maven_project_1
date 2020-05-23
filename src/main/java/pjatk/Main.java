package pjatk;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Mark");
        Customer c3 = new Customer("Alice");
        Customer c4 = new Customer("Ben");
        Customer c5 = new Customer("Aisha");


        BooksCat bc1 = new BooksCat();
        for (int i = 1; i < 6; i++) {
            bc1.catAddPos("Book", i);
        }
        System.out.println(bc1.findAllBooks());

        bc1.booksBorrowing(2, "Mark");
        System.out.println(bc1.findAllBooks());

        bc1.booksReturning("John", "Book");
        System.out.println(bc1.findAllBooks());
    }

}
