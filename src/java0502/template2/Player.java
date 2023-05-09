package java0502.template2;

public class Player {
    private PlayerLevel level;
    public Player(){
        level = new BeginnerLevel();
        level.showLeveMessage();
    }
    public PlayerLevel getLevel(){
        return level;
    }
    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLeveMessage();
    }
    public void play(int count) {
        level.go(count);
    }
}