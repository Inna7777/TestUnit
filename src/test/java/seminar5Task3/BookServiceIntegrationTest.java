package seminar5Task3;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookServiceIntegrationTest {
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        bookService = new BookService();
    }

    @Test
    public void testAddBookAndGetAllBooks() {
        // Задание:
        // 1. Создайте 3 книги и добавьте их в bookService.
        // 2. Получите список всех книг из bookService.
        // 3. Проверьте, что список не является null.
        // 4. Проверьте, что список содержит 3 книги.
        // 5. Выведите информацию о каждой книге (используйте метод toString).

        // Подсказка: Используйте методы addBook и getAllBooks из bookService.
        // Проверьте, что результаты соответствуют ожиданиям.

        // проведите Все возможные  интеграционное тестирование.

        // Ваш код здесь
    }
}
