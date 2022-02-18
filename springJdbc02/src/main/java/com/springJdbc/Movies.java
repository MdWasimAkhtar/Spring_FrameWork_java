package com.springJdbc;


public class Movies {
	
	private int movieId;
	private String movieName;
	private String actor;
	private String actress;
	
	public Movies() {
		super();
	}

	public Movies(int movieId, String movieName, String actor, String actress) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.actor = actor;
		this.actress = actress;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActress() {
		return actress;
	}

	public void setActress(String actress) {
		this.actress = actress;
	}

	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", actor=" + actor + ", actress=" + actress
				+ "]";
	}
	
	

}
