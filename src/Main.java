import com.library.models.Author;
import com.library.models.Book;
import com.library.models.Reader;
import com.library.services.Library;

import java.util.Date;





import java.util.Scanner;
public class Main {

    private static Library library = new Library();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            showMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewBook();
                    break;
                case 2:
                    lendBook();
                    break;
                case 3:
                    takeBackBook();
                    break;
                case 4:
                    showAllBooks();
                    break;
                case 5:
                    System.out.println("Çıkış yapılıyor...");
                    running = false;
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        }
    }
// static void bağımsız ve nesne oluşturmadan erişilebilen methodlar yazmak için kullanılır.
    private static void showMainMenu() {
        System.out.println("\n=== Kütüphane Sistemi ===");
        System.out.println("1 - Yeni Kitap Ekle");
        System.out.println("2 - Kitap Ödünç Al");
        System.out.println("3 - Kitap İade Et");
        System.out.println("4 - Tüm Kitapları Göster");
        System.out.println("5 - Çıkış");
        System.out.print("Seçiminizi girin: ");
    }

    private static void addNewBook() {
        System.out.print("Kitap Adı: ");
        String name = scanner.nextLine();
//        boolean success=library.newBook(new Book());
        Book book = new Book(name);
        library.newBook(book);
    }

    private static void lendBook() {
        System.out.print("Ödünç almak istediğiniz kitabın adı: ");
        String bookName = scanner.nextLine();
        boolean success = library.lendBook(bookName,new Reader("İlayda",3));

    }

    private static void takeBackBook() {
        System.out.print("İade etmek istediğiniz kitabın adı: ");
        String bookName = scanner.nextLine();
        boolean success = library.takeBackBook(bookName,new Reader("İlayda",3));

    }

    private static void showAllBooks() {
        library.showBooks();
    }
}

//    public static void main(String[] args) {
//       Author author = new Author("George orwell",1);
//        author.newBook("Hayvan Çiftliği");
//        author.newBook("Burma Günleri");
//        author.showBooks();
//        author.whoYouAre();
//
//        System.out.println("--------------------------");
//
//        // Bir okuyucu oluştur
//        Reader reader = new Reader("İlayda",2);
//        reader.borrowBook("1984");
//        reader.showBooks();
//        reader.returnBook("Burma Günleri");
//        reader.showBooks();
//        reader.whoYouAre();
//
//        Library library = new Library();
//
//        Book book1 = new Book(1 ,new Author("George Orwell",1) ,"George Orwell", 50.0, true, "2005",new Date(2025,02,02),true);
//        Book book2 = new Book(2, new Author("Dostoyevski",2), "Dostoyevski", 60.0, false, "2010",new Date(2025,02,02),false);
//
//
//        library.newBook(book1);
//        library.newBook(book2);
//
//        library.showBooks();
//
//       library.lendBook("1984",reader);
//        library.showBooks();
//
//        library.takeBackBook("Burma Günleri", reader);
//        library.showBooks();
//    }


//}