import java.util.ArrayList;

public class Player {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNum;
	private double amtDue;
	private double amtPaid;
	
	public Player(String firstName, String lastName, String email, String phoneNum, double amtDue, double amtPaid) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.amtDue = amtDue;
		this.amtPaid = amtPaid;
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
}
