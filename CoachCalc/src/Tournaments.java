import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Tournaments {
	private String tournName;
	private String tournLoc;
	private String tournHostTeam;
	private String tournStartDate;
	private String tournEndDate;
	private int games;
	private double tournCost;
	private int gameNum;
	private String startDate;
	private String endDate;
	
	private static ArrayList<Tournaments> tournys;
	
	private static Scanner scan = new Scanner(System.in);
	
	public Tournaments(String tournName, String tournLoc, String tournHostTeam, String tournStartDate, String tournEndDate, int games, double tournCost) {
		this.tournName = tournName;
		this.tournLoc = tournLoc;
		this.tournHostTeam = tournHostTeam;
		this.tournStartDate = tournStartDate;
		this.tournEndDate = tournEndDate;
		this.games = games;
		this.tournCost = tournCost;
		this.tournys = new ArrayList<Tournaments>(); 
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
			System.out.println("Who is hosting the tournament? (Ex. Long Island Bandits Baseball)");
			String host = scan.nextLine();
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
			Tournaments newTourny = new Tournaments(nm, loc, host, sDate, eDate, gm, cost);
			
			//adding new tournament to array list
			if(tournys.add(newTourny)) {
			System.out.println(nm + " in " + loc + " was added.");
			} else {
				System.out.println("Tournament add was unsucessful...");
			}
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

	public void setTournName(String tournName) {
		this.tournName = tournName;
	}

	public String getTournLoc() {
		return tournLoc;
	}

	public void setTournLoc(String tournLoc) {
		this.tournLoc = tournLoc;
	}

	public String getTournHostTeam() {
		return tournHostTeam;
	}

	public void setTournHostTeam(String tournHostTeam) {
		this.tournHostTeam = tournHostTeam;
	}

	public String getTournStartDate() {
		return tournStartDate;
	}

	public void setTournStartDate(String tournStartDate) {
		this.tournStartDate = tournStartDate;
	}

	public String getTournEndDate() {
		return tournEndDate;
	}

	public void setTournEndDate(String tournEndDate) {
		this.tournEndDate = tournEndDate;
	}

	public int getGames() {
		return games;
	}

	public void setGames(int games) {
		this.games = games;
	}

	public double getTournCost() {
		return tournCost;
	}

	public void setTournCost(double tournCost) {
		this.tournCost = tournCost;
	}

	public int getGameNum() {
		return gameNum;
	}

	public void setGameNum(int gameNum) {
		this.gameNum = gameNum;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public static Scanner getScan() {
		return scan;
	}

	public static void setScan(Scanner scan) {
		Tournaments.scan = scan;
	}

	public static void setTournys(ArrayList<Tournaments> tournys) {
		Tournaments.tournys = tournys;
	}
	
	

}
