package com.zensar.daos;

import java.util.List;
import com.zensar.entities.User;

/**
 *@author Kavya KH
 *@version 2.0
 *@creation_date 21st sep 2019 5.30PM
 *@modification_date 21st sep 2019 11:21AM 
 *@copyright Zensar Technologies.All rights reserved.
 *@description It is Data Access object Interfaces.
 *             It is used in Persistence layer of Application.        
 */

public interface UserDao {
	void insert(User user);
	void update(User user);
	void delete(User user);
	User getByUsername(String username);
	List<User> getAll();

}
