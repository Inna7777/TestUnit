package homeWorkFour;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {

    //создаем Mock-объект bookRepository, который заменяет реальный репозиторий книг
    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    //метод  который инициализирует мок-объекты.
    public BookServiceTest() {
        MockitoAnnotations.initMocks(this);
    }


    //тест проверяет работу метода getBooks() из класса bookService.
    @Test
    void testGetBooks() {

        //создается список книг books
        List<Book> books = new ArrayList<>();
        books.add(new Book( "Book1", "Author1"));
        books.add(new Book( "Book2", "Author2"));
    //метод when() и  метод thenReturn() задают поведение Mock-объекта bookRepository: при вызове метода findAll() он должен возвращать список книг books.
        when(bookRepository.findAll()).thenReturn(books);

    //метод getBooks()  должен вернуть список книг.
        List<Book> result = bookService.getBooks();

    //метода verify() проверяет, что метод findAll() был вызван у Mock-объекта bookRepository ровно 1 раз.
        verify(bookRepository, times(1)).findAll();

        //методы assertEquals() проверяют, что размер возвращенного списка равен 2 и что у первой книги в списке название "Book1", а у второй - автор "Author2".
        assertEquals(result.size(), 2);
        assertEquals(result.get(0).getTitle(), "Book1");
        assertEquals(result.get(1).getAuthor(), "Author2");
    }

    @Test
    void testGetBookById() {

        //создается объект книги book, который будет возвращаться при вызове метода findById() у Mock-объекта bookRepository.
        Book book = new Book( "Book 1", "Author 1");
    //метод when() и  метод thenReturn() задают поведение Mock-объекта bookRepository: при вызове метода findById() с аргументом 1L он должен возвращать объект книги book.
        when(bookRepository.findById(1)).thenReturn(book);

    //метод getBookById() у тестируемого объекта bookService с id 1,  должен вернуть объект книги.
        Book result = bookService.getBookById(1);

    //метод verify() проверяет, что метод findById() был вызван у Mock-объекта bookRepository ровно 1
        verify(bookRepository, times(1)).findById(1);

        //метод assertEquals() проверяет, что у возвращенного объекта книги правильно установлены название и автор
        assertEquals(result.getTitle(), "Book 1");
        assertEquals(result.getAuthor(), "Author 1");
    }
    //данный тест проверяет, что метод saveBook() правильно сохраняет объект книги в репозитории, используя Mock-объект bookRepository.
    @Test
    void testSaveBook() {
        Book book = new Book( "Book 1", "Author 1");

        bookService.saveBook(book);

        verify(bookRepository, times(1)).save(book);
    }
    //данный тест проверяет, что метод testDeleteBook() правильно удаляет объект книги
    @Test
    void testDeleteBook() {
        bookService.deleteBook(2);

        verify(bookRepository, times(1)).deleteById(2);
    }
}
