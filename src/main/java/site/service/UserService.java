package site.service;

import site.entity.User;


public interface UserService {
	User getUser(String username);
	void userServiceSaveUser(User user);
}
