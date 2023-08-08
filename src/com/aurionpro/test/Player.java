package com.aurionpro.test;

public class Player {


	int id;
	String name;
	int runs;
	int wickets;
	int matches;
	String country;
	
	public Player(int id, String name, int runs, int wickets, int matches, String country) {

		this.id = id;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.matches = matches;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets + ", matches="
				+ matches + ", country=" + country + "]";
	}
	
		

}
