package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.Entities.Country;
import com.zensar.Entities.Flag;
/**
 * @author Kavya KH
 * @Creation_date 27 sep 2019 2:56Pm
 * @Modification_Date 27 sep 2019 2:57Pm
 * @version 4.0
 * @copyright ZenSar Technologies.All rights are Reserved.
 * 
 */
public class OneToOneMappingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t= s.beginTransaction();
		
		Country cu = new Country();
		cu.setName("India");
		cu.setLanguage("Hindi");
		cu.setPopulation(140000000L);
		
		
		Flag f1 = new Flag();
		f1.setFlagName("Tricolor");
		f1.setDescription("Thiranga combination of threee color flag");
		f1.setCountry(cu);
		cu.setFlag(f1);
		s.save(cu);
		s.save(f1);
		
		t.commit();
		s.close();
		    
	}

}
