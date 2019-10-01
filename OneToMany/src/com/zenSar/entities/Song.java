package com.zenSar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Kavya KH
 * @Creation_date 27 sep 2019 4:44PM
 * @Modification_date 27 sep 2019 4:44Pm
 * @version 2.0
 * @copyright ZenSar Technologies.All Rights are reserved.
 *
 */
@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int songId;
	private String name;
	@ManyToOne
	@JoinColumn(name = "movie_Id")
	private Movie movie;
	
	public Song() {
	
}

public Song(int songId, String name) {
	super();
	this.songId = songId;
	this.name = name;
}

public int getSongId() {
	return songId;
}

public void setSongId(int songId) {
	this.songId = songId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Movie getMovie() {
	return movie;
}

public void setMovie(Movie movie) {
	this.movie = movie;
}


public Song(String name) {
	super();
	this.name = name;
}

@Override
public String toString() {
	return "Song [songId=" + songId + ", name=" + name + "]";
}
	
}
