
package service;

import java.util.List;

import dao.bookDao;
import domain.Book;
import domain.BookStatus;
import exceptions.LibraryManagementException;
import domain.AvailabilityStatus;

public class BookService {
	bookDao bd;
	
	public BookService(bookDao bd) {
		this.bd = bd;
	}
	public void addBook(Book book) throws LibraryManagementException {
		bd.addBook(book);
	}
	public void updateBookDetails(int id, String title, String author, String category, BookStatus status) throws LibraryManagementException {	
		bd.updateBookDetails(id,title,author,category,status);
		
	}
	public void updateBookAvailability(int id, AvailabilityStatus status) throws LibraryManagementException {
		bd.updateBookAvailability(id,status);
		
	}
	public  List<Book> getAllBooks() throws LibraryManagementException {
		return bd.getAllBooks();
	}
	public boolean bookExists(int id) throws LibraryManagementException {
	    return bd.bookExists(id);
	}

}