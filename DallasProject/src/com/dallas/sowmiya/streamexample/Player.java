package com.dallas.sowmiya.streamexample;

public class Player {

	
	private String name;
	private int age;
	private int matchesPlayed;
	
	Player(String name, int age, int matchesPLayed)
	{
		this.name = name;
		this.age = age;
		this.matchesPlayed = matchesPLayed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPLayed(int matchesPLayed) {
		this.matchesPlayed = matchesPLayed;
	}
	
}
