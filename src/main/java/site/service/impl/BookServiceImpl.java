package site.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import site.dao.BookDAO;
import site.entity.Book;
import site.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDAO bookDAO;

	public List<Book> bookserviceFindBookByTitle(String title) {

		return bookDAO.bookDAOfindBooksByTitle(title);
	}

	public List<Book> bookServiceGetAllBooks() {

		return bookDAO.findAll();
	}

	@Transactional
	public void bookServiceSaveOrUpdateBook(String id, String title,
			String description, String author) {
		Book book = new Book(title, description, author);
		if (id != null && !id.isEmpty()) {
			book.setId(Integer.parseInt(id));
		}
		bookDAO.save(book);

	}
	@Transactional
	public void bookServiceDeleteBook(int id) {

		bookDAO.delete(id);
	}

	public Book bookServiceFindBookByID(int id) {
		return bookDAO.findOne(id);
	}

}
