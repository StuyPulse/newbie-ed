package robot;
public abstract class AbstractRobot implements Robot {
    private String teamName;
    private int teamNumber;
    public AbstractRobot(String teamName, int teamNumber) {
        this.teamName = teamName;
        this.teamNumber = teamNumber;
    }
    // Implementing methods from the Robot interface
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTeamNumber() {
        return teamNumber;
    }
}