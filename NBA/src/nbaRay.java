import java.util.Scanner;

public class nbaRay {

		// instantiating an array of teams named library
		Teams[] library;
		//initializing maxTeams of the array
		private final int maxTeams = 30;
		
		// constructor for nbaRay
		// declares array library, an array of Teams with max size as 30 team files
		public nbaRay() {
			library = new Teams[maxTeams];
		}
		
		// declares array library, an array of Teams with num as parameter
		public nbaRay(int num) {
			library = new Teams[num];
		}

		// reads data from text file into Team object
		// Takes scanner object to scan files
		public void readArchive(Scanner scan) {
			String name = "";
			String city = "";
			String owner = "";
			double ticketCost = 0.0;
			String year = "";
			int championships = 0;
			String player = "";
			int standing = 0;

			int i = 0;
			while (scan.hasNext()) { // while there's another line, keep scanning.
										// If no line jump out of while
				name = scan.nextLine(); //scan for name
				city = scan.nextLine(); //scan for city
				owner = scan.nextLine(); // scan for owner
				ticketCost = scan.nextDouble(); // scan for ticketCost
				scan.nextLine(); // need this scan to keep moving to next line.
				year = scan.nextLine(); // scan for year
				championships = scan.nextInt(); // scan for championships
				scan.nextLine(); // need this scan to keep moving to next line.
				player = scan.nextLine(); // scan for next String player
				standing = scan.nextInt(); // scan for next int standing

				if (scan.hasNext()) {// if there is a next like, keep scanning. Next
									// Line will be a string
					scan.nextLine();
				}
				//creating library array  from Teams constructor & fields
				library[i] = new Teams(name, city, owner, ticketCost, year, championships, player, standing);
				i++;

			} // end while
		} // end readArchive

		// Puts together all strings into an array and then calling toString
		public String toString() {
			//assigning getNumTeams to num
			int num = Teams.getNumTeams();
			String words = ""; // initializing String words
			for (int i = 0; i < num; i++) { //library array that prints toString
			
				// if there is not another team, break out of loop.
				// Need this for both for loops for library[i]
				if (library[i] == null) {
					break;
				}
				words += library[i].toString(); // pull toString method for all teams and adding it to words everytime through the for loop
			}
			return (words); // return toString "words"
			
		} // end toString
		
		// method to find team
		public String findTeam(Scanner scan, String teamSearch) {
			String currTeamName = ""; //Current team name from the array
			String teamFound = ""; //Current string value of the team being located
			//Call method readArchive to load the NBA Team details into the library array.
			readArchive(scan);
			//Retrieves the number of NBA Teams
			int num = Teams.getNumTeams();
			
			for (int i = 0; i < num; i++) { //library array that prints toString
				
				// if there is not another team, break out of loop.
				// Need this for both for loops for library[i]
				if (library[i] == null) {
					break;
				}
				
				currTeamName = library[i].getName();		
				/*
				Changes the current NBA team in the array to uppercase and 
				the team be located to uppercase and compares if they are equal.
				If equal the specific team exists and string value is return. 
				*/
			  	if (currTeamName.toUpperCase().equals(teamSearch.toUpperCase()))
			  		teamFound += library[i].toString();
			}
			return teamFound;
		} // end findTeam
		

	} // end class

