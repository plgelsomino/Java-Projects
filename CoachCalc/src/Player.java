import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	private String firstName;
	private String lastName;
	private int number;
	private String email;
	private String phoneNum;
	private double amtDue;
	private double amtPaid;
	
	private static ArrayList<Player> players;
	private static Scanner scan = new Scanner(System.in);
	
	public Player(String firstName, String lastName, int number, String email, String phoneNum, double amtPaid) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.email = email;
		this.phoneNum = phoneNum;
		this.amtDue = 3500;
		this.amtPaid = amtPaid;
		this.players = new ArrayList<Player>();
	}
	
	public void addPlayer() {
		System.out.println("What is players first name?");
		String fName = scan.nextLine();
		System.out.println("What is " + fName + " last name?");
		String lName = scan.nextLine();
		
			// if first name and last name are not found, add player 
			if(!findPlayer(fName, lName)) {
				System.out.println("What is " + fName + " " + lName + " jersey number?");
				int jerNum = scan.nextInt();
				System.out.println("What is " + fName + " " + lName + " email?");
				String eMail = scan.nextLine();
				System.out.println("What is " + fName + " " + lName + " phoneNum?");
				String phoneNum = scan.nextLine();
				
				//Gather information from user and add player
				Player p = new Player(fName, lName, jerNum, eMail, phoneNum, amtPaid);
				
					if(players.add(p)) {
						System.out.println(fName + " " + lName + " was added");
					} else {
						System.out.println("Player could not be added");
					}
			// findPLayer returns true, player exists can't add
			} else {
				System.out.println("Player already exists.");
			}
	}
	
	public void removePlayer() {
		System.out.println("What is the first name of player you like to delete? (search by name)");
		String fnm = scan.nextLine();
		System.out.println("What is the last name of player you like to delete? (search by name)");
		String lnm = scan.nextLine();
		if(findPlayer(fnm.toLowerCase(), lnm.toLowerCase())) {

			//find element in arraylist to delete the tournament
			
		} else {
			System.out.println("No player named " + fnm + " " + lnm + " in the application");
		}
	}

	public boolean findPlayer(String fName, String lName) {
		if(players.contains(fName.toLowerCase()) && players.contains(lName.toLowerCase())) {
			System.out.println("Player exists");
			return true;
		} else {
			return false;
		}
	}	
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public double getAmtDue() {
		return amtDue;
	}
	public double getAmtPaid() {
		return amtPaid;
	}
	
	public Player queryPlayer(Player player) {
		return player;
	}

	public int getNumber() {
		return number;
	}

}
