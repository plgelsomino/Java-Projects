import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

//********************************************************************
//  League.java
//  Peter Gelsomino, James Green, Rawle Jones
//  5/5/2015
//  CS 504
//********************************************************************

public class League {
	
			// private fields of class League
			private String commissioner;
			private String foundYear;
			private int numGames;
			private double salary;
			private int numTeams;
			private int numRefs;
			
	// no argument constructor
	public League() {
	}
	
	//  constructor for class League with paramaters
	//  String commish, String year, int games, double cap, int teams, int refs
	public League(String commish, String year, int games, double cap, int teams, int refs) {
		commissioner = commish;
		foundYear = year;
		numGames = games;
		salary = cap;
		numTeams = teams;
		numRefs = refs;
	}
	
	// setting commissioner
	public void setCommissioner(String commish) {
		commissioner = commish;
	}
	// setting foundYear
	public void setFoundYear(String year) {
		foundYear = year;
	}
	//setting numGames
	public void setNumGames(int games) {
		numGames = games;
	}
	// setting salary
	public void setSalary(double cap) {
		salary = cap;
	}
	// setting numTeams
	public void setNumTeams(int teams) {
		numTeams = teams;
	}
	// setting numRefs
	public void setNumRefs(int refs) {
		numRefs = refs;
	}
	// getter for commissioner
	public String getCommissioner() {
		return commissioner;
	}
	// getter for foundYear
	public String getFoundYear() {
		return foundYear;
	}
	// getter for numGames
	public int getNumGames() {
		return numGames;
	}
	// getter for salary
	public double getSalary() {
		return salary;
	}
	// getter for numTeams
	public int getnumTeams() {
		return numTeams;
	}
	// getter for numRefs
	public int getnumRefs() {
		return numRefs;
	}
	
	//formating doubles to money format
	public String formatCost(double cost) {
		DecimalFormat moneyFormat = new DecimalFormat("$0.00");
		return moneyFormat.format(cost);
	}
	
	// user defined toString to describe characteristics of NBA
	public String toString() {
		return ("******************" +
				"\nNational Basketball Association" +
				"\nThe NBA Commissioner: " + commissioner + 
				"\nIt was founded in: " + foundYear + 
				"\nEach Team plays " + numGames + " games per season" + 
				"\nAll teams salary cap per season is: " + formatCost(salary) + 
				"\nThere are " + numTeams + " teams that currently play in the NBA" + 
				"\nDue to the high volume of games, the NBA has " + numRefs + " referees" +
				"\n******************");
	} // end toString()
	
	
} // end class
