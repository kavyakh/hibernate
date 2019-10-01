package com.zensar.Hibernate.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.zensar.Entities.Customer;
import com.zensar.Entities.Name;

public class CustomerGetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration c = new Configuration().configure();
			
	     //single ton and heavy weight Sessionn factory
		  SessionFactory f = c.buildSessionFactory();
				
		 //Represents database connection and light weight
		 Session s = f.openSession();
		 Transaction t= s.beginTransaction();
		 
		
			 Customer cu = s.get(Customer.class,123);
			 System.out.println(cu.getCustomerId());
			 System.out.println(cu.getAddress());
			 System.out.println(cu.getAge());
			 System.out.println(cu.getGender());
			 System.out.println(cu.getBirthdate());
			 Name customername = cu.getCustomerName();
			 System.out.println(customername);
			 Blob customerphoto = cu.getProfilephoto();
			 try {
			 InputStream in = customerphoto.getBinaryStream();
			 FileOutputStream fout = new FileOutputStream("./resources/newphoto.jfif");
			 int data =0;
			 while((data = in.read())!=-1) 
			 {
				 
				 fout.write(data);
			 }
			 
			 fout.close();
			 Clob description= cu.getDescription();
			 Reader r = description.getCharacterStream();
			 PrintWriter pw = new PrintWriter("./resources/CustomerDbInfo");
			 int chardata = 0;
			 while((chardata=r.read())!=-1)
			 {
				 pw.print((char)chardata);
			 }
			 pw.close();
		} 
			 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
		 t.commit();
		 s.close();

	}

}
