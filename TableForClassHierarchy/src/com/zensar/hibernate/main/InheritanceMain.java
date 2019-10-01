package com.zensar.hibernate.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.Entitis.Employee;
import com.zensar.Entitis.WageEmp;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s =f.openSession();
		Transaction t =s.beginTransaction();
		
		Employee e =new Employee();
		e.setName("shilpa");
		e.setJoindate(LocalDate.of(2016, 12, 9));
		e.setSalary(25000);
		s.save(e);
      
		WageEmp we = new WageEmp();
		we.setName("rani");
		we.setHours(3);
		we.setJoindate(LocalDate.of(2017, 03, 12));
		we.setRate(400.2f);
		s.save(we);
		
		t.commit();
        s.close();
	}
	

}
