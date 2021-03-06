package rubrica12.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rubrica12.model.Book;
import rubrica12.repository.RepositoryBook;

@Service
public class BookService {

	@Autowired
	RepositoryBook repositoryBook;
	
	private RepositoryBook repB = new RepositoryBook();
	
	public void insertBook(Book book){
		repB.insertBook(book);
	}
	
	public ArrayList<Book> findBooksByTitle(String title) {
		return repB.findBooksByTitle(title);
	}
	
	public ArrayList<Book> findBooksByIsbn(int isbn) {
		return repB.findBooksByIsbn(isbn);
	}
	
	public ArrayList<Book> findBooksByidAuthor(int idAuthor) {
		return repB.findBooksByidAuthor(idAuthor);
	}

	public List findBooks(Book book) {
		return repB.findBooks(book);
	}
}
