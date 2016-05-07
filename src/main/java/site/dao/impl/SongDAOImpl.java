package site.dao.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import site.dao.SongDAO;
import site.entity.Song;

@Repository
public class SongDAOImpl implements SongDAO{

	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public void deleteInBatch(Iterable<Song> entities) {
		// TODO Auto-generated method stub
		
	}

	public List<Song> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Song> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Song> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public Song getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Song> List<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Song> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Song> findAll(Pageable pageable) {
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

	public void delete(Song entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Iterable<? extends Song> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Song findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Song> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Song> songDAOfindSongByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}


}
