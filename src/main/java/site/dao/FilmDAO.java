package site.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import site.entity.Film;

public interface FilmDAO extends JpaRepository<Film, Integer>{
	@Query(value = "select f from Film f where f.title like :title ")
	List<Film> filmDAOfindFilmByTitle(@Param("title") String title);
}
