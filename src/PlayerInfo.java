import java.io.File;

public class PlayerInfo {
    private String nickname;
    private int points;
    private int[] upgrades;

    PlayerInfo() {
        nickname = "Somebody";
        points = 0;
        upgrades = new int[5];
    }

    PlayerInfo(String nickname) {
        this.nickname = nickname;
        points = 0;
        upgrades = new int[5];
    }

    PlayerInfo(File savefile) {
        // to be updated
    }

    public void click() {
        // todo: apply upgrade to this method
        this.points += 1;
    }

    public int getPoints() {
        return this.points;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return this.nickname;
    }
}
