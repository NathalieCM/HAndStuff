package site.dao.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import site.dao.UserDAO;
import site.entity.User;

@Repository
public class UserDAOImpl implements UserDAO{

	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public void deleteInBatch(Iterable<User> entities) {
		// TODO Auto-generated method stub
		
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public User getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends User> List<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends User> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<User> findAll(Pageable pageable) {
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

	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Iterable<? extends User> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	public User findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends User> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
