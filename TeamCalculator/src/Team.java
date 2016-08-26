import java.util.ArrayList;

public class Team {
	private String seasonName;
	private double umpfees;
	private double fieldFees;
	private double ballFees;
	private double leagueFees;
	private double coacheFees;
	private double uniformFees;

	private ArrayList<Player> player;
	private ArrayList<Tournaments> tournament;
	
	
	public Team(String seasonName, double umpfees, double fieldFees, double ballFees, double leagueFees,
			double coacheFees, double uniformFees) {
		this.seasonName = seasonName;
		this.umpfees = umpfees;
		this.fieldFees = fieldFees;
		this.ballFees = ballFees;
		this.leagueFees = leagueFees;
		this.coacheFees = coacheFees;
		this.uniformFees = uniformFees;
	}
	public String getSeasonName() {
		return seasonName;
	}
	public double getUmpfees() {
		return umpfees;
	}
	public double getFieldFees() {
		return fieldFees;
	}
	public double getBallFees() {
		return ballFees;
	}
	public double getLeagueFees() {
		return leagueFees;
	}
	public double getCoacheFees() {
		return coacheFees;
	}
	public double getUnifromFees() {
		return coacheFees;
	}
	public double getUniformFees() {
		return uniformFees;
	}
	public ArrayList<Player> getPlayer() {
		return player;
	}
	public ArrayList<Tournaments> getTournament() {
		return tournament;
	}
	
}
