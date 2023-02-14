package com.fdmgroup.bookstore.data;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.bookstore.model.User;

public class UserArrayListRepository implements UserRepository {
	private List<User> users;
	public static int id = 1;
	
	
	public UserArrayListRepository(List<User> users) {
		super();
		this.users = users;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		UserArrayListRepository.id = id;
	}

	public boolean validate(String username, String password) {
		for(int i = 0; i<users.size(); i++) {
			if(username == users.get(i).getUsername()) {
				if(password == users.get(i).getPassword())
					return true;
			}
		}
		return false;
	}

	public User findByUsername(String username) {
		for(int i = 0; i<users.size(); i++) {
			if(username == users.get(i).getUsername())
				return users.get(i);
		}
		return null;
	}

	public User findById(int id) {
		if (id < users.size())
			return users.get(id);
		else
			return null;
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
