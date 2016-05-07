package site.service;

import java.util.List;

import site.entity.Book;

public interface BookService {
	List<Book> bookserviceFindBookByTitle(String title);

	List<Book> bookServiceGetAllBooks();

	/* admin */
	void bookServiceSaveOrUpdateBook(String id,String title, String description, String author);
	
	void bookServiceDeleteBook(int id);
	
	Book bookServiceFindBookByID(int id);
}
