import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    static final ArrayList<Book> bookList;
    private static final Scanner scanner;

    static {
        bookList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addBook() {
        System.out.println("Введите название книги:");
        String name = scanner.nextLine();

        System.out.println("Введите автора книги:");
        String author = scanner.nextLine();

        System.out.println("Введите год издания:");
        int year = scanner.nextInt();
        while (year < 0) {
            System.out.println("Некорректный год издания. Попробуйте снова");
            year = scanner.nextInt();
        }

        bookList.add(new Book(name, author, year));
    }

    public void findByAuthor() {
        System.out.println("Введите автора:");
        String author = scanner.nextLine();

        for (Book book : bookList) {
            if (book.author().equals(author)) {
                System.out.println(book.title() + ", " + book.year());
            }
        }
    }

    public void printAll() {
        System.out.println("Всего найдено: " + bookList.size() + " книг.");
        for (Book book : bookList) {
            System.out.println(book.author() + " " + book.title() + ", " + book.year());
        }
    }

}
