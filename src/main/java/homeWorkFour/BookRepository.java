package homeWorkFour;

import java.util.List;

public interface BookRepository {
    List<Book> findAll();
    Book findById(int id);
    void save(Book book);
    void deleteById(int id);
}
