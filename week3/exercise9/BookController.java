import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ksa.librarymanagement.demo.ksa.librarymanagement.Model.Book;
import com.example.ksa.librarymanagement.demo.ksa.librarymanagement.Repository.BookRepository;

@RestController
public class BookController 
{
	@Autowired
	BookRepository br;
	
	@GetMapping("/books")
	public List<Book> books()
	{
		return(br.findAll());
	}
	
	@PostMapping("/books")
	public String books1(@RequestBody Book book)
	{
		try {
		
		System.out.println(book.getId()+" "+book.getName());
		br.save(book);
		return("Saved");}
		catch(Exception e)
		{
			return("Error");
		}
	}
		
	
	@DeleteMapping("/books/{id}")
	public String books3(@PathVariable int id)
	{
		
		Book b=br.findById(id).orElseThrow(()->new RuntimeException("Id Not Found"));
		br.deleteById(id);
		return("deleted");
		
		
	}
	
	@PutMapping("/books/{id}")
	public String books5(@PathVariable int id,@RequestBody Book book) {
		Book b=br.findById(id).orElseThrow(()->new RuntimeException("Id Not Found"));
		b.setId(book.getId());
		b.setName(book.getName());
		br.save(b);
		return("Updated");
	}
	
}
