package site.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import site.dao.UserDAO;
import site.service.UserService;


@Service(value = "userService") /*security connection to DB*/
public class UserServiceImpl implements UserService, UserDetailsService {

	@Autowired
	private UserDAO userDAO;

	/*find and Log In*/
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		/*get object by Name*/
		site.entity.User user = null;
		try {
			user = userDAO.getUser(username);
		} catch (NoResultException e) {
			return null;
		}
		/*creating rights*/
		Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		/*create object of spring type which will connect to security.xml 'cause we cannot band our User*/
		return new User(String.valueOf(user.getId()), user.getPassword(), authorities);
	}

	public site.entity.User getUser(String username) {
		return userDAO.getUser(username);
	}

	public void userServiceSaveUser(site.entity.User user) {
		userDAO.save(user);
	}


}

