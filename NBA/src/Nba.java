//********************************************************************
//  Nba.java
//  Peter Gelsomino, James Green, Rawle Jones
//  5/5/2015
//  CS 504
//********************************************************************

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
public class Nba {

    public static void main(String[] args) throws IOException {
    	
    	int term = 10;  // initializing term to 10 to enter while statement
    	String currTeamSearch; // initializing currTeamSearch for search case
    	
    	// opening NBA txt file
    	File basketball = new File("NBA.txt");
    	Scanner fileScan = new Scanner(basketball);  
    	
    	// creating an array of nbaRay called archive
    	nbaRay archive = new nbaRay();
    	
    	//menu that comes up when the user starts the program.
    	//only comes up once because its out of the while loop
    	 System.out.println("Welcome to the NBA Quick Fix Program!");
    	    System.out.println("Lets get started. Enter the corresponding number to which team " + 
    	                         "or league you would like to know more about.");
    	    System.out.println("OR get crazy and add another NBA team.");
    	    System.out.println(" ");
    	    System.out.println("****************************************************************** ");
    	    System.out.println(" ");
    	    
    //Go through while loop and present menu options
    //Until the user enters 0, where term because 0 and jumps out of while loop
    while (term != 0) {

    //Set up scanner for user Input;
    Scanner userScan = new Scanner(System.in);

    // Menu for Program that user can pick from
    System.out.println(" 1) NBA League Information");
    System.out.println(" 2) Add a Team");
    System.out.println(" 3) Search for a Specific Team");
    System.out.println(" 4) See All Teams");
    System.out.println(" 5) Take a Quiz");
    System.out.println(" 0) Exit Program");
    
    // variable ans assigned to userScan coming from user input
    int ans = userScan.nextInt();
    
    // setting up switch statement to get users choice.
    switch(ans) {
    
    	//user chose to exit program
    	case 0: {
    		// user picked zero which conflicts with while statement condition and jumps out of program
    		term = 0;
    	} //end case 0
    break;
    
    	// user chose to see NBA League Information
    	case 1: {
    		// open file to League Information
  		  File info = new File("League.txt");
  		  Scanner look = new Scanner(info);
  		
  		  // Creates a blank League Object l
  		  League l = new League();
  		  
  		  // calling readLeague method on bottom that takes information from file and reads info into League object for League
  		  readLeague(look,l);
  		  
  		  // prints league information using toString method
  		  System.out.println(l);
  		  System.out.println(" "); //just for nicer formating		
    	} // end case 1
    break;
    
    	// User choose to Add a Team
    	case 2: {
    		//initializing fields user will need to fill in text file
    		String name = "";
    		String city = "";
    		String owner = "";
    		double ticketCost = 0.0;
    		String year = "";
    		int championships = 0;
    		String player = "";
    		int standing = 0;
    			
    			// setting up a scanner for the user to enter into keyboard
            	Scanner user = new Scanner(System.in);
            	
            	// Little message that shows up because user chose to enter a team
            	System.out.println("Welcome and Congratulations on Adding a New Team to the NBA!");
            	System.out.println("************************************************************");
            	System.out.println("");
            	
            	//Program asks user to fill in the data that the program currently runs with in order
            	System.out.println("Whats the Team Nick Name?");
            	name = user.nextLine(); 
            	System.out.println("What City is the " + name + " located in?");
            	city = user.nextLine();
            	System.out.println("Who owns the " + city + " " + name + " ?");
            	owner = user.nextLine();
            	System.out.println("How much on average is " + owner + " charging per game?");
            	ticketCost = user.nextDouble();
            	System.out.println("whoa, they better be good at that price!");
            	System.out.println(" ");
            	System.out.println("What year were they founded?");
            	user.nextLine();// nextDouble on previous line doesn't push scanner to next line, so need user to user.nextLine()
            	year = user.nextLine();
            	System.out.println("How Many Championships do the " + name + " have?");
            	championships = user.nextInt();
            	user.nextLine(); // nextInt on previous line doesn't push scanner to next line, so need user to user.nextLine()
            	System.out.println("Who's is the Star Player?");
            	player = user.nextLine();
            	System.out.println("What position did they end up last year? (Enter a Number from 0 - 30)");
            	standing = user.nextInt();
            	
            	// Initializing txt to NBA.txt file
    		    String txt ="NBA.txt";
    		    // initializing PrintWriting to null and calling it add.  When there is an open line, start adding it there
    		    PrintWriter add = null; 
    		    // setting up file writer object.  What user enters will go into file with parameters txt and true
    		    FileWriter edit = new FileWriter(txt, true);
    		    
    		    // all answers gotten from user will add using these lines and printing it into the file
    		    add = new PrintWriter(edit);
    		    add.println(name); // add name
    		    add.println(city); // add city
    		    add.println(owner); // add owner
    		    add.println(ticketCost); // add ticketCost
    		    add.println(year); // add year
    		    add.println(championships); // add championships
    		    add.println(player); // add player
    		    add.println(standing); // add last years position
    		    System.out.println(""); // just for formatting purposes

    		    // closing the PrintWriter
                add.close();
                
                // messages to tell the user that they are done answering questions and his team was added
                System.out.println("Wow, that was a lot of questions but way to go!");
                System.out.println("Now the " + name + " has been added to the NBA collection of teams");
        	
        } // end case 2
    break;
    
    	// user chose to find a specific team in the text file
    	case 3: {

    	    //Open file with NBA data and setting up scanner to read it
    		File ray = new File("NBA.txt");
    		Scanner read = new Scanner(ray);
    		System.out.println("What NBA Team are you interested in locating?");
    		System.out.println("Enter the Team Name: ");
    		System.out.println("");
    		// variable ansSearch assigned to userScan coming from user input
    	    String ansSearch = userScan.next();
    	    currTeamSearch = ansSearch.toUpperCase(); // changes team search user enters to upper case
    	    ansSearch = archive.findTeam(fileScan , ansSearch); //calling findTeam method with parameters (fileScan and ansSearcg)
    	    
    	    if ( ansSearch != ""){ // if users team name matches team name in txt file it will pull the information for the ansSeacrch
    	    	System.out.println("Current team details: \n" + ansSearch );
    	        System.out.println("");  }
    	    else{
    	    	System.out.println("NBA team: " + currTeamSearch + " doesn't exist currently - maybe in the future!" ); // name doesn't match 
    	        System.out.println("");  // for formatting
    	        }

    		
    	} // end case 3
    break;
    	
    	//User chose to see all teams
    	case 4: {
    		// creating new nbaRay object named archive
    		nbaRay lib = new nbaRay();

    	    //Open file with NBA data and setting up scanner to read it
    	    File ray = new File("NBA.txt");
    	    Scanner read = new Scanner(ray);

    	    //read data file into array of Teams
    	    lib.readArchive(read);
    	    
    	    //print toString method to display all Teams data
    	    System.out.println(lib);
    	    System.out.println(" "); // for formatting
    	    
        }
    break;
    
    	// user chose to do the quiz
    	case 5: {
    		// creating scanner for user to enter to keyboard
    		Scanner keyboard = new Scanner(System.in);
    		String guess = ""; // initializing user entered string called guess
    		
    		// continue to run program unless user enters exit
    		while (!"exit".equals(guess)) {	
    			System.out.println("Welcome to the NBA Quiz! Lets see how big of a fan you are");
    			System.out.println(" ");
    			//First question
    			System.out.println("Who is the all time scoring leader? (Enter exit to go back to menu)");
    			guess = keyboard.nextLine();
    			
    			// if strings are the same the user is right
    			if (guess.toLowerCase().equals("exit")) {
    				break;
    			} else if (guess.toLowerCase().equals("wilt chamberlain")) {
    			System.out.println("Wow, great job!");
    			System.out.println("");
    				} else {
    			System.out.println("Sorry! The answer is wilt chamberlain.");
    			System.out.println("");
    		}
    			// next question
    		System.out.println("What team did Kobe Bryant originally get drafted by? (Enter exit to go back to menu)");
    		guess = keyboard.nextLine();
    		
    		/* first if checks is user enters "exit", it will break out of case and go back to menu
    		 * second if checks if answer is correct
    		 * else the user enetered wrong answer and will move onto next question
    		 */
    		if (guess.toLowerCase().equals("exit")) {
				break;
			} else if (guess.toLowerCase().equals("hornets")) {
    			System.out.println("Wow, great job!");
    			System.out.println("");
    		} else {
    			System.out.println("Sorry! The answer is the hornets");
    			System.out.println("");
    		}
    		System.out.println("What player won the most NBA Championships? (Enter exit to go back to menu)");
    		guess = keyboard.nextLine();
    		
    		if (guess.toLowerCase().equals("exit")) {
				break;
			} else if (guess.toLowerCase().equals("bill russel")) {
    			System.out.println("Wow, great job!");
    			System.out.println("");
    		} else {
    			System.out.println("Sorry! The answer is bill russel");
    			System.out.println("");
    		}
    		System.out.println("What team won the Larry O'Brien Championship Trophy last year? (Enter exit to go back to menu)");
    		guess = keyboard.nextLine();
    		
    		if (guess.toLowerCase().equals("exit")) {
				break;
			} else if (guess.toLowerCase().equals("spurs")) {
    			System.out.println("Wow, great job!");
    			System.out.println("");
    		} else {
    			System.out.println("Sorry! The answer is the spurs");
    			System.out.println("");
    		}
    		
    		System.out.println("What team has the most NBA Championships? (Enter exit to go back to menu)");
    		guess = keyboard.nextLine();
    		
    		if (guess.toLowerCase().equals("exit")) {
				break;
			} else if (guess.toLowerCase().equals("celtics")) {
    			System.out.println("Wow, great job!");
    			System.out.println("");
    		} else {
    			System.out.println("Sorry! The answer is the celtics");
    			System.out.println("");
    		}
    		System.out.println("Which player has the most points scored in the 2015 playoffs? (Enter exit to go back to menu)");
    		guess = keyboard.nextLine();
    		
    		if (guess.toLowerCase().equals("exit")) {
				break;
			} else if (guess.toLowerCase().equals("stephen curry")) {
    			System.out.println("Wow, great job!");
    			System.out.println("");
    		} else {
    			System.out.println("Sorry! The answer is the stephen curry");
    			System.out.println("");
    		}
    		
    		System.out.println("Great Job you Finished the Quiz!");
    		System.out.println(" "); // for formatting
    		
    		} // end while
    		
    	}
    	break;
    // If user doesn't choose any of the options then this default error message occurs
    default: 
    System.out.println("Thats not an Option. C'mon your better than that!");
            
    } // end switch statement
   } // end while

	// user exited program to get final message below
	System.out.println("Thank You! Now go outside and shoot some hoops.");

 }

    	// method reads from League.txt file and puts data into League object
 	  public static void readLeague(Scanner look, League l) {
 		          
 			  l.setCommissioner(look.nextLine()); // reads line for Commissioners Name
 			  l.setFoundYear(look.nextLine()); // reads line for founded year
 			  l.setNumGames(look.nextInt()); // reads integer for Number of Games
 			  l.setSalary(look.nextDouble()); // reads double for salary cap
 			  l.setNumTeams(look.nextInt()); // reads integer for number of teams
 			  l.setNumRefs(look.nextInt()); // reads integer for number of teams
 			  
 		 if (look.hasNext()) {  // if file has next Line go get next league name
 			 	look.nextLine();
 			 	
 			 	System.out.println(" "); // for formatting
 		 
 		 } // end if
 	  } // end readLeague() 	
    	
    } // end class 