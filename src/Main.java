import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final Library library = new Library();

        while (true) {
            printMenu();
            int command = scanner.nextInt();
            switch (command) {
                case 0 -> {
                    System.out.println("Выход.");
                    return;
                }
                case 1 -> library.addBook();
                case 2 -> library.findByAuthor();
                case 3 -> library.printAll();
                default -> System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Добавить книгу.");
        System.out.println("2 - Найти книги автора.");
        System.out.println("3 - Увидеть список книг.");
        System.out.println("0 - Выход.");
    }
}
