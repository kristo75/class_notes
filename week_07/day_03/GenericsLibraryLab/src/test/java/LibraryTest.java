import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library<String> library;
    Book book;

    @Before
    public void before(){
        library = new Library<>();
        book = new Book();
    }

    @Test
    public void libraryStartsEmpty(){
    assertEquals(0, library.countItems())}

    @Test
    public void libraryCanAdItem(){
    library.addItem("A new string");
    assertEquals(1, library.countItems());

    }


    @Test
    public void libraryCanHaveBook(){
        library<Book> bookLibrary = new book;
        bookLibrary.addItem(book);
        assertEquals(1, library.countItems());
    }
}
