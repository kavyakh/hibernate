package com.zenSar.hibernate.main;

import java.time.LocalDate;
import java.util.ArrayList;
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
public class OneToManyMappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration().configure();
		SessionFactory f= c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Movie m = new Movie();
		m.setTitle("Rajakumara");
		m.setReleaseDate(LocalDate.of(2018, 9, 26));
		
		Song sn = new Song("Bombe Bombe");
		Song sn1 = new Song("Raja Raja");
		Song sn2 = new Song("Ahdisi nodu");
		
		sn.setMovie(m);
		sn1.setMovie(m);
		sn2.setMovie(m);
		
		List<Song>songs = new ArrayList();
		songs.add(sn);
		songs.add(sn1);
		songs.add(sn2);
		m.setSongs(songs);
		sn.setMovie(m);
		s.save(sn);
		s.save(sn1);
		s.save(sn2);
		s.save(m);
		
		t.commit();
		s.close();
		System.exit(0);

	}

}
