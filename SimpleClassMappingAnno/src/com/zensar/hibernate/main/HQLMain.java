package com.zensar.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.Entites.Product;

//Hibernate query language(object oriented query language)
public class HQLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration c = new Configuration().configure();
		
		//single ton and heavy weight sessionn factory
		SessionFactory f = c.buildSessionFactory();
		
		//Represents database connection and light weight
		Session s = f.openSession();
		Transaction t= s.beginTransaction();
		
		/*JPA(java persistance API) Query
		Query q=s.createQuery("from Product");
		Query q=s.createQuery("from Product p where p.price>30000 and p.price<70000");
		Query q=s.createQuery("from Product p where p.price between 15000 and 70000");
		Query q=s.createQuery("from Product p where p.brand like's%'");
		Query q=s.createQuery("from Product p where p.name='mobile'");
		List<Product> products =q.getResultList();
		for(Product p : products) {
			System.out.println(p);
		}*/
		//Query q = s.createQuery("select p.name,p.price from Product p");
		//Query q = s.createQuery("select p.productId,p.name,p.brand from Product p");
		/*Query q = s.createQuery("select p.price,p.brand,p.name from Product p");
		List<Object[]> objects = q.getResultList();
		for(Object[] ob : objects) {
			for(int i=0;i<ob.length;i++) {
				System.out.println(ob[i]);
			}
		}*/
		
		//Find the max price
		/*Query q = s.createQuery("select max(p.price)from Product p");
		Float maxPrice=(Float) q.getSingleResult();
		System.out.println(maxPrice);*/
		
		//find the min price
		/*Query q1 = s.createQuery("select min(p.price)from Product p");
		Float minPrice=(Float) q1.getSingleResult();
		System.out.println(minPrice);*/
		
		//Find the sum
		/*Query q2 = s.createQuery("select sum(p.price)from Product p");
		double sumPrice=(double) q2.getSingleResult();
		System.out.println(sumPrice);*/
		
		//Find the Avg
		/*Query q3 = s.createQuery("select Avg(p.price)from Product p");
		double AvgPrice=(double) q3.getSingleResult();
		System.out.println(AvgPrice);*/
		
		//Find the Count
		Query q4 = s.createQuery("select count(p.price)from Product p");
		Long countPrice=(Long) q4.getSingleResult();
		System.out.println(countPrice);
		
		/*Criteria cr = s.createCriteria(Product.class);
	    List<Product> products = cr.list();
	    for(Product p :products) {
	    	System.out.println(p);
	    }*/
		t.commit();
		s.close();
	}

}
