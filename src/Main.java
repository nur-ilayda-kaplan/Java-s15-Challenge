import com.library.models.Author;
import com.library.models.Book;
import com.library.models.Reader;
import com.library.services.Library;

public class Main {
    public static void main(String[] args) {
        /*Author author = new Author("George orwell",1);
        author.newBook("Hayvan Çiftliği");
        author.newBook("Burma Günleri");
        author.showBooks();
        author.whoYouAre();

        System.out.println("--------------------------");

        // Bir okuyucu oluştur
        Reader reader = new Reader("İlayda",2);
        reader.borrowBook("1984");
        reader.showBooks();
        reader.returnBook("Burma Günleri");
        reader.showBooks();
        reader.whoYouAre();*/

        Library library = new Library();

        Book book1 = new Book(1, "1984", "George Orwell", 50.0, true, "2005");
        Book book2 = new Book(2, "Suç ve Ceza", "Dostoyevski", 60.0, true, "2010");
        Reader reader = new Reader("Ali",2);

        library.newBook(book1);
        library.newBook(book2);

        library.showBooks();

        library.lendBook("1984", reader);
        library.showBooks();

        library.takeBackBook("1984", reader);
        library.showBooks();
    }


}