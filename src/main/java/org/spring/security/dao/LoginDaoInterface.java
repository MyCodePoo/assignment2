package org.spring.security.dao;

import org.spring.security.model.Users;

public interface LoginDaoInterface {
	Users findByUserName(String username);
}
