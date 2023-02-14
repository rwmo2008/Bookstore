package com.fdmgroup.bookstore.data;

import com.fdmgroup.bookstore.model.User;

public interface Persistable {
	public User saveUser(User user);
}
