package com.zenSar.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zenSar.entities.Movie;
import com.zenSar.entities.Song;
/**
 * @author Kavya KH
 * @Creation_date 27 sep 2019 4:44PM
 * @Modification_date 27 sep 2019 4:44Pm
 * @version 2.0
 * @copyright ZenSar Technologies.All Rights are reserved.
 *
 */
public class MovieDeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration().configure();
		SessionFactory f= c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Movie m= s.get(Movie.class, 4);
		System.out.println(m.getTitle());
		System.out.println(m.getReleaseDate());
		List<Song> songs = m.getSongs();
		
		for(Song sn : songs) 
		{
			System.out.println(sn);
		}
		
		if(m!=null) {
			s.delete(m);
		}else {
			System.out.println("Sorry! movie not found");
		}
		t.commit();
		s.close();
		System.exit(0);
	}

}
