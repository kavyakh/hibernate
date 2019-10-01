package com.zensar.Services;

import java.util.List;
import com.zensar.daos.UserDao;
import com.zensar.entities.User;
import com.zensar.exception.ServiceException;

/**
 *@author Kavya KH
 *@version 2.0
 *@creation_date 21st sep 2019 5.38PM
 *@modification_date 28rd sep 2019 11:48AM
 *@copyright Zensar Technologies.All rights reserved.
 *@description It is Data Access object Interface Implementor class.
 *             It is used in Persistence layer of Application.        
 */
public class UserServiceImpl implements UserServices {
	
	private UserDao userDao;
	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) throws ServiceException {
		userDao.insert(user);
	}

	@Override
	public void updateUser(User user) throws ServiceException {
		userDao.update(user);
	}

	@Override
	public void removeUser(User user) throws ServiceException {
		userDao.delete(user);
	}

	@Override
	public User findUSerByUsername(String username) throws ServiceException {
		User user = userDao.getByUsername(username);
		return user;
		   }

	@Override
	public List<User> findAllUsers() throws ServiceException {
		return userDao.getAll();
	}

	@Override
	public boolean validateUser(User user) throws ServiceException {
		// TODO Auto-generated method stub
		User dbUser = findUSerByUsername(user.getUsername());
		//System.out.println(user);
		//System.out.println(dbUser);
		if(dbUser!=null && dbUser.getPassword().equals(user.getPassword()))
			return true;
		else
			return false;
	}

}
