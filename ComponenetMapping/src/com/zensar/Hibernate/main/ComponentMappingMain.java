package com.zensar.Hibernate.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;
import org.hibernate.engine.jdbc.ClobProxy;
import org.hibernate.type.CustomType;

import com.zensar.Entities.Customer;
import com.zensar.Entities.Name;

public class ComponentMappingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Configuration c = new Configuration().configure();
				
	     //single ton and heavy weight Sessionn factory
		  SessionFactory f = c.buildSessionFactory();
				
		 //Represents database connection and light weight
		 Session s = f.openSession();
		 Transaction t= s.beginTransaction();
		 
		 Name name  = new Name();
		 name.setFirstName("Ramya");
		 //name.setMiddleName("Krishna");
		 name.setLastName("Gowda");
		 
		 Customer cu = new Customer(123,name,22,"female","pune");
		 //cu.setAddress("pune");
		 cu.setBirthdate(LocalDate.of(1996, 7, 7));
		 
		 try {
			 File photo = new File("./resources/profile1.jfif");
			 FileInputStream f1 = new FileInputStream(photo);
			 Blob customerphoto = BlobProxy.generateProxy(f1, photo.length());
			 cu.setProfilephoto(customerphoto);
			 File f2 = new File("./resources/CustomerInfo.txt");
			 FileReader fr = new FileReader(f2);
			 Clob description = ClobProxy.generateProxy(fr, f2.length());
			 cu.setDescription(description);
			 s.save(cu);
			 t.commit();
			 s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
