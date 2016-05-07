package site.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import site.entity.Book;
import site.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	/* Display book list */
	@RequestMapping(value = "/show_all_books")
	public String show_all_books(Model model) {

		model.addAttribute("AllBooks",
				bookService.bookServiceGetAllBooks());

		return "book-showAllBooks";
	}

	/*!!!!!!!!!!!!*/
	/*!!!!!!!!!!!!correct request for author - NOT new Author only var*/
	@RequestMapping(value = "/addNewBook", method = RequestMethod.POST)
	public String addNewBook(@RequestParam(value = "title") String title,
			@RequestParam(value = "description") String description,
			@RequestParam(value = "author") String author,
			@RequestParam("id") String id) {

//		see what's wrong with iterator

		bookService.bookServiceSaveOrUpdateBook(id, title, description, author);

		return "redirect:/toAddBook";

	}

	@RequestMapping(value = "/findBooksByTitle")
	public String findBookByTitle(@RequestParam(value = "title") String title,
			Model model) {

		model.addAttribute("bookByTitle",
				bookService.bookserviceFindBookByTitle(title));

		return "book-forSearchBook";
	}

	/* modify */
	@RequestMapping(value = "/modifyBook-{id}")
	public String modifyBook(@PathVariable(value = "id") String id, Model model) {
		Book book = bookService.bookServiceFindBookByID(Integer.parseInt(id));
		model.addAttribute("book", book);
		return "book-addBook"; /* make a ref for a page adbook */
	}

	/* delete */
	@RequestMapping(value = "/deleteBook-{id}")
	public String deleteBook(@PathVariable(value = "id") String id) {
		bookService.bookServiceDeleteBook(Integer.parseInt(id));
		return "redirect:/show_all_books";
	}

}
