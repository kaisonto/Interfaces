import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String playerName;
    private int hitPoints;
    private int strengthPoints;
    private String weapon;

    public Player(String playerName, int hitPoints, int strengthPoints) {
        this.playerName = playerName;
        this.hitPoints = hitPoints;
        this.strengthPoints = strengthPoints;
        this.weapon = "Katana";
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrengthPoints() {
        return strengthPoints;
    }

    public void setStrengthPoints(int strengthPoints) {
        this.strengthPoints = strengthPoints;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", hitPoints=" + hitPoints +
                ", strengthPoints=" + strengthPoints +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,this.playerName);
        values.add(1,""+this.hitPoints);
        values.add(2,""+this.strengthPoints);
        values.add(3,this.weapon);
        return null;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0)
            this.playerName = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strengthPoints = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
    }
}