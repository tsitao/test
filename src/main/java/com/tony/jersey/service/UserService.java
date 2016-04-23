package com.tony.jersey.service;

import java.util.ArrayList;
import java.util.List;

import com.tony.jersey.model.User;

public class UserService {
	
	private static List<User> users = null;
	
	static{
		users = new ArrayList<>();
		users.add(new User("1", "ZhuBaJie", "13888888888"));
		users.add(new User("2", "ShaHeshang", "13866666666"));
		users.add(new User("3", "TangSeng", "13855555555"));
		users.add(new User("4", "SunWuKong", "13811111111"));
	}

	public static User getUserById(String id) {
		for(User user : users) {
			if(id.equalsIgnoreCase(user.getId())){
				return user;
			}
		}
		return null;
		//return UserDao.getUserById(id);
	}

	public static List<User> getUsers() {

		return users;
		//return UserDao.getUsers();
	}

	public static void delUserById(String id) {
		for(User user : users){
			if(id.equalsIgnoreCase(user.getId())){
				users.remove(users);
				break;
			}
		}
		//UserDao.delUserById(id);
	}

	public static void addUser(User user) {
		users.add(user);
		//UserDao.addUser(user);
	}

	public static void updateUser(User user) {
		for(User user1 : users) {
			if(user.getId().equalsIgnoreCase(user1.getId())){
				user1.setPhone(user.getPhone());
				user1.setUserName(user.getUserName());
				break;
			}
		}
		//UserDao.updateUser(user);
	}

}