package site.dao.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import site.dao.BookDAO;
import site.entity.Book;

@Repository
public class BookDAOImpl implements BookDAO{

	public void insertBook(BookDAO author) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public void deleteInBatch(Iterable<Book> arg0) {
		// TODO Auto-generated method stub
		
	}

	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public Book getOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Book> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Book> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Book> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Book entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Iterable<? extends Book> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Book findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Book> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> bookDAOfindBooksByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
