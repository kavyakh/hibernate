package com.zensar.Services;

import java.util.List;

import com.zensar.entities.User;
import com.zensar.exception.ServiceException;

/**
 *@author Kavya KH
 *@version 1.0
 *@creation_date 21st sep 2019 6.00PM
 *@modification_date 21st sep 2019 6.00PM 
 *@copyright Zensar Technologies.All rights reserved.
 *@description It is Business Service Interfaces.
 *             It is used in Domain layer of Application.        
 */

public interface UserServices {
	
	void addUser(User user)throws ServiceException;
	void updateUser(User user)throws ServiceException;
	void removeUser(User user)throws ServiceException;
	User findUSerByUsername(String username)throws ServiceException;
	List<User> findAllUsers()throws ServiceException;
	
	boolean validateUser(User user)throws ServiceException;
}
