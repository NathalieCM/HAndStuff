package site.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import site.entity.Book;

public interface BookDAO extends JpaRepository<Book, Integer> {
	@Query(value = "select b from Book b where b.title like :title ")
	List<Book> bookDAOfindBooksByTitle(@Param("title") String title);
}