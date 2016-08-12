import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

//********************************************************************
//  Teams.java
//  Peter Gelsomino, James Green, Rawle Jones
//  5/5/2015
//  CS 504
//********************************************************************

public class Teams {
		// fields of class Teams
		private String name;
		private String city;
		private String owner;
		private double ticketCost;
		private String year;
		private int championships;
		private String player;
		private int standing;
		public static int numTeams = 0;
		
	// numTeams inside constructor
	public Teams() {
		numTeams++;
	}
	// creating Teams constructor with arguments String nm, String c, String own, double tix, String yr, int champs, String star, int position
	public Teams(String nm, String c, String own, double tix, String yr, int champs, String star, int position) {
		name = nm;
		city = c;
		owner = own;
		ticketCost = tix;
		year = yr;
		championships = champs;
		player = star;
		standing = position;
		
		numTeams++; //incrementing numTeams
	}
	//setter for name
	public void setName(String nm) {
		name = nm;
	}
	//setter for city
	public void setCity(String c) {
		city = c;
	}
	//setter for owner
	public void setOwner(String own) {
		owner = own;
	}
	//setter for ticketCost
	public void setTicketCost(double tix) {
		ticketCost = tix;
	}
	//setter for year
	public void setYear(String yr) {
		year = yr;
	}
	//setter for championships
	public void setChampionships(int champs) {
		championships = champs;
	}
	//setter for player
	public void setPlayer(String star) {
		player = star;
	}
	//setter for standing
	public void setStanding(int position) {
		standing = position;
	}
	//getter for name
	public String getName() {
		return name;
	}
	//getter for city
	public String getCity() {
		return city;
	}
	//getter for owner
	public String getOwner() {
		return owner;
	}
	//getter for ticketCost
	public double getTicketCost() {
		return ticketCost;
	}
	//getter for year
	public String getYear() {
		return year;
	}
	//getter for championships
	public int getChampionships() {
		return championships;
	}
	//getter for player
	public String getPlayer() {
		return player;
	}
	//getter for standing
	public int getStanding() {
		return standing;
	}
	//getter for teams
	public static int getNumTeams() {
		return numTeams;
	}
	
	//formating cost of car to money format
	public String formatCost(double cost) {
		DecimalFormat moneyFormat = new DecimalFormat("$0.00");
		return moneyFormat.format(cost);
	}
	
	//user defined toString()
	public String toString() {
		return("The " + city + " " + name + 
				"\nThe owner is " + owner + 
				"\nThe average ticket cost to go to a game is " + formatCost(ticketCost) + 
				"\nThe " + name + " were founded in " + year +
				"\nThey have " + championships + " championships" + 
				"\nThere most notable franchise player is " + player + 
				"\nLast year, the " + name + " placed " + standing + "th overall "
				+ "\n \n******************************************** \n");
	} // end toString
} // end class