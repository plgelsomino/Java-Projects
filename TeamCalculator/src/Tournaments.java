import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Tournaments {
	private String tournName;
	private String tournLoc;
	private String tournStartDate;
	private String tournEndDate;
	private int games;
	private double tournCost;
	
	private static ArrayList<Tournaments> tournys;
	
	private static Scanner scan = new Scanner(System.in);
	
	public Tournaments(String tournName, String tournLoc, String tournStartDate, String tournEndDate, int games, double tournCost) {
		this.tournName = tournName;
		this.tournLoc = tournLoc;
		this.tournStartDate = tournStartDate;
		this.tournEndDate = tournEndDate;
		this.games = games;
		this.tournCost = tournCost;
	}

	public static ArrayList<Tournaments> getTournys() {
		return tournys;
	}

	public void addTournament() {
		System.out.println("What is the tournament name you would like to add?");
		String nm = scan.nextLine();
		
		//calls findTouranment method to see if true or false that name is in ArrayList already
		if(findTournament(nm.toLowerCase())) {
			System.out.println("You already have that tournament entered");
		} else {
			System.out.println("Where is tournament location (Ex. Smithtown, NY)");
			String loc = scan.nextLine();
			System.out.println("What is the start date of the tournament? (xx/xx/xxxx)");
			String sDate = scan.nextLine();
			System.out.println("What is the end date of the tournament? (xx/xx/xxxx)");
			String eDate = scan.nextLine();
			System.out.println("How many guaranteed games are there?");
			int gm = scan.nextInt();	
			scan.nextLine();  // need this to move forward
			System.out.println("What is total tournament cost?");
			double cost = scan.nextDouble();
			scan.nextLine(); // need this to move forward
			
			//Creating new tournament object based on user inputs
			Tournaments newTourny = new Tournaments(nm, loc, sDate, eDate, gm, cost);
			
			//adding new tournament to array list
			tournys.add(newTourny);
			System.out.println(nm + " in " + loc + " was added.");
		}
	}
	
	public boolean findTournament(String name) {
		if(tournys.contains(name.toLowerCase())) {
			System.out.println("Tournament exists");
			return true;
		} else {
			return false;
		}
	}
	
	public void removeTournament() {
		System.out.println("Which tournament would you like to delete? (search by name)");
		String nm = scan.nextLine();
		if(findTournament(nm.toLowerCase())) {
			
			//find element in arraylist to delete the tournament
			
		} else {
			System.out.println("No tournament named " + nm + " in the application");
		}
	}
	
	public void printTournaments(ArrayList<Tournaments> tournys) {
		System.out.println("Here are the tournaments this season: ");
		for (int i = 0; i < tournys.size(); i++) {
			System.out.println(this.getTournName()+ " in " + this.getTournLoc() + 
								"\nStarts " + this.getTournStartDate() + " and ends " + this.getTournEndDate() + 
								"\nGuarantees " + this.getGames() + 
								"\nWith a total cost of: $" + this.getTournCost());
			System.out.println("********************************");
			System.out.println("");
		}
	}
	
	public String getTournName() {
		return tournName;
	}
	public String getTournStartDate() {
		return tournStartDate;
	}
	public String getTournEndDate() {
		return tournStartDate;
	}
	public double getTournCost() {
		return tournCost;
	}

	public static ArrayList<Tournaments> getTournament() {
		return tournys;
	}
	
	public String getTournLoc() {
		return tournLoc;
	}

	public int getGames() {
		return games;
	}

}
