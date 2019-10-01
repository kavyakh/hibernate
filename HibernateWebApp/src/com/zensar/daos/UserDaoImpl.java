package com.zensar.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.User;

/**
 *@author Kavya KH
 *@version 2.0
 *@creation_date 21st sep 2019 5.38PM
 *@modification_date 28rd sep 2019 11:15AM
 *@copyright Zensar Technologies.All rights reserved.
 *@description It is Data Access object Interface Implementor class.
 *             It is used in Persistence layer of Application.        
 */

public class UserDaoImpl implements UserDao {
	private Session s;
	
	public UserDaoImpl() {
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
	}
	
	

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		Transaction t = s.beginTransaction();
		s.save(user);
		t.commit();
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		Transaction t = s.beginTransaction();
		s.update(user);
		t.commit();
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		Transaction t = s.beginTransaction();
		s.delete(user);
		t.commit();
	}

	@Override
	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return s.get(User.class, "radha");
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		Query q= s.createQuery("from User");
		return q.getResultList();
	}

	
}
