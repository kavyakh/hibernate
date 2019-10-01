package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.zensar.Entites.Product;

public class DbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		
		//single ton and heavy weight sessionn factory
		SessionFactory f = c.buildSessionFactory();
		
		//Represents database connection and light weight
		Session s = f.openSession();
		Transaction t= s.beginTransaction();
		
		//Insert new record
		//Product p1 =new Product(1004,"shoe","bata",500);
			
		//get record according to primary key
		
		//Product p = s.load(Product.class, 1003);
				//System.out.println(p);
				//s.save(p1);
		
		/*Product p = new Product();
		 if(s.get(Product.class, 1006) != null){
			 System.out.println(p);
			 
		 }else {
			 System.out.println("product not found in database");
		 }*/
		 
		 //update a record
		/* Product p = s.get(Product.class, 1004);
		 if(p!=null) {
	     float inc = p.getPrice();
		 p.setPrice(600);
		 s.update(p);
		
		 }		 
		 
	    else {  
			 System.out.println("product not found in database");
		 
	    }*/
		
		//delete record
		 Product p = s.load(Product.class, 1003);
		 if(s.get(Product.class, 1003) != null){
			s.delete(p);
			 
		 }else {
			 System.out.println("product not found in database");
		 }
	 
		
		t.commit();
		s.close();
	
	}
}



