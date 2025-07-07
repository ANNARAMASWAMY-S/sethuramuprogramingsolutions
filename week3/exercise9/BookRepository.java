import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ksa.librarymanagement.demo.ksa.librarymanagement.Model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
