package site.dao.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import site.dao.FilmDAO;
import site.entity.Film;
@Repository
public class FilmDAOImpl implements FilmDAO{

	public void insertFilm(FilmDAO author) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public void deleteInBatch(Iterable<Film> entities) {
		// TODO Auto-generated method stub
		
	}

	public List<Film> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Film> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Film> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public Film getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Film> List<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Film> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Film> findAll(Pageable pageable) {
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

	public void delete(Film entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Iterable<? extends Film> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Film findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Film> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Film> filmDAOfindFilmByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
